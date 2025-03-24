public class Programm9 {

	public static void main(String args[]) {
		Console x = new Console();
		int a , max, sum;

		x.print("Type in the first number: ");
		a = x.readInt();
		max = a; sum = a;

		int i = 2;
		while (i <= 10) {
			x.print("Type in the number "+(i)+": ");
			a = x.readInt();
			sum = sum + a;
			if (a > max) 
				max = a;
			i = i + 1;  // you can also write i++
		}
		i = i-1;
		x.println("The maximum is: "+max);
		x.println("The mean value is: "+sum/i);
		//x.println("The mean value is: "+1.0*sum/i);
	}
}