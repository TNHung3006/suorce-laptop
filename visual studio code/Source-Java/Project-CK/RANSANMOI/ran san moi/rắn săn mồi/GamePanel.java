import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.List;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600; 
    static final int SCREEN_HEIGHT = 500; 
    static final int UNIT_SIZE = 25; 
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / (UNIT_SIZE * UNIT_SIZE); // Tổng số ô vuông có thể có trên màn hình.
    static int DELAY = 120; 
    private Scoreboard scoreboard = new Scoreboard(); // Đối tượng để quản lý bảng xếp hạng.
    private String playerName = "Unknown"; // Tên người chơi hiện tại, mặc định là "Unknown".
    private JDialog scoreDialog; // Đối tượng JDialog để hiển thị bảng xếp hạng.
    private boolean scoreAdded = false; // Cờ để đảm bảo điểm chỉ được thêm vào bảng xếp hạng một lần sau mỗi game over.

    final int x[] = new int[GAME_UNITS]; // Mảng lưu trữ tọa độ X của các đoạn thân rắn.
    final int y[] = new int[GAME_UNITS]; // Mảng lưu trữ tọa độ Y của các đoạn thân rắn.
    int bodyParts = 6; // Số lượng đoạn thân ban đầu của rắn.
    int applesEaten; // Số quả táo đã ăn (điểm số).
    int appleX; // Tọa độ X của quả táo.
    int appleY; // Tọa độ Y của quả táo.
    char direction = 'R'; // Hướng di chuyển hiện tại của rắn ('U', 'D', 'L', 'R' - Up, Down, Left, Right).
    boolean running = false; // Cờ cho biết trò chơi đang chạy hay không.
    Timer timer; // Đối tượng Timer để điều khiển tốc độ trò chơi.
    Random random; // Đối tượng Random để tạo vị trí ngẫu nhiên cho táo.
    JButton playAgainButton; // Nút "Chơi lại".
    JButton exitButton; // Nút "Thoát game".
    JButton startButton; // Nút "Bắt Đầu".
    JButton showScoreButton; // Nút "Rank" (hiển thị bảng xếp hạng).
    boolean gameOver = false; // Cờ cho biết trò chơi đã kết thúc hay chưa.
    boolean gameStarted = false; // Cờ cho biết trò chơi đã được bắt đầu từ màn hình menu hay chưa.
    private BufferedImage backgroundImage; // Đối tượng để lưu trữ hình ảnh nền.
    private int eatCounter = 0; // Bộ đếm số táo đã ăn, dùng để tăng tốc độ.

    GamePanel() {
        random = new Random(); // Khởi tạo đối tượng Random.
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT)); // Đặt kích thước ưu tiên cho panel.
        this.setBackground(Color.black); // Đặt màu nền của panel là đen.
        this.setFocusable(true); // Cho phép panel nhận sự kiện bàn phím.
        this.addKeyListener(new MyKeyAdapter()); // Thêm bộ lắng nghe sự kiện bàn phím tùy chỉnh.

        // Load background image
        try {
            backgroundImage = ImageIO.read(new File("img/background.jpg")); // Tải ảnh nền từ đường dẫn.
        } catch (IOException e) {
            System.out.println("Không thể tải hình ảnh: " + e.getMessage()); // In thông báo lỗi nếu không tải được.
            backgroundImage = null; // Đặt thành null nếu tải thất bại.
        }

        addStartButton(); // Thêm nút "Bắt Đầu" vào panel.
        addRankButton(); // Thêm nút "Rank" vào panel.
    }

    public void addStartButton() {
        startButton = new JButton("Bắt Đầu");
        startButton.setFocusable(false);
        startButton.setFont(new Font("Arial", Font.BOLD, 20));
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get player name before starting the game
                playerName = JOptionPane.showInputDialog(GamePanel.this, "Nhập tên của bạn:", "Nhập tên");
                if (playerName == null || playerName.trim().isEmpty()) {
                    playerName = "Unknown";
                }
                gameStarted = true;
                remove(startButton);
                remove(showScoreButton); // Remove the Rank button as well
                startGame();
                requestFocusInWindow();
                scoreAdded = false;
            }
        });

        int buttonWidth = 150;
        int buttonHeight = 40;
        int xPosition = (SCREEN_WIDTH - buttonWidth) / 2;
        int yPosition = SCREEN_HEIGHT / 3; // Position in place of "Rắn Săn Mồi"

        startButton.setBounds(xPosition, yPosition, buttonWidth, buttonHeight);
        add(startButton);
        repaint();
    }

    public void addRankButton() {
        showScoreButton = new JButton("Rank");
        showScoreButton.setFocusable(false);
        showScoreButton.setFont(new Font("Arial", Font.BOLD, 20));
        showScoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showScoreDialog();
            }
        });

        int buttonWidth = 150;
        int buttonHeight = 40;
        int xPosition = (SCREEN_WIDTH - buttonWidth) / 2;
        int yPosition = SCREEN_HEIGHT / 3 + 50; // Position below the Start button

        showScoreButton.setBounds(xPosition, yPosition, buttonWidth, buttonHeight);
        add(showScoreButton);
        repaint();
    }

    public void startGame() {
        newApple();
        running = true;
        direction = 'R';
        bodyParts = 6;
        applesEaten = 0;
        eatCounter = 0; // Reset the counter when starting a new game
        for (int i = 0; i < bodyParts; i++) {
            x[i] = 0;
            y[i] = 0;
        }
        timer = new Timer(DELAY, this);
        timer.start();
        gameOver = false;
        if (playAgainButton != null) {
            remove(playAgainButton);
        }
        if (exitButton != null) {
            remove(exitButton);
        }
        if (showScoreButton != null) {
            remove(showScoreButton);
        }
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        // Vẽ background image
        if (backgroundImage != null && !gameStarted) {
            g.drawImage(backgroundImage, 0, 0, SCREEN_WIDTH, SCREEN_HEIGHT, this);
        }
        else {
            g.setColor(Color.black);
            g.fillRect(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);
        }

        if (!gameStarted) {
           // Remove the "Rắn Săn Mồi" text
        }
        else if (running) {
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.green.darker());
                    g.fillRoundRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE, 10, 10);

                    // Draw eyes
                    g.setColor(Color.white);
                    int eyeSize = UNIT_SIZE / 5;
                    int eyeOffset = UNIT_SIZE / 3;
                    g.fillOval(x[i] + eyeOffset, y[i] + eyeOffset, eyeSize, eyeSize); // Left eye
                    g.fillOval(x[i] + 2 * eyeOffset, y[i] + eyeOffset, eyeSize, eyeSize); // Right eye

                } else if (i == bodyParts - 1) {
                    // Draw the tail with rounded corners
                    g.setColor(Color.green);
                    g.fillRoundRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE, 10, 10);
                }
                else {
                    // Generate a random color for each body segment
                    float hue = random.nextFloat();
                    float saturation = 0.9f;
                    float brightness = 0.9f;
                    Color randomColor = Color.getHSBColor(hue, saturation, brightness);
                    g.setColor(randomColor);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
            }

            g.setColor(Color.white);
            g.setFont(new Font("Inter", Font.BOLD, 20));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Điểm: " + applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Điểm: " + applesEaten)) / 2, g.getFont().getSize());

        } else {
            gameOver(g);
        }
    }

    public void newApple() {
        appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
        appleY = random.nextInt((int) (SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
    }

    public void move() {

        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        switch (direction) {
            case 'U':
                y[0] = y[0] - UNIT_SIZE;
                break;
            case 'D':
                y[0] = y[0] + UNIT_SIZE;
                break;
            case 'L':
                x[0] = x[0] - UNIT_SIZE;
                break;
            case 'R':
                x[0] = x[0] + UNIT_SIZE;
                break;
        }

    }

    public void checkApple() {
        if ((x[0] == appleX) && (y[0] == appleY)) {
            bodyParts++;
            applesEaten++;
            eatCounter++; // Increment the counter
            newApple();

            if (eatCounter % 3 == 0) {
                increaseSpeed(); // Call the method to increase speed every 5 apples
            }
        }
    }

    public void checkCollisions() {
        // Kiểm tra nếu đầu rắn va chạm với thân
        for (int i = bodyParts; i > 0; i--) {
            if ((x[0] == x[i]) && (y[0] == y[i])) {
                running = false;
            }
        }

        // Kiểm tra nếu đầu rắn chạm vào biên trái
        if (x[0] < 0) {
            x[0] = SCREEN_WIDTH - UNIT_SIZE; // Xuất hiện ở biên phải
        }
        // Kiểm tra nếu đầu rắn chạm vào biên phải
        if (x[0] >= SCREEN_WIDTH) {
            x[0] = 0; // Xuất hiện ở biên trái
        }
        // Kiểm tra nếu đầu rắn chạm vào biên trên
        if (y[0] < 0) {
            y[0] = SCREEN_HEIGHT - UNIT_SIZE; // Xuất hiện ở biên dưới
        }
        // Kiểm tra nếu đầu rắn chạm vào biên dưới
        if (y[0] >= SCREEN_HEIGHT) {
            y[0] = 0; // Xuất hiện ở biên trên
        }

        if (!running) {
            timer.stop();
        }
    }

    public void gameOver(Graphics g) {
        timer.stop();
        running = false;

        // Display Score
        g.setColor(Color.white);
        g.setFont(new Font("Inter", Font.BOLD, 20));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("Điểm: " + applesEaten, (SCREEN_WIDTH - metrics1.stringWidth("Điểm: " + applesEaten)) / 2, g.getFont().getSize());

        // Game Over text
        g.setColor(Color.red);
        g.setFont(new Font("Inter", Font.BOLD, 75));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("Game Over", (SCREEN_WIDTH - metrics2.stringWidth("Game Over")) / 2, SCREEN_HEIGHT / 2);

        // Add "Bảng Xếp Hạng" button
        showScoreButton = new JButton("Rank");
        showScoreButton.setFocusable(false);
        showScoreButton.setFont(new Font("Arial", Font.BOLD, 20));
        showScoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showScoreDialog();
            }
        });

        playAgainButton = new JButton("Chơi lại");
        playAgainButton.setFocusable(false);
        playAgainButton.setFont(new Font("Arial", Font.BOLD, 20));
        playAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetGame();
            }
        });

        exitButton = new JButton("Thoát game");
        exitButton.setFocusable(false);
        exitButton.setFont(new Font("Arial", Font.BOLD, 20));
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Calculate the center position for the buttons
        int buttonWidth = 150;
        int buttonHeight = 40;
        int xPosition = (SCREEN_WIDTH - buttonWidth) / 2;
        int yShowScore = (SCREEN_HEIGHT / 2) + 100;
        int yPlayAgain = (SCREEN_HEIGHT / 2) + 150;
        int yExit = (SCREEN_HEIGHT / 2) + 200;

        showScoreButton.setBounds(xPosition, yShowScore, buttonWidth, buttonHeight);
        playAgainButton.setBounds(xPosition, yPlayAgain, buttonWidth, buttonHeight);
        exitButton.setBounds(xPosition, yExit, buttonWidth, buttonHeight);

        add(showScoreButton);
        add(playAgainButton);
        add(exitButton);

        gameOver = true;
    }

    private void showScoreDialog() {
        // Add the score before showing the dialog
        if (!scoreAdded) {
            scoreboard.addScore(playerName, applesEaten);
            scoreAdded = true;
        }

        if (scoreDialog == null) {
            scoreDialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Bảng Xếp Hạng", true);
            scoreDialog.setSize(300, 400);
            scoreDialog.setLayout(new BorderLayout());

            JPanel scorePanel = new JPanel();
            scorePanel.setLayout(new BoxLayout(scorePanel, BoxLayout.Y_AXIS));
            List<ScoreEntry> topScores = scoreboard.getTopScores();
            int rank = 1;
            for (ScoreEntry scoreEntry : topScores) {
                JLabel scoreLabel = new JLabel(String.format("%d. %s - %d", rank, scoreEntry.getPlayerName(), scoreEntry.getScore()));
                scoreLabel.setFont(new Font("Arial", Font.BOLD, 16));
                scoreLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
                scorePanel.add(scoreLabel);
                rank++;
            }

            JScrollPane scrollPane = new JScrollPane(scorePanel);
            scoreDialog.add(scrollPane, BorderLayout.CENTER);

            JButton closeButton = new JButton("Đóng");
            closeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    scoreDialog.dispose();
                }
            });
            JPanel buttonPanel = new JPanel();
            buttonPanel.add(closeButton);
            scoreDialog.add(buttonPanel, BorderLayout.SOUTH);
            scoreDialog.setLocationRelativeTo(null);
        }

        scoreDialog.setVisible(true);
    }

    public void resetGame() {
        gameStarted = true;
        startGame();
        scoreAdded = false; // Reset scoreAdded here!
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running && gameStarted) {
            move();
            checkApple();
            checkCollisions();
        }
        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
             if (gameOver || !gameStarted) return;
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (direction != 'D') {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U') {
                        direction = 'D';
                    }
                    break;
            }
        }
    }

    public void increaseSpeed() {
        if (DELAY > 10) { // Prevent DELAY from becoming too small
            DELAY -= 5; // Decrease delay by 5 milliseconds
            timer.stop();
            timer = new Timer(DELAY, this);
            timer.start();
        }
    }
}