import java.util.*;  
public class Console2 extends Console  { 	            
	Console2( ) {
             super();
      }           	  

      Console2(int x, int y ) {
             super(x,y);    
      }         	                              	

      public int[] readIntArray(int n) {  		
            //this is the name of the object to which the  		
            //method is being applied. It not always necesary
 		//to write it: line = readLine(); would also work
            String line = this.readLine();
            StringTokenizer st = new StringTokenizer(line);
 		int[] a = new int[n];
 		int i = 0;
 		while( i < n ) {
 			a[i] = Integer.parseInt(st.nextToken());
 			i++;
 		}
 		return a;
 	}
}
 