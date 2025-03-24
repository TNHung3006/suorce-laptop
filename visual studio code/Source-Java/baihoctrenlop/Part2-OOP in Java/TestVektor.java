public class TestVektor {
  	public static void main(String arg[]) {
 		Vektor a,b,c,d, e;
 		a = new Vektor(10,10);
 		b = new Vektor(-10,-10);
 		c = new Vektor(20,40);
 		System.out.println("Module of vektor a is: "+a.module());
 		System.out.println("Module of vektor c is: "+c.module());
           	System.out.println("we apply add(b) to vektor a");
	        a.add(b);
 		System.out.println("now a is "+a.show());
 		System.out.println("we apply addNew(c) to vektor b");
 		d = b.addNew(c);
 		System.out.println("d is now "+d.show()+" and b is "+b.show());
 		System.out.println("we call now the static version of add for d an b");
 		e = Vektor.addNewStatic(d,b);
 		System.out.println("e is now "+e.show());
 		e = b;
 		System.out.println("after making e = b e is now "+e.show());
 		System.out.println("We substract b to itself");
 		b.add(b);
 		System.out.println("b is now "+b.show());
 		System.out.println("e is now "+e.show()+ " WHY ???????");
         }
 } 		