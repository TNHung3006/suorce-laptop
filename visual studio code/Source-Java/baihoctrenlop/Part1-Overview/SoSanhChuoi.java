public class SoSanhChuoi{
	public static void main (String[] args) {
		String S1 = new String("ABC");
		String S2 = new String("ABC");
		String S3 = "ABC";
		String S4 = "ABC";
		/*
		int i = S1.compareTo(S2);
		if (i == 0)
			System.out.println ("Hai xau bang nhau");
		else
			if (i > 0)
				System.out.println ("S1 lon hon S2");
			else 
				System.out.println ("S1 nho hon S2");
		*/		
		if (S1.equals(S2))
			System.out.println ("Hai xau bang nhau");
		else 
			System.out.println ("Hai xau khac nhau");
			
		if (S1 == S2)
			System.out.println ("Hai xau tro cung mot doi tuong");
		else
			System.out.println ("Hai xau khong tro cung mot doi tuong");
		
		if (S1.equals(S3))
			System.out.println ("Hai xau bang nhau");
		else 
			System.out.println ("Hai xau khac nhau");
						
		if (S3 == S4)
			System.out.println ("Hai xau tro cung mot doi tuong");
		else
			System.out.println ("Hai xau khong tro cung mot doi tuong");
				
}
}