class Outer {
	private int outer_x = 100;//Bi?n c?a l?p bao
	void test() {
		Inner inner = new Inner();
		inner.display_x();//G?i phıõng th?c in bi?n c?a l?p bao
	}
	class Inner { //Coì thêÒ truy xuâìt trıòc tiêìp biêìn ğôìi tıõòng cuÒa lõìp Outer
		public int inner_y = 10;//Bi?n c?a l?p n?i b?
		void display_x() { 
		System.out.println("display : outer_x = " + outer_x);
		}
	}
	void display_y() { //Không thêÒ truy xuâìt biêìn ğôìi tıõòng cuÒa lõìp Inner
		//System.out.println("display : inner_y = " + inner_y); //L?i
	}
}

class InnerClassDemo {
	public static void main(String args[]) {
		Outer outer = new Outer();
		outer.test();
	}
}

