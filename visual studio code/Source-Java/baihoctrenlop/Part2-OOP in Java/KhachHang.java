import java.io.*;
public class KhachHang{
	public static void main (String[] args) throws Exception{
		DenTuyp den1 = new DenTuyp();
		Den den2 = den1;
		Den den3 = new Den();
		//Goi cac method da viet de
		den1.docHoaDon(1000);
		den2.docHoaDon(1000);
		den3.docHoaDon(1000);
		//truy nhap toi cac bien da bi viet de (che bong)
		System.out.println (den1.loaiHoaDon);
		System.out.println (den2.loaiHoaDon);
		System.out.println (den3.loaiHoaDon);
		//goi cac phuong thuc nap chong
		den1.docHoaDon();
			
    }
}
class Den{
	protected String loaiHoaDon = "Hoa don nho:";
	protected double docHoaDon(int giaDien) throws Exception {
		double soGio = 10.0;
		double hoaDonNho = giaDien * soGio;
		System.out.println (loaiHoaDon + hoaDonNho);
		return hoaDonNho;
	}
}
class DenTuyp extends Den{
	public String loaiHoaDon = "Hoa don lon:";
	public double docHoaDon(int giaDien) throws Exception{
		double soGio = 100.0;
		double hoaDonLon = giaDien * soGio;
		System.out.println (loaiHoaDon + hoaDonLon);
		return hoaDonLon;
	}
	public double docHoaDon(){
		System.out.println ("Khong co hoa don!");
		return 0.0;
	}
}

/*
	Hoa don lon:100000.0
	Hoa don lon:100000.0
	Hoa don nho:10000.0
	Hoa don lon:
	Hoa don nho:
	Hoa don nho:
	Khong co hoa don!
 */