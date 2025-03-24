public class Programm10 {

	public static void main(String args[]) {
		Console x = new Console();
		int a , max;
		double sum;
		
		x.print("Type in the first number: ");
		a = x.readInt();
		max = a; sum = a;

	      int i = 1;
		while (true) {
			x.print("Type in the number "+(i+1)+": ");
			a = x.readInt();

			if (a == -1) break;
			sum = sum + a;
			if (a > max) 
				max = a;
			i++;
		}

		x.println("The maximum is: "+max);
		x.println("The mean value is: "+1.0*sum/(i-1));
	}
}