public class TestConsole2 {
     public static void main(String args[]) {
 	 int[] anArray;  //elements do not exists 
 	 Console2 c = new Console2();
 	 c.print("Enter 5 integer values : ");
 	 anArray = c.readIntArray(5);
 	 int i = 0;
 	 while(i < 5){
 		c.println("element number "+(i+1)+" is "+anArray[i]);
 		i = i+1;
 	}
    }
 } 