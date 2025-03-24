class SoTrau {
public static void main(String[] args) {
	System.out.println("Trau dung Trau nam Trau gia");
	int td=100/5;
	for (int d=1;d<=td;d++) { 
		int tn=(100-d*5)/3;
		for (int n=1;n<=tn;n++) { 
			int g = 100 - d - n;
			if (d*5+n*3+(double)(g)/3==100) 
			System.out.println("\t"+ d+"\t"+n+"\t"+g);
		}
	}
}
}