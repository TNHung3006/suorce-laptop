#include <iostream>
#include <math.h>
#include <iomanip> 
using namespace std;
struct Diem{
	int x;
	int y;
};
struct Hinh_Chu_Nhat{
	 Diem diem_tren_trai;
	 Diem diem_duoi_phai;
	 Diem diem_tren_phai;
	 Diem diem_duoi_trai;
};
void Nhap_hcn(Hinh_Chu_Nhat &hcn){
	cout<<"Nhap lan luot x va y duoi phai: ";
	cin>>hcn.diem_duoi_phai.x;
	cin>>hcn.diem_duoi_phai.y;
	cout<<"Nhap lan luot x va y tren trai: ";
	cin>>hcn.diem_tren_trai.x;
	cin>>hcn.diem_tren_trai.y;
	cout<<"Nhap lan luot x va y tren phai: ";
	cin>>hcn.diem_tren_phai.x;
	cin>>hcn.diem_tren_phai.y;
	cout<<"Nhap lan luot x va y duoi trai: ";
	cin>>hcn.diem_duoi_trai.x;
	cin>>hcn.diem_duoi_trai.y;
}
void Xuat_hcn(Hinh_Chu_Nhat hcn){
	cout<<"x va y hcn duoi phai: "<<hcn.diem_duoi_phai.x<<" "<<hcn.diem_duoi_phai.y<<endl;
	cout<<"x va y hcn tren trai: "<<hcn.diem_tren_trai.x<<" "<<hcn.diem_tren_trai.y<<endl;
	cout<<"x va y hcn tren phai: "<<hcn.diem_tren_phai.x<<" "<<hcn.diem_tren_phai.y<<endl;
	cout<<"x va y hcn duoi trai: "<<hcn.diem_duoi_trai.x<<" "<<hcn.diem_duoi_trai.y<<endl;
}
void CvDt_hcn(Hinh_Chu_Nhat hcn){
	double cd=sqrt(pow(hcn.diem_duoi_phai.x-hcn.diem_duoi_trai.x,2)+pow(hcn.diem_duoi_phai.y-hcn.diem_duoi_trai.y,2));
	double cr=sqrt(pow(hcn.diem_duoi_phai.x-hcn.diem_tren_phai.x,2)+pow(hcn.diem_duoi_phai.y-hcn.diem_tren_phai.y,2));
	cout << fixed << setprecision(2) << "Chieu dai: " << cd<<"   ";
	cout << fixed << setprecision(2) << "Chieu rong: " << cr << endl;
	cout<<"Chu vi hcn: "<<(cd+cr)*2<<endl;
	cout<<"Dien tich hcn: "<<cd*cr;
}

int main(){
	Hinh_Chu_Nhat hcn;
	Nhap_hcn(hcn);
	Xuat_hcn(hcn);
	CvDt_hcn(hcn);
	return 0;
}
