import java.awt.GridLayout;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Window extends JFrame {
    private static final long serialVersionUID = -2542001418764869760L;
    private ArrayList<ArrayList<DataOfSquare>> Grid; // Make Grid non-static
    public static int width = 20;
    public static int height = 20;
    private StartGamePanel startGamePanel;
    private JPanel gamePanel;
    private ThreadsController gameController;

    public Window() {
        setTitle("Snake");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        startGamePanel = new StartGamePanel(this);
        add(startGamePanel);

        initializeGrid();
    }

    private void initializeGrid() {
        Grid = new ArrayList<ArrayList<DataOfSquare>>();
        ArrayList<DataOfSquare> data;

        for (int i = 0; i < width; i++) {
            data = new ArrayList<DataOfSquare>();
            for (int j = 0; j < height; j++) {
                DataOfSquare c = new DataOfSquare(0);
                data.add(c);
            }
            Grid.add(data);
        }

        gamePanel = new JPanel(new GridLayout(width, height, 0, 0));
        // We don't add the squares to gamePanel here anymore!
    }

    public void startGame() {
        remove(startGamePanel);
        add(gamePanel);

        // Add the squares to gamePanel here, when the game starts
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                gamePanel.add(Grid.get(i).get(j).square);
            }
        }

        revalidate();
        repaint();

        // initial position of the snake
        Tuple position = new Tuple(10, 10);

        // Initialize the snake here, AFTER the game starts
        for (Tuple t : getInitialSnakePositions(position)) {
            Grid.get(t.getX()).get(t.getY()).lightMeUp(2); // Snake color
        }

        // passing the grid and initial position to the controller
        gameController = new ThreadsController(position, Grid); // Pass Grid
        gameController.start();

        // Add KeyListener AFTER adding gamePanel, and pass the controller
        this.addKeyListener(new KeyboardListener(gameController));
    }

    private ArrayList<Tuple> getInitialSnakePositions(Tuple headPosition) {
        ArrayList<Tuple> initialPositions = new ArrayList<>();
        initialPositions.add(headPosition);
        initialPositions.add(new Tuple(headPosition.getX() - 1, headPosition.getY()));
        initialPositions.add(new Tuple(headPosition.getX() - 2, headPosition.getY()));
        return initialPositions;
    }
}