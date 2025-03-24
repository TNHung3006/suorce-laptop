public class Programm6 {

	public static void main(String args[]) {
		Console mc = new Console();
		mc.println("I will try to solve te equation a*x**2 + b*x + c = 0");
		mc.print("please type in a:");
		double a = mc.readDouble();
		mc.print("please type in b:");
		double b = mc.readDouble();
		mc.print("please type in c:");
		double c = mc.readDouble();
		//the first root is
		double x1 = (-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
		//the second root is
		double x2 = (-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
		mc.println("The solutions are x1 = "+x1+ "  x2 = "+x2);
	}
}
		