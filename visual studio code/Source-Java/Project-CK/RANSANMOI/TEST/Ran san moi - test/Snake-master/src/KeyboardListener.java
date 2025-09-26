import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardListener extends KeyAdapter {

    private ThreadsController controller;

    public KeyboardListener(ThreadsController controller) {
        this.controller = controller;
    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 39:    // -> Right 
                //if it's not the opposite direction
                if (controller.getDirection() != 2)
                    controller.setDirection(1);
                break;
            case 38:    // -> Top
                if (controller.getDirection() != 4)
                    controller.setDirection(3);
                break;

            case 37:    // -> Left 
                if (controller.getDirection() != 1)
                    controller.setDirection(2);
                break;

            case 40:    // -> Bottom
                if (controller.getDirection() != 3)
                    controller.setDirection(4);
                break;

            default:
                break;
        }
    }
}