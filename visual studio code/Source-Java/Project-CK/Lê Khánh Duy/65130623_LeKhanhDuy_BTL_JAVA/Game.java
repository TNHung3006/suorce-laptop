import javax.swing.JFrame;

public class Game extends JFrame {
    GamePanel panel;

    public Game() {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Snake Xuyen Tuong");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
