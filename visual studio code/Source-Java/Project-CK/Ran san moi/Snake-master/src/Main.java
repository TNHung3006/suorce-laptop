// import javax.swing.JFrame;

// public class Main {

// 	public static void main(String[] args) {

// 		//Creating the window with all its awesome snaky features
// 		Window f1= new Window();
		
// 		//Setting up the window settings
// 		f1.setTitle("Snake");
// 		f1.setSize(500,400);
// 		f1.setVisible(true);
// 		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             

// 	}
// }

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {

        //Creating the window with all its awesome snaky features
        Window f1 = new Window();

        //Setting up the window settings
        f1.setTitle("Snake"); // Moved to Window constructor
        f1.setSize(500,400); // Moved to Window constructor
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLocationRelativeTo(null); // Center the window

    }
}