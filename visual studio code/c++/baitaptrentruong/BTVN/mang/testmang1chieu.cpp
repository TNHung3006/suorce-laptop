#include <iostream>
#include <math.h>

using namespace std;

void Nhapmang(int a[], int n){
    for(int i = 0; i < n; i++)
        cin >> a[i];
}
void Xuatmang(int a[], int n){
    for(int i = 0; i < n; i++){
        cout << a[i] << " ";
    }
    cout << endl;
}
int LaSnt(int n){
    if(n < 2) return 0;
    for(int i = 2; i <= sqrt(n); i++){
        if(n%i==0)return 0;
    }
    return 1;
}
void KimTraSNT(int a[], int n){
    for(int i = 0; i < n; i++){
        if(LaSnt(a[i])) cout << a[i] << " ";
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

void kiemtrasohoanhao(int a[], int n){
    for(int i = 0; i < n; i++){
        if(sohoanhao(a[i])) n--;
        else cout << a[i] << " ";
    }
}

int main(){
    int a[107], n, m;
    do{
        cout << "nhap so n >= 2: ";
        cin >> n;
    }while(n<2);
    cout << "nhap tung phan tu trong mang: ";
    Nhapmang(a, n);
    cout << "mang sau khi nhap la: ";
    Xuatmang(a, n);
    cout << "mang sau khi bo so hoan hao la: ";
    kiemtrasohoanhao(a, n);
    cout << "\nMang cac so nguyen to la: ";
    KimTraSNT(a, n);
}