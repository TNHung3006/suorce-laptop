import java.io.*;
public class DSNhanVien2 {
	public static void main(String[] args) throws IOException{
		NhanVien.luongCB=650; 
		NhanVien.tongLuong = 0;
		final int n = 3;
		NhanVien[] nv = new NhanVien[n];
		BufferedReader kbd = new BufferedReader(new 
			InputStreamReader(System.in));
		for (int i=0;i<n;i++) {
			System.out.print("nhap ho ten:");
			String ht=kbd.readLine();
			System.out.print("nhap nam sinh:");
			int ns=Integer.parseInt(kbd.readLine());
			System.out.print("nhap he so luong:");
			float hsl=Float.parseFloat(kbd.readLine());
			nv[i] = new NhanVien(ht, ns, hsl);
			NhanVien.tinhTong(nv[i]);
		}
		System.out.println("Tong luong la: "+NhanVien.tongLuong);
	}
}

class NhanVien {
	private String hoTen;
	private int namSinh;
	private float heSoLuong;
	static int luongCB;
	static float tongLuong;
	NhanVien() {}
	NhanVien(String ht, int ns, float hsl) {
		hoTen = ht; 
		namSinh = ns; 
		heSoLuong = hsl;
	}
	float luong() {
		return luongCB * heSoLuong;
	}
	static void tinhTong(NhanVien nv) {
		tongLuong = tongLuong + nv.luong(); 
	}
}
