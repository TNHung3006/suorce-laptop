public class Test{
	public static void main(String args[]){
		Chicken ck=new Chicken();
		System.out.println (ck.show()); 
		ck.grow(); ck.grow(); System.out.println (ck.show());
		Sparrow sp = new Sparrow();
		System.out.println (sp.show());
		System.out.println (sp.fly());
		sp.grow();sp.grow(); System.out.println (sp.show());
	}
}