import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    public Menu() {
        setTitle("Menu - Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600);
        setLocationRelativeTo(null);

        // Ảnh nền
        BackgroundPanel background = new BackgroundPanel("images/background.jpg");
        background.setLayout(new GridBagLayout());
        setContentPane(background); // Dùng panel ảnh làm nền

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);

        JLabel title = new JLabel("Snake Game");
        title.setFont(new Font("Verdana", Font.BOLD, 36));
        title.setForeground(Color.YELLOW);
        gbc.gridx = 0;
        gbc.gridy = 0;
        background.add(title, gbc);

        int highScore = HighScoreManager.getHighScore();
        JLabel scoreLabel = new JLabel("Kỷ lục: " + highScore + " điểm");
        scoreLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        scoreLabel.setForeground(Color.ORANGE);
        gbc.gridy = 1;
        background.add(scoreLabel, gbc);

        JButton playButton = createStyledButton(" Bắt đầu chơi", new Color(34, 139, 34));
        playButton.addActionListener(e -> {
            dispose();
            new Game();
        });
        gbc.gridy = 2;
        background.add(playButton, gbc);

        JButton viewHighScoreButton = createStyledButton(" Xem kỷ lục", new Color(70, 130, 180));
        viewHighScoreButton.addActionListener(e -> {
            int score = HighScoreManager.getHighScore();
            JOptionPane.showMessageDialog(this,
                "🎯 Kỷ lục hiện tại: " + score + " điểm",
                "Kỷ lục",
                JOptionPane.INFORMATION_MESSAGE);
        });
        gbc.gridy = 3;
        background.add(viewHighScoreButton, gbc);

        JButton exitButton = createStyledButton(" Thoát", new Color(178, 34, 34));
        exitButton.addActionListener(e -> System.exit(0));
        gbc.gridy = 4;
        background.add(exitButton, gbc);

        setVisible(true);
    }

    private JButton createStyledButton(String text, Color bgColor) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setFocusPainted(false);
        button.setBackground(bgColor);
        button.setForeground(Color.WHITE);
        button.setPreferredSize(new Dimension(200, 50));
        return button;
    }
}
