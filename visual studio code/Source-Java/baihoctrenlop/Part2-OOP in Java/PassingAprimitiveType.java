public class PassingAprimitiveType{
	public static void main(String[] args){
		double d=12.3;
		Decrementer dec = new Decrementer();
		dec.decrement(d);
		System.out.println(d);
	}
}

class Decrementer{
	public void decrement(double decMe){
		decMe = decMe - 1;
	}
}