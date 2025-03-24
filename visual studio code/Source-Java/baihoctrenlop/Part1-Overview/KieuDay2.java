public class KieuDay2{
	public static void main (String[] args) {
		int n;
		Console con = new Console();
		do{
			con.print("Nhap 5<=n<=10:");
			n = con.readInt();
		}while(n<5 || n>10);
		//Khai bao day co n phan tu
		int a[] = new int[n];
		//Nhap du lieu cho day:
		for (int i=0;i<n;i++){
			con.print("a["+i+"]=");
			a[i] = con.readInt();
		}
		//Tinh tong cac phan tu trong day:
		int tong = 0;
		for (int i=0;i<n;i++)
			tong += a[i];
		con.println("Tong cac phan tu co trong day: "+tong);
		//In cac phan tu co gia tri chan va chia het cho 3
		con.println("Cac phan tu co gia tri chan va chia het cho 3 trong day:");
		for (int i=0;i<n;i++)
			if ( (a[i] %2 ==0) && (a[i]%3 ==0))
				con.print(a[i]+"    ");
	}
}