import java.awt.*; 
import java.awt.event.*;
import javax.swing.* ;
    
public class FahrConvert extends JFrame
{
  JLabel inLabel  = new JLabel("Fahrenheit    ");
  JLabel outLabel = new JLabel("Celsius ");
   
  JTextField inFahr = new JTextField( 7 );
  JTextField outCel = new JTextField( 7 );
    
  int fahrTemp ;
  int celsTemp ;
    
  FahrConvert()   
  {  
  	 
  	 setLayout(new FlowLayout() );
     add(inLabel);
     add( inFahr );
     add( outLabel );    
     add( outCel );
     outCel.setEditable( false );
     inFahr.addActionListener(new ActionListener() {
	  	public void actionPerformed(ActionEvent evt) {
          String userIn = inFahr.getText() ;
          fahrTemp = Integer.parseInt( userIn ) ;
          convert() ;
   		  outCel.setText( celsTemp+"" );
   		 }
      });
  }
  public void convert( )  
  {
    celsTemp = ((fahrTemp-32) * 5) / 9;
  }
  
     
  public static void main ( String[] args )
  {
    FahrConvert   fahr  = new FahrConvert() ;
    fahr.setTitle("Convert Fahrenheit to Celsius");
    fahr.setSize( 200, 150 );     
    fahr.setVisible( true );
    fahr.setLocationRelativeTo(null);
    //fahr.pack();
    fahr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
  }
   
}
