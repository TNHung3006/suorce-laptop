public class MCD {
	//computing of the maximum common divider  of 15 & 24
	
     public static void main(String args[ ]) {
       Console c = new Console();
       c.print("please enter the first number : ");
       int x0 = c.readInt();
       c.print("please enter the second number : ");
       int y0 = c.readInt();
       int x = x0; int y = y0;
       while (x != y) {
	     if (x < y)
		y = y - x;
	     else
		x = x - y;
       }
       c.println("The MCD of "+x0+" & "+y0+" is " + x);
    }
}
