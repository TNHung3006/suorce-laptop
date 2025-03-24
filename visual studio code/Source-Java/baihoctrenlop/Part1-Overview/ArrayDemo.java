import java.io.*;
class ArrayDemo {
	public static void main(String[] args) throws IOException {
		//T?o m?ng và nh?p m?ng
		double[] a = new double[10];
		BufferedReader kbd=new BufferedReader(new InputStreamReader (System.in));
		System.out.print("So phan tu cua mang la:");
		String s=kbd.readLine();
		int n = Integer.parseInt(s);
		for (int i=0;i<n;i++) {
			System.out.print("a["+i+"]="); s=kbd.readLine();
			a[i] = Double.parseDouble(s);
		}
		//T?m ph?n t? l?n nh?t ð?u tiên
		int max =0;
		for (int i=1; i<n;i++)
			if (a[max] <a[i]) max = i;
		System.out.println("Phan tu lon nhat dau tien cua day la phan tu thu:"
					+max+" co gia tri la "+a[max]);
		//T?m ph?n t? ð?u tiên c?a d?y có giá tr? x
		System.out.print("Nhap tri can tim :");
		s=kbd.readLine();
		double x =Double.parseDouble(s);
		int i=0;
		while (i<n && a[i] != x) i++;
		if (i<n) System.out.println("Phan tu dau tien co gia tri "+x
			+" la phan tu thu "+i);
		else System.out.println("Gia tri "+x+" khong co trong mang");
		//S?p x?p d?y theo th? t? tãng d?n
		double tam;
		for (i=0;i<n-1;i++)
			for (int j=i+1;j<n;j++)
				if (a[j]<a[i]) {
					tam = a[j];
					a[j] = a[i];
					a[i] = tam; 
				}
		//In d?y s? th?c
		System.out.println("Day so thuc sau khi sap xep la :");
		for (i=0;i<n;i++)
			System.out.print(a[i]+"\t");
		System.out.println();
	}

}

