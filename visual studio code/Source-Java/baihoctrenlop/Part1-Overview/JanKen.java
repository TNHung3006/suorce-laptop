public class JanKen {
 
 public static void main(String args[]) {
	int computer = 0;
	int player = 0;
	Console c = new Console();
                
	while(computer < 3 && player < 3) {
	    c.println("Enter your number !");
	    c.print("1-Scissor 2-Stone 3-Paper ");
          int yourNumber = c.readInt();
	    if (yourNumber > 3 || yourNumber < 1)
		c.println("not a valid number");
	    else  {
		//generation of a random number between 1 and 3
		int compNumber = (int) Math.random()*3 + 1;  
	        c.println("computer plays "+compNumber);
	      if ( yourNumber == compNumber) {
			c.println("even !");
		}
	      else {
		   if ( (yourNumber == 1 && compNumber == 2) ||
		      (yourNumber == 2 && compNumber == 3) ||
		      (yourNumber == 3 && compNumber == 1)) {
		      c.println("Computer wins this time");
		      computer = computer + 1;
		   }
		   else {
		      c.println("You win this time");
		      player = player+1;
               }
		}
		c.println("Computer="+computer+"  you ="+player);
		c.println("--------------------------------");
	    }
	}
	if (player == 3) 
		c.println("You won !");
	else
		c.println("Sorry, computer won");
   }
}