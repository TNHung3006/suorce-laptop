#include <iostream>
#include <math.h>

using namespace std;
void Nhapmang(int a[][107], int m, int n) {
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++)
            cin >> a[i][j];
    }
}
void Xuatmang(int a[][107], int m, int n) {
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++)
            cout << a[i][j] << " ";
        cout << endl;
    }
}
int LaSnt(int n){
    if(n < 2) return 0;
    for(int i = 2; i <= sqrt(n); i++){
        if(n%i==0) return 0;
    }
    return 1;
}
void SntDCP(int arr[][107], int m){
    for(int i = 0; i < m; i++){
        if(LaSnt(arr[i][m-1-i])) cout << arr[i][m-1-i] << " ";
    }
}

int TBCongSntDCP(int arr[][107], int m){
    int S = 0, index=0;
    for(int i = 0; i < m; i++){
        if(LaSnt(arr[i][m-1-i])){
             S+= arr[i][m-1-i] ;
             index++;
        }
    }
    return S/index;
}

void MTChuyenVi(int a[][107], int b[][107], int m, int n){
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            b[i][j] = a[j][i];
        }
    }
}

void Nhan2MT (int a[][107], int b[][107], int c[][107], int ma, int na, int mb, int nb, int &mc, int &nc){
    mc = ma;
    nc = nb;
    int tmp;
    for(int i = 0; i < mc; i++){
        for(int j = 0; j < nc; j++){
            tmp = 0;
            for(int k = 0; k < na; k++){
                tmp+=a[i][k]*b[k][j];
            c[i][j] = tmp;
            }
        }
    }
}

int main() {
    int a[107][107], b[107][107], c[107][107], ma, na, mb, nb, mc, nc;
    cout << "nhap mang a\n";
    cout << "nhap so luong phan tu hang: ";
    cin >> ma;
    cout << "nhap so luong phan tu cot: ";
    cin >> na;
    Nhapmang(a, ma, na);
    Xuatmang(a, ma, na);

    //Cau 2
    cout << "So nguyen to tren duong cheo phu la: ";
    SntDCP(a, ma);
    //Cau 3
    cout << "\nTBCong so nguyen to tren duong cheo phu la: " << TBCongSntDCP(a, ma) << endl;
    //Cau 4
    cout << "Ma tran chuyen vi la: \n";
    MTChuyenVi(a, b, ma, na);
    Xuatmang(b, na, ma);

    //Cau 5 nhan 2 ma tran
    cout << "nhap mang b\n";
    cout << "nhap so luong phan tu hang: ";
    cin >> mb;
    cout << "nhap so luong phan tu cot: ";
    cin >> nb;
    Nhapmang(b, mb, nb);
    Xuatmang(b, mb, nb);
    if(na != mb) cout << "nhan 2 ma tran khong hop le";
    else Nhan2MT(a, b, c, ma, na, mb, nb, mc, nc);
    cout << "ma tran moi sau khi nhan 2 ma tran la: \n";
    Xuatmang(c, mc, nc);

    return 0;
}