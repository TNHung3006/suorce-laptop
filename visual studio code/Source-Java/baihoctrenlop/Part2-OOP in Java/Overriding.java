public class Overriding{
	public static void main(String[] args){
		A a = new A();
		a.p(10);
	}
}

class B{
	public void p (int i){}
}
class A extends B{
	//This method overrides the method in B
	public void p (int i){
		System.out.println(i);
	}
}