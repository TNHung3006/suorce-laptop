public class BitWiseBitShift{
	public static void main (String[] args) {
		int x = 23;
		int y = 12;
		System.out.println ("x & y ="+ (x&y));
		System.out.println ("x | y ="+(x | y));
		System.out.println ("x ^ y ="+(x ^ y));
		int a = 43; //0101011
		int b = 1;
		a = a >> b; //0010101
		System.out.println ("a >> b = "+a);
}
}