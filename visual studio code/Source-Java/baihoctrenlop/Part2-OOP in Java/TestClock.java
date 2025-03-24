public class TestClock {

    public static void main(String args[]) {
	Console c = new Console();
	c.println("Creating a new clock ");
	Clock a = new Clock();
	c.print("please enter new hours : ");
	int h = c.readInt();
	c.print("please enter new minutes : ");
	int m = c.readInt();
	c.print("please enter new seconds : ");
	int s = c.readInt();
        a.setTime(h,m,s);
	c.println("the time is now "+a.getTime());
	c.print("enter seconds to add: ");
	int adds = c.readInt();
	a.addSeconds(adds);
	c.println("the new time is now "+a.getTime());
	c.println("the total number of seconds is "+a.totalSeconds());
     }
}
