import java.io.*;
class NVBienChe2 extends NhanVien {
	private float heSoLuong;
	NVBienChe2(String hoTen, int namSinh, float heSoLuong) {
		super(hoTen, namSinh);
		this.heSoLuong = heSoLuong;
	}
	void nhap() throws IOException {
		super.nhap();//G?i phýõng th?c nhap() c?a l?p cha
		BufferedReader kbd = new BufferedReader(new InputStreamReader (System.in));
		System.out.print("He so luong la: ");
		heSoLuong = Float.parseFloat(kbd.readLine());
	}
	/*
	 void nhap() throws IOException {
		BufferedReader kbd = new BufferedReader(new InputStreamReader (System.in));
		System.out.print("Ho ten la: ");
		hoTen = kbd.readLine();
		System.out.print("Nam sinh la: ");
		namSinh = Integer.parseInt(kbd.readLine());
		System.out.print("He so luong la: ");
		heSoLuong = Float.parseFloat(kbd.readLine());
	}
	*/
}

class NhanVien {
	protected String hoTen;
	protected int namSinh;
	NhanVien(String hoTen, int namSinh) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
	}
	void nhap() throws IOException {
		BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Ho ten la: ");
		hoTen = kbd.readLine();
		System.out.print("Nam sinh la: ");
		namSinh = Integer.parseInt(kbd.readLine());
	}
}



