#include <iostream>
#include <math.h>

using namespace std;

void Nhapmang(int a[][107], int n){
    for(int i = 0; i < n; i++)
        for(int j = 0; j < n; j++)
            cin >> a[i][j];
}
void Xuatmang(int a[][107], int n){
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++)
            cout << a[i][j] << " ";
        cout << endl;
    }
}
int LaSnt(int n){
    if(n < 2) return 0;
    for(int i = 2; i <= sqrt(n); i++){
        if(n%i==0)return 0;
    }
    return 1;
}
void KimTraSNT(int a[][107], int n){
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++)
            if(LaSnt(a[i][j])) cout << a[i][j] << " ";
    }
}
int sohoanhao( int n){
    int s=1;
    for(int i = 2; i <= n/2; i++ ){
        if(n % i == 0) s+=i;
    }
    if(s==n) return 1;
    else return 0;
}

void kiemtrasohoanhao(int a[][107], int n){
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            if(sohoanhao(a[i][j])) n--;
            else cout << a[i][j] << " ";
        }
    }
}

int main(){
    int a[107][107], n;
    do{
        cout << "nhap so n >= 2: ";
        cin >> n;
    }while(n<2);
    cout << "nhap tung phan tu trong mang: ";
    Nhapmang(a, n);
    cout << "mang sau khi nhap la: \n";
    Xuatmang(a, n);
    cout << "mang sau khi bo so hoan hao la: ";
    kiemtrasohoanhao(a, n);
    cout << "\nMang cac so nguyen to la: ";
    KimTraSNT(a, n);
}