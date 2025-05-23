import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartGamePanel extends JPanel {

    private JButton startButton;
    private Window window; // Reference to the Window to start the game

    public StartGamePanel(Window window) {
        this.window = window;
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Snake Game", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
        add(titleLabel, BorderLayout.NORTH);

        startButton = new JButton("Start Game");
        startButton.setFont(new Font("Arial", Font.PLAIN, 24));
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.startGame(); // Call startGame method in Window
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(startButton);
        add(buttonPanel, BorderLayout.CENTER);

        setBackground(Color.darkGray); // Set background color
        titleLabel.setForeground(Color.white); // Set title color
        startButton.setForeground(Color.white); // Set button text color
    }
}