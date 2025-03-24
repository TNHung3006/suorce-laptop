public class Programm13b {
    public static void main(String args[]) {
       Console c = new Console();
	 int i= 0 , app = 0;
       c.print("Input the first String : ");
	 String first = c.readLine();
	 c.print("Input the second String : ");

       String second = c.readLine();
	 while(true) {
	         i = first.indexOf(second,i);
	         if (i == -1) break;
		   app = app+1;
		   i = i+1;  
	  }
	 c.println("The string "+second+" was found "
                                +app+" times in the string "+ first);
	}
}
