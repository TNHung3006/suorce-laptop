public class Programm11 {
   public static void main(String args[ ])  {
      int i;
      int count[] = new int[10]; 
      int counter = 0;
      Console c = new Console();

      i=0; 
	while(i<10){
	    count[i] = 0; 
	    i=i+1; 
	}

      while (true) {
          c.print("Enter a value between 1 and 10 (0 to end): ");
          int number = c.readInt();

          if (number == 0) 
		break;

	    counter = counter + 1;
          count[number - 1] = count[number - 1] + 1; 
      }
            
      i=0; 
	while(i<10){
     	   c.println("The % of "+(i+1)+" is "+(100*count[i]/counter)+"%");
         i = i + 1;
	}
  }    // from the main
} 
