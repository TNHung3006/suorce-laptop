import java.io.*;
class NVBienChe extends NhanVien {
	private float heSoLuong;
	//Vi?t ch?ng hàm nhap() c?a l?p cha
	void nhap() throws IOException {
		BufferedReader kbd = new BufferedReader(new InputStreamReader (System.in));
		System.out.print("Ho ten la: ");
		hoTen = kbd.readLine();
		System.out.print("Nam sinh la: ");
		namSinh = Integer.parseInt(kbd.readLine());
		System.out.print("He so luong la: ");
		heSoLuong = Float.parseFloat(kbd.readLine());
	}
}

