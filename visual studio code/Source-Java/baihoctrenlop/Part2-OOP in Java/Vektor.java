public class Vektor { 
  	int x, y;

    	Vektor() { 
 		x = 0;
  		y = 0;
  	}

    	Vektor(int x, int y) { 
 		this.x = x;
  		this.y = y;
  	}

    	public String show() {
  		return "X= "+x+" Y= "+y;
  	}

    	public int module() {
  		return (int)Math.sqrt(x*x+y*y);
       }

        public void add(Vektor v) {
  		//it requires a vektor as parameter and modifies the current one
   		this.x = this.x + v.x;
    		this.y = this.y + v.y;
   		// can also write x + v.x and y = v.y because here 
  		//there is no name conflict
  	}

    	public Vektor addNew(Vektor v) {
  		//it requires a vektor as parameter and returns a new one 
  		return new Vektor(x+v.x, y+v.y);
 	}

              
      public static Vektor addNewStatic(Vektor v1, Vektor v2) {
  		//it requires 2 Vektor as parameters and returns a new one. 
 		//the method is not applied to any objetc ! 
 		return new Vektor(v1.x+v2.x, v1.y+v2.y);
  	}
 } 		