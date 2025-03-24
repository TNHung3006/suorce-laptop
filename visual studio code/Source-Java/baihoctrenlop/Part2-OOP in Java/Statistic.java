import java.io.*;
 public class Statistic {
    public static void main(String args[ ])  throws IOException {
       BufferedReader inKbd = new BufferedReader(
 			 new InputStreamReader(System.in));
       String inputLine;
       int count[] = new int[10]; 
       int counter = 0;
 
      for (int i=0; i < 10; i++) 	 count[i] = 0;   
       while (true) {
           System.out.print("Enter a value: ");
           inputLine = inKbd.readLine();
           int number = Integer.parseInt(inputLine);
 
           if (number == 0) 
 		    break;
 
 	     counter = counter + 1;
           count[number - 1] = count[number - 1] + 1; 
       }
             
       for (int i=0; i < 10; i++) 	   
            System.out.println("The % of "+(i+1)+" is "+
                                        (100*count[i]/counter)+"%");
   }    // from the main
 } 
 