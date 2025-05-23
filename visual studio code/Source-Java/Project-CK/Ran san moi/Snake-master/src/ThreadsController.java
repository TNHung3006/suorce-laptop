import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

//Controls all the game logic .. most important class in this project.
public class ThreadsController extends Thread {
    private ArrayList<ArrayList<DataOfSquare>> Squares; // Receive Grid
    private Tuple headSnakePos;
    private int sizeSnake = 5;
    private long speed = 90;
    private AtomicInteger directionSnake = new AtomicInteger(1);

    private ArrayList<Tuple> positions = new ArrayList<Tuple>();
    private Tuple foodPosition;

    //Constructor of ControlleurThread 
    ThreadsController(Tuple positionDepart, ArrayList<ArrayList<DataOfSquare>> grid) { // Receive Grid
        //Get all the threads
        Squares = grid; // Assign the received grid

        headSnakePos = new Tuple(positionDepart.x, positionDepart.y);
        directionSnake.set(1); // Start going right

        //!!! Pointer !!!!
        Tuple headPos = new Tuple(headSnakePos.getX(), headSnakePos.getY());
        positions.add(headPos);

        foodPosition = new Tuple(Window.height - 1, Window.width - 1);
        spawnFood(foodPosition);
    }

    //Important part :
    public void run() {
        while (true) {
            moveInterne(directionSnake.get());
            checkCollision();
            moveExterne();
            deleteTail();
            pauser();
        }
    }

    //delay between each move of the snake
    private void pauser() {
        try {
            sleep(speed);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Checking if the snake bites itself or is eating
    private void checkCollision() {
        Tuple posCritique = positions.get(positions.size() - 1);
        for (int i = 0; i <= positions.size() - 2; i++) {
            boolean biteItself = posCritique.getX() == positions.get(i).getX() && posCritique.getY() == positions.get(i).getY();
            if (biteItself) {
                stopTheGame();
            }
        }

        boolean eatingFood = posCritique.getX() == foodPosition.y && posCritique.getY() == foodPosition.x;
        if (eatingFood) {
            System.out.println("Yummy!");
            sizeSnake = sizeSnake + 1;
            foodPosition = getValAleaNotInSnake();
            spawnFood(foodPosition);
        }
    }

    //Stops The Game
    private void stopTheGame() {
        System.out.println("COLISION! \n");
        while (true) {
            pauser();
        }
    }

    //Put food in a position and displays it
    private void spawnFood(Tuple foodPositionIn) {
        Squares.get(foodPositionIn.x).get(foodPositionIn.y).lightMeUp(1);
    }

    //return a position not occupied by the snake
    private Tuple getValAleaNotInSnake() {
        Tuple p;
        int ranX = 0 + (int) (Math.random() * 19);
        int ranY = 0 + (int) (Math.random() * 19);
        p = new Tuple(ranX, ranY);
        for (int i = 0; i <= positions.size() - 1; i++) {
            if (p.getY() == positions.get(i).getX() && p.getX() == positions.get(i).getY()) {
                ranX = 0 + (int) (Math.random() * 19);
                ranY = 0 + (int) (Math.random() * 19);
                p = new Tuple(ranX, ranY);
                i = 0;
            }
        }
        return p;
    }

    //Moves the head of the snake and refreshes the positions in the arraylist
    //1:right 2:left 3:top 4:bottom 0:nothing
    private void moveInterne(int dir) {
        switch (dir) {
            case 4:
                headSnakePos.ChangeData(headSnakePos.x, (headSnakePos.y + 1) % 20);
                positions.add(new Tuple(headSnakePos.x, headSnakePos.y));
                break;
            case 3:
                if (headSnakePos.y - 1 < 0) {
                    headSnakePos.ChangeData(headSnakePos.x, 19);
                } else {
                    headSnakePos.ChangeData(headSnakePos.x, Math.abs(headSnakePos.y - 1) % 20);
                }
                positions.add(new Tuple(headSnakePos.x, headSnakePos.y));
                break;
            case 2:
                if (headSnakePos.x - 1 < 0) {
                    headSnakePos.ChangeData(19, headSnakePos.y);
                } else {
                    headSnakePos.ChangeData(Math.abs(headSnakePos.x - 1) % 20, headSnakePos.y);
                }
                positions.add(new Tuple(headSnakePos.x, headSnakePos.y));

                break;
            case 1:
                headSnakePos.ChangeData(Math.abs(headSnakePos.x + 1) % 20, headSnakePos.y);
                positions.add(new Tuple(headSnakePos.x, headSnakePos.y));
                break;
        }
    }

    //Refresh the squares that needs to be 
    private void moveExterne() {
        for (Tuple t : positions) {
            int y = t.getX();
            int x = t.getY();
            Squares.get(x).get(y).lightMeUp(2);

        }
    }

    //Refreshes the tail of the snake, by removing the superfluous data in positions arraylist
    //and refreshing the display of the things that is removed
    private void deleteTail() {
        int cmpt = sizeSnake;
        for (int i = positions.size() - 1; i >= 0; i--) {
            if (cmpt == 0) {
                Tuple t = positions.get(i);
                Squares.get(t.y).get(t.x).lightMeUp(0);
            } else {
                cmpt--;
            }
        }
        cmpt = sizeSnake;
        for (int i = positions.size() - 1; i >= 0; i--) {
            if (cmpt == 0) {
                positions.remove(i);
            } else {
                cmpt--;
            }
        }
    }

    public void setDirection(int dir) {
        directionSnake.set(dir);
    }

    public int getDirection() {
        return directionSnake.get();
    }
}