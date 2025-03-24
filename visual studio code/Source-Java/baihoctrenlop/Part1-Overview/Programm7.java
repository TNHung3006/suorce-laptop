public class Programm7 {

	public static void main(String args[]) {
		Console mc = new Console();
		mc.println("I will try to solve te equation a*x**2 + b*x + c = 0");
		mc.print("please type in a:");
		double a = mc.readDouble();
		mc.print("please type in b");
		double b = mc.readDouble();
		mc.print("please type in c");
		double c = mc.readDouble();
		//first calculate discriminant
		double disc = Math.pow(b,2)-(4*a*c);
		if (disc >= 0) {
		    double x1 = (-b+Math.sqrt(disc))/(2*a);
		    double x2 = (-b-Math.sqrt(disc))/(2*a);
		    mc.println("The solutions are x1 = "+x1+ "  x2 = "+x2);
		} 
		else {
		    double real = -b/(2*a);
		    double imag = Math.sqrt(-disc)/(2*a);
		    mc.println("The solutions are ");
		    mc.println("x1 = "+real+" + "+imag+"i");
		    mc.println("x2 = "+real+" - "+imag+"i");
		}
	}
}
		