
public class Programm8 {
   public static void main(String args[ ])   {
      Console c = new Console();
      c.print("Enter the value to pay: ");
      int toPay = c.readInt();
      c.print("Enter the money given by the customer : ");
      int theMoney = c.readInt();
      if (theMoney < toPay) 
	 	c.println("The money is not enough to pay the bill !");
      else if (theMoney == toPay)
	 	c.println("The money is right, no change");
      else {
      	int change = theMoney -toPay;
		int a5000 =  change/5000;
        if (a5000 != 0) {
	   		c.println("give "+a5000+" of 5000");
	   		change = change%5000;
		}
        int a1000 = change/1000;
        if (a1000 != 0) {
        	c.println("give "+a1000+" of 1000");
        	change = change%1000;
        }
        int a500 = change/500;
        if (a500 != 0) {
        	c.println("give "+a500+" of 500");
        	change = change%500;
        }
        int a100 = change/100;
        if (a100 != 0) {
        	c.println("give "+a100+" of 100");
        	change = change%100;
        }
        int a50 = change/50;
        if (a50 != 0) {
        	c.println("give "+a50+" of 50");
        	change = change%50;
        }
        int a10 = change/10;
        if (a10 != 0) {
        	c.println("give "+a10+" of 10");
        	change = change%10;
        }
        int a5 = change/5;
        if (a5 != 0) {
        	c.println("give "+a5+" of 5");
        	change = change%5;
        }
        if (change != 0)
        	c.println("give "+change+" of 1");
	   
     } // from the else at the beginning !!!
  }    // from the main
} 
