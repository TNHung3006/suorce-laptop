public class ProgramCombinations2 {

    public static int fact(int x) {
 	 int a = 1;
 	 int i = 2;
 	 while (i <= x) {
 		a = a*i;
 		i++;
 	 }
 	 return a;
    }

    public static void main(String args[]) {
 	 Console co = new Console();
 	 int k,n;
 	 do{
  	 	co.print("enter k:");
	 	 k = co.readInt();
	 	 co.print("enter n:");
	 	 n = co.readInt();
  	 }while (k>n || k<=0);
  	 
	 int l = fact(n)/(fact(k)*fact(n-k));
 	 co.println("The number of combinations is "+l);
   }
} 