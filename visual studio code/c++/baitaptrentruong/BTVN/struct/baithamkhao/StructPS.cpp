#include <iostream>
using namespace std;
struct PhanSo{
	int tuso;
	int mauso;
};
void NhapPS( PhanSo &ps){
	cout<<"Vui long nhap tu so: ";
	cin>>ps.tuso;
	cout<<"\nVui long nhap mau so: ";
	cin>>ps.mauso;
}
void XuatPS( PhanSo ps){
	cout<<"\nPhan so vua nhap: ";
	cout<<ps.tuso<<"/"<<ps.mauso;
}
void RutGonPS(PhanSo &ps){
	int ucln=1;
	//Co the them dieu kien tim so be hon
	for (int i=ps.tuso;i>1;i--){
		if (ps.tuso%i==0 && ps.mauso%i==0 ) ucln =i;
	}
	ps.tuso=ps.tuso/ucln;
	ps.mauso=ps.mauso/ucln;
}
void TinhTongPS(PhanSo ps1, PhanSo ps2){
	PhanSo ps;
	if (ps1.mauso==ps2.mauso){
		ps.tuso=ps1.tuso+ps2.tuso;
		ps.mauso=ps1.mauso;
	} else{
	ps.tuso=ps1.tuso*ps2.mauso+ps2.tuso*ps1.mauso;
	ps.mauso=ps1.mauso*ps2.mauso;
	}
	cout<<ps.tuso<<"/"<<ps.mauso;
}

int main(){
	PhanSo ps1;
	PhanSo ps2;
	NhapPS (ps1);
	NhapPS (ps2);
	//XuatPS(ps1);
	//RutGonPS(ps1);
	//XuatPS(ps1);
	TinhTongPS(ps1,ps2);
	return 0;
}
