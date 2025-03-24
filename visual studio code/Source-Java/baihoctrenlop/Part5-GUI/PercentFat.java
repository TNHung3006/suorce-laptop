import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;
   
public class PercentFat extends JFrame
{
  JLabel fatLabel  = new JLabel("Enter grams of fat:   ");
  JLabel calLabel  = new JLabel("Enter total calories: ");
  JLabel perLabel  = new JLabel("Percent calories from fat: ");
    
  JTextField inFat  = new JTextField( 7 );
  JTextField inCal  = new JTextField( 7 );
  JTextField outPer = new JTextField( 7 );
    
  JButton    doit   = new JButton("Do It!");
    
  int calories ;  // input: total calories per serving
  int fatGrams ;  // input: grams of fat per serving
  double percent; // result: percent of calories from fat
    
  public PercentFat()   
  {  
    
    setLayout( new FlowLayout() );
    add( fatLabel );
    add(inFat);  
    add(calLabel);
    add( inCal );    
    add( perLabel );   
    add( outPer );   
    outPer.setEditable( false );    
    add( doit );     
    doit.addActionListener(new ActionListener() {
	  	public void actionPerformed(ActionEvent evt) {
         	String userIn ;
    		userIn    = inFat.getText()  ;
    		fatGrams  = Integer.parseInt( userIn ) ;
   		    userIn    = inCal.getText()  ;
    		calories  = Integer.parseInt( userIn ) ;
   		    calcPercent() ;
   		    outPer.setText( (percent+"       ").substring(0,6) );
    	}
      });
  }
   
  // The application
  public void calcPercent( )  
  {
    percent = ( (fatGrams * 9.0) / calories ) * 100.0 ;
  }
    
  public static void main ( String[] args )
  {
    PercentFat fatApp  = new PercentFat() ;
    fatApp.setTitle("Percent of Calories from Fat");
    fatApp.setSize( 280, 200 );
    //fatApp.pack();     
    fatApp.setVisible( true );        
    fatApp.setLocationRelativeTo(null); 
    fatApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  }
}
