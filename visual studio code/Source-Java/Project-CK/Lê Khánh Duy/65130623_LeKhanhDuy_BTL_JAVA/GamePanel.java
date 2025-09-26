import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / (UNIT_SIZE * UNIT_SIZE);
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    public GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        if (running) {
            // Vẽ quả táo (hình trái tim cách điệu)
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.RED);
            g2.fillOval(appleX, appleY, UNIT_SIZE / 2, UNIT_SIZE / 2);
            g2.fillOval(appleX + UNIT_SIZE / 2, appleY, UNIT_SIZE / 2, UNIT_SIZE / 2);
            Polygon triangle = new Polygon();
            triangle.addPoint(appleX, appleY + UNIT_SIZE / 2);
            triangle.addPoint(appleX + UNIT_SIZE, appleY + UNIT_SIZE / 2);
            triangle.addPoint(appleX + UNIT_SIZE / 2, appleY + UNIT_SIZE);
            g2.fillPolygon(triangle);
    
            // Vẽ rắn đẹp hơn
            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRoundRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE, 15, 15);
    
                    // Vẽ mắt
                    g.setColor(Color.white);
                    g.fillOval(x[i] + 5, y[i] + 5, 5, 5);
                    g.fillOval(x[i] + UNIT_SIZE - 10, y[i] + 5, 5, 5);
                    g.setColor(Color.black);
                    g.fillOval(x[i] + 6, y[i] + 6, 2, 2);
                    g.fillOval(x[i] + UNIT_SIZE - 9, y[i] + 6, 2, 2);
                } else {
                    float hue = (float) i / bodyParts;
                    g.setColor(Color.getHSBColor(hue, 1.0f, 1.0f));
                    g.fillRoundRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE, 10, 10);
                }
            }
    
            // Hiển thị điểm
            g.setColor(Color.red);
            g.setFont(new Font("Ink Free", Font.BOLD, 40));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Score: " + applesEaten, 
                (SCREEN_WIDTH - metrics.stringWidth("Score: " + applesEaten)) / 2, g.getFont().getSize());
        } else {
            gameOver(g);
        }
    }
    

    public void newApple() {
        appleX = random.nextInt((SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
        appleY = random.nextInt((SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
    }

    public void move() {
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        switch (direction) {
            case 'U': y[0] -= UNIT_SIZE; break;
            case 'D': y[0] += UNIT_SIZE; break;
            case 'L': x[0] -= UNIT_SIZE; break;
            case 'R': x[0] += UNIT_SIZE; break;
        }

        // Xuyên tường
        if (x[0] < 0) x[0] = SCREEN_WIDTH - UNIT_SIZE;
        if (x[0] >= SCREEN_WIDTH) x[0] = 0;
        if (y[0] < 0) y[0] = SCREEN_HEIGHT - UNIT_SIZE;
        if (y[0] >= SCREEN_HEIGHT) y[0] = 0;
    }

    public void checkApple() {
        if (x[0] == appleX && y[0] == appleY) {
            bodyParts++;
            applesEaten++;
            newApple();
            adjustSpeed();
        }
    }

    public void checkCollisions() {
        for (int i = bodyParts; i > 0; i--) {
            if ((x[0] == x[i]) && (y[0] == y[i])) {
                running = false;
            }
        }

        if (!running) {
            timer.stop();
        }
    }

    public void gameOver(Graphics g) {
    g.setColor(Color.red);
    g.setFont(new Font("Arial", Font.BOLD, 40));
    FontMetrics metrics = getFontMetrics(g.getFont());
    g.drawString("Game Over",
        (SCREEN_WIDTH - metrics.stringWidth("Game Over")) / 2,
        SCREEN_HEIGHT / 2 - 50);

    // Hiển thị điểm của người chơi
    g.setFont(new Font("Arial", Font.PLAIN, 20));
    g.setColor(Color.white);
    g.drawString("Điểm của bạn: " + applesEaten,
        (SCREEN_WIDTH - 200) / 2,
        SCREEN_HEIGHT / 2);

    // Hiển thị điểm cao nhất
    int currentHigh = HighScoreManager.getHighScore();
    g.drawString("Kỷ lục: " + currentHigh + " điểm",
        (SCREEN_WIDTH - 200) / 2,
        SCREEN_HEIGHT / 2 + 30);

    // Nếu đạt kỷ lục mới
    if (applesEaten > currentHigh) {
        HighScoreManager.saveHighScore(applesEaten);
        JOptionPane.showMessageDialog(this, "🎉 Kỷ lục mới: " + applesEaten + " điểm!");
    }

    // Hộp thoại chọn hành động tiếp theo
    int option = JOptionPane.showOptionDialog(this,
            "Bạn có muốn chơi lại không?",
            "Game Over",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            new String[]{"Chơi lại", "Về menu"},
            "Chơi lại");

    if (option == JOptionPane.YES_OPTION) {
        // Đóng game hiện tại và tạo game mới
        SwingUtilities.getWindowAncestor(this).dispose();
        new Game();
    } else {
        SwingUtilities.getWindowAncestor(this).dispose();
        new Menu(); // Mở lại menu
    }
}

public void restartGame() {
        bodyParts = 6;
        applesEaten = 0;
        direction = 'R';
        for (int i = 0; i < x.length; i++) {
            x[i] = 0;
            y[i] = 0;
        }
        startGame();
    }
    private void adjustSpeed() {
        int newDelay = DELAY - applesEaten * 2;
        if (newDelay < 40) newDelay = 40; // tốc độ tối đa
        timer.setDelay(newDelay);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkApple();
            checkCollisions();
        }
        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') direction = 'L';
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') direction = 'R';
                    break;
                case KeyEvent.VK_UP:
                    if (direction != 'D') direction = 'U';
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U') direction = 'D';
                    break;
            }
        }
    }
}
