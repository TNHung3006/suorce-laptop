public class Programm13 {
     public static void main(String args[]) {
 	 int i , app = 0;
 	 String first = args[0];
         String second = args[1];
 	 do {
 	      i = first.indexOf(second);
 	      if (i == -1) break;
 	      app = app+1;
 	      first = first.substring(i+1);
   	  }
 	  while(true);

 	  System.out.println("The string "+second+" was found "
                                +app+" times in the string "+args[0]);
   	} 
} 