public class Programm5 {

	public static void main(String args[]) {
		Console x = new Console();
		int a1, a2, a3, a4, a5, max;
                x.println("This program will calculate the maximum");

		x.println("and the mean value of 5 numbers");

		x.print("Type in the first: ");
		a1 = x.readInt();
		max = a1;
		x.print("Type in the second: ");
		a2 = x.readInt();
		max = Math.max(a2,max);
		x.print("Type in the third: ");
		a3 = x.readInt();
		max = Math.max(a3,max);
		x.print("Type in the fourth: ");
		a4 = x.readInt();
		max = Math.max(a4,max);
		x.print("Type in the fifth: ");
		a5 = x.readInt();
		max = Math.max(a5,max);
		x.println("The maximum is: "+max);
		x.println("The mean value is: "+(a1+a2+a3+a4+a5)/5.0);
	}
}
