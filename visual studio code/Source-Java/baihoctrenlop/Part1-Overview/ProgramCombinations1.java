public class ProgramCombinations1 {
     public static void main(String args[]) {
 	 int k,n;
  	 int a;  // for storing n!
 	 int b;  // for storing k!
 	 int c;   // for storing (n-k)!
  	 Console co = new Console();
 	 co.print("enter k:");
 	 k = co.readInt();
 	 co.print("enter n:");
 	 n = co.readInt();
	 a = 1;
 	 int i = 2;
 	 while (i <= n) {
 		a = a*i; 
		i++; 	 
	 }
 	 b = 1;
 	 i = 2;
 	 while (i <= k) {
 		b = b*i;
 		i++; 	 
	}
      	c = 1;
 	i = 2;
 	while (i <= n-k) {
 		c = c*i;
 		i++;
 	}
	co.println("The number of combinations is "+(a/(b*c)));
  }
} 