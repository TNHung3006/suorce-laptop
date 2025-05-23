#include <iostream>
using namespace std;
struct PhanSo{
	int tuso;
	int mauso;
};
void NhapPS( PhanSo &ps){
	cout<<"Vui long nhap tu so: ";
	cin>>ps.tuso;
	
	cout<<"Vui long nhap mau so: ";
	cin>>ps.mauso;
}
void XuatPS( PhanSo ps){
	cout<<"\nPhan so : ";
	cout<<ps.tuso<<"/"<<ps.mauso;
}
void RutGonPS(PhanSo &ps){
	int ucln=1;
	//Co the them dieu kien tim so be hon
	int min=0;
	if (ps.tuso<ps.mauso){
		min=ps.tuso;
	}
	else{
		min=ps.mauso;
	}
	
	for (int i=min;i>1;i--){
		if (ps.tuso%i==0 && ps.mauso%i==0 ) ucln =i;
	}
	ps.tuso=ps.tuso/ucln;
	ps.mauso=ps.mauso/ucln;
}
void TinhTongPS(PhanSo ps1, PhanSo ps2, PhanSo &ps){
	if (ps1.mauso==ps2.mauso){
		ps.tuso=ps1.tuso+ps2.tuso;
		ps.mauso=ps1.mauso;
	} else{
	ps.tuso=ps1.tuso*ps2.mauso+ps2.tuso*ps1.mauso;
	ps.mauso=ps1.mauso*ps2.mauso;
	}
	RutGonPS(ps);
	cout<<ps1.tuso<<"/"<<ps1.mauso<<" + "<<ps2.tuso<<"/"<<ps2.mauso<<" = "<<ps.tuso<<"/"<<ps.mauso<<endl;
}
void TinhHieuPS(PhanSo ps1, PhanSo ps2, PhanSo &ps){
	if (ps1.mauso==ps2.mauso){
		ps.tuso=ps1.tuso-ps2.tuso;
		ps.mauso=ps1.mauso;
	} else{
	ps.tuso=ps1.tuso*ps2.mauso-ps2.tuso*ps1.mauso;
	ps.mauso=ps1.mauso*ps2.mauso;
	}
	RutGonPS(ps);
	cout<<ps1.tuso<<"/"<<ps1.mauso<<" - "<<ps2.tuso<<"/"<<ps2.mauso<<" = "<<ps.tuso<<"/"<<ps.mauso<<endl;
}
void TinhTichPS(PhanSo ps1, PhanSo ps2, PhanSo &ps){
	ps.tuso=ps1.tuso*ps2.tuso;
	ps.mauso=ps1.mauso*ps2.mauso;
	RutGonPS(ps);
	cout<<ps1.tuso<<"/"<<ps1.mauso<<" x "<<ps2.tuso<<"/"<<ps2.mauso<<" = "<<ps.tuso<<"/"<<ps.mauso<<endl;
}
void TinhThuongPS(PhanSo ps1, PhanSo ps2, PhanSo &ps){
	ps.tuso=ps1.tuso*ps2.mauso;
	ps.mauso=ps1.mauso*ps2.tuso;
	RutGonPS(ps);
	cout<<ps1.tuso<<"/"<<ps1.mauso<<" / "<<ps2.tuso<<"/"<<ps2.mauso<<" = "<<ps.tuso<<"/"<<ps.mauso<<endl;
}
void QuyDong2PS(PhanSo &ps1, PhanSo &ps2){
	if (ps1.mauso!=ps2.mauso){
		ps1.tuso=ps1.tuso*ps2.mauso;
		ps1.mauso=ps1.mauso*ps2.mauso;
		ps2.tuso=ps2.tuso*ps1.mauso;
		ps2.mauso=ps1.mauso;
	}
}
void CheckAmDuong(PhanSo ps){
	if (ps.tuso*1.0/ps.mauso<0){
		cout<<"Am.\n";
	}else{
		cout<<"Duong.\n";
	}
}
void SoSanh(PhanSo ps1, PhanSo ps2){
	QuyDong2PS(ps1,ps2);
	if (ps1.tuso>ps2.mauso){
		cout<<"Phan so ps1 lon hon ps2"<<endl;
	}else{
		cout<<"Phan so ps1 be hon ps2"<<endl;

	}
}

int main(){
	PhanSo ps1,ps2;
	NhapPS (ps1);
	NhapPS (ps2);
	//XuatPS(ps1);
	RutGonPS(ps1);
	RutGonPS(ps2);
	//Tong 2 phan so
	PhanSo Tong;
	TinhTongPS(ps1,ps2, Tong);
	//Hieu 2 phan so
	PhanSo Hieu;
	TinhHieuPS(ps1,ps2, Hieu);
	//Tich 2 phan so
	PhanSo Tich;
	TinhTichPS(ps1,ps2, Tich);
	//Thuong 2 phan so
	PhanSo Thuong;
	TinhThuongPS(ps1,ps2, Thuong);
	cout<<"Quy dong 2 phan so.";
	QuyDong2PS(ps1,ps2);
	XuatPS(ps1);
	XuatPS(ps2);
	cout<<"\nKiem tra am duong ps1: ";
	CheckAmDuong(ps1);
	SoSanh(ps1,ps2);
	return 0;
}
