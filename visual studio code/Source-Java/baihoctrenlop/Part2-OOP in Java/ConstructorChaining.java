public class ConstructorChaining{
  public static void main(String[] args){
     B b = new B("Test");
    //B b = new B();
    //B b = new B("s","t");
  }
}
class A{
 A(){
   this("1","2");
 }
 A(String s, String t) {
   this(s+t);
 }
 A(String s){
   System.out.print(s);
 }
}
class B extends A{
 B(String s){
	//ngam dinh goi super(){..} hay A(){...}
	//this(); 
	//neu co this(..) thi se khong ngam dinh goi super() o day nua!
	System.out.println(s);
 }
 B(String s, String t){
   this(t+s+"3");
 }
 B(){
   super("4");
 }
}