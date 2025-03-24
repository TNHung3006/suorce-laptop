public class TestClockS {

    public static void main(String args[]) {
	Console c = new Console();
	c.println("Creating a new clock ");
	ClockS a = new ClockS();
	c.print("please enter new hours : ");
	int h = c.readInt();
	c.print("please enter new minutes : ");
	int m = c.readInt();
	c.print("please enter new seconds : ");
	int s = c.readInt();
        a.setTime(h,m,s);
	c.println("the time is now "+c.getTime());
	c.print("enter seconds to add: ");
	int adds = c.readInt();
	a.addSeconds(adds);
	c.println("the new time is now "+a.getTime());
	c.println("the total number of seconds is "+a.totalSeconds());
     }
}
