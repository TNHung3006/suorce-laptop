public abstract class Animal {
    String name;
    double weight;    
    public Animal() {
    	name = new String("ani");
    	weight = 0.0;
    }
    public abstract void grow();
    
    public String show(){
    	return "Day la " + name + " nang " +weight +" kg";
    }
    
}
