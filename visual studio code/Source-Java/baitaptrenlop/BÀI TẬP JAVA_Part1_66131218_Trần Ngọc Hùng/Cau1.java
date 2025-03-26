public class Cau1{
	private static int x = 20;
	public static void main (String args[]){
		Cau1.x ++;
		Cau1 obj1 = new Cau1();
		obj1.x --;
		Cau1 obj2 = new Cau1();
		obj2.x --;
		obj1 = new Cau1();
		obj1.x --;
		System.out.println("x = " + x);
	}
}
