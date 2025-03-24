import java.util.*;  
public class WasedaStudent extends Student{

     Vector marks;

     WasedaStudent(String x, String y, int z) {
 	   super(x,y,z);	// a call to the constructor of the superclass
 	   marks = new Vector();
     }

     public void putNewMark(int x) {
		 	marks.add(new Integer(x));
     }
     
     public double showAverage() {
         double sum = 0.0;
         int i;
         for(i=0; i < marks.size(); i=i+1)
 	   sum = sum + ((Integer)marks.elementAt(i)).intValue();
         return sum/i;
     }
			 
}     