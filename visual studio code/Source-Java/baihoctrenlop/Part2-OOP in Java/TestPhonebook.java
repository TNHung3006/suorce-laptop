import java.io.*;
class TestPhonebook {
 	public static void main(String args[ ]) throws IOException {
 	   BufferedReader inKbd = new BufferedReader( 
			           new InputStreamReader(System.in));
       	   String inputLine;
  	   System.out.println("creating a Phonebook");
 	   Phonebook b= new Phonebook(4);
 	   boolean exit = false;
  	   while (exit == false) {
  	   	System.out.println("     Enter what do you want to do:");
		System.out.println("1- new entry   2- search number"+
                    "  3- change number 4-delete 0- end");
 		inputLine = inKbd.readLine();
 		int x= Integer.parseInt( inputLine );
 		switch (x) {
 			case 0:
 				exit = true;
 				break;
 			case 1:
 				System.out.print("enter the name : ");
 				String name = inKbd.readLine(); 
 				System.out.print("enter the number: ");
 				String snumber = inKbd.readLine();
 				int nnumber = Integer.parseInt( snumber );
 				b.setEntry(name,nnumber);
 				break;
 			case 2:
 				System.out.print("enter the name : ");
 				inputLine = inKbd.readLine();
		 		int num = b.getNumber(inputLine);
 				if (num == -1)
		  			System.out.println("not found");
 				else 
					System.out.println("The number is "+num);
				break;
 			case 3:case 4:
 				System.out.println("Not implemented yet");
 				break;
 			default:
 				System.out.println ("Not a valid number!");
 		}
 	  }
   }
 } 		    			