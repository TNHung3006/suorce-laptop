public class Sparrow extends Animal implements Flyable{
    public Sparrow() {
    	name = new String("con chim se");
    	weight = 0.1;
    }
    public void grow(){
    	weight = weight + 0.05;
    	
    }
    public String fly(){
    	return "Bay o toc do 10km/h";
    }
  
}
