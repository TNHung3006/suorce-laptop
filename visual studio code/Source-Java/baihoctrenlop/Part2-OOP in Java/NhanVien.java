import java.io.*;
class NhanVien {
	protected String hoTen;
	protected int namSinh;
	void nhap() throws IOException {
		BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Ho ten la: ");
		hoTen = kbd.readLine();
		System.out.print("Nam sinh la: ");
		namSinh = Integer.parseInt(kbd.readLine());
	}
}

