public class FormattedOutput{
	public static void main (String[] args) {
		int a = 45/2;
		// decimal integer
		System.out.printf("45/2 = %d %n",a);
		// Pad with zeros
		double b = 1.0/2.0;
		System.out.printf("1.0/2.0 = %05.2f %n",b);
		// Pad with spaces
		System.out.printf("1.0/2.0 = %5.2f %n",b);
		// Scientific notation
		b = 2000.0 / 3.0;
		System.out.printf("2000.0 / 3.0 =%7.2e",b);
		// Negative infinite
		b = -2.0/0.0;
		System.out.printf("2.0/0.0 =%7.3e %n",b);
		// Multiple arguments
		System.out.printf("PI = %5.3f, e = %5.4f %n", Math.PI, Math.E);
	
}
}