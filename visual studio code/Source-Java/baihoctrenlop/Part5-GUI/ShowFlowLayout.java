  import javax.swing.JLabel;
  import javax.swing.JTextField;
  import javax.swing.JFrame;
  import java.awt.FlowLayout;
 
   public class ShowFlowLayout extends JFrame {
     public ShowFlowLayout() {
       // Set FlowLayout, aligned left with horizontal gap 10
       // and vertical gap 20 between components
       setLayout (new FlowLayout(FlowLayout.LEFT, 10, 20));

       // Add labels and text fields to the frame
       add(new JLabel("First Name"));
       add(new JTextField(8));
       add(new JLabel("MI"));
       add(new JTextField(1));
       add(new JLabel("Last Name"));
       add(new JTextField(8));
     }
 
     /** Main method */
     public static void main(String[] args) {
       ShowFlowLayout frame = new ShowFlowLayout();
       frame.setTitle("ShowFlowLayout");
       frame.setLocationRelativeTo(null); // Center the frame
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(200, 200);
       frame.setVisible(true);
     }
   }
/*
This example creates a program using a style different from the programs in 
the preceding section, where frames were created using the JFrame class.
This example creates a class named ShowFlowLayout that extends the 
JFrame class (line 6). 
The main method in this program creates an instance of 
ShowFlowLayout (line 23). The constructor of ShowFlowLayout constructs and 
places the components in the frame. This is the preferred style of 
creating GUI applications for three reasons:

1. Creating a GUI application means creating a frame, so it is natural to define
a frame to extend JFrame.
2. The frame may be further extended to add new components or functions.
3. The class can be easily reused. For example, you can create multiple frames
   by creating multiple instances of the class.

*/
