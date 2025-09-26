#include <iostream>
#include <math.h>

using namespace std;

void Nhapmang(int a[], int n) {
    for (int i = 0; i < n; i++)
        cin >> a[i];
}
void Xuatmang(int a[], int n) {
    for (int i = 0; i < n; i++)
        cout << a[i] << " ";
}
void swap(int& a, int& b) {
    int tmp = a;
    a = b;
    b = tmp;
}
// câu 1
int NhoNhat(int a[], int n) {
    int min = a[0];
    for (int i = 1; i < n; i++) {
        if (a[i] < min) min = a[i];
    }
    return min;
}
int LonNhat(int a[], int n) {
    int max = a[0];
    for (int i = 1; i < n; i++) {
        if (a[i] > max) max = a[i];
    }
    return max;
}
//Câu 2
int DemPTChan(int a[], int n) {
    int dem = 0;
    for (int i = 0; i < n; i++) {
        if (a[i] % 2 == 0) dem++;
    }
    return dem;
}
int TongPTChan(int a[], int n) {
    int S = 0;
    for (int i = 0; i < n; i++) {
        if (a[i] % 2 == 0) S += a[i];
    }
    return S;
}
int DemPTLe(int a[], int n) {
    int dem = 0;
    for (int i = 0; i < n; i++) {
        if (a[i] % 2 != 0) dem++;
    }
    return dem;
}
int TongPTLe(int a[], int n) {
    int S = 0;
    for (int i = 0; i < n; i++) {
        if (a[i] % 2 != 0) S += a[i];
    }
    return S;
}
float TrungBinhCong(int a[], int n) {
    int Tong = 0;
    float TBC = 0;
    for (int i = 0; i < n; i++) {
        Tong += a[i];
    }
    TBC = Tong / n;
    return TBC;
}
//Câu 3
int TongSoDuong(int a[], int n) {
    int S = 0;
    for (int i = 0; i < n; i++) {
        if (a[i] > 0) S += a[i];
    }
    return S;
}
int TongSoAm(int a[], int n) {
    int S = 0;
    for (int i = 0; i < n; i++) {
        if (a[i] < 0) S += a[i];
    }
    return S;
}

//Câu 4
void SDLN(int a[], int n) {
    int max = -1;
    int VT = 0;
    for (int i = 0; i < n; i++) {
        if (a[i] > 0) {
            if (max == -1 || a[i] > max) {
                max = a[i];
                VT = i;
            }
        }
    }
    cout << "\nSo Duong Lon Nhat la: " << max;
    cout << "\nVi Tri: " << VT;
}
void SDNN(int a[], int n) {
    int min = -1;
    int VT = 0;
    for (int i = 0; i < n; i++) {
        if (a[i] > 0) {
            if (min == -1 || a[i] < min) {
                min = a[i];
                VT = i;
            }
        }
    }
    cout << "\nSo Duong Lon Nhat la: " << min;
    cout << "\nVi Tri: " << VT;
}
//Câu 5
void Sort(int a[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (a[i] > a[j]) swap(a[i], a[j]);
        }
    }
}

int DemSoPT(int a[], int n, int k) {
    int dem = 0;
    for (int i = 0; i < n; i++) {
        if (a[i] == k) dem++;
    }
    return dem;
}

void TimKiem(int a[], int n, int x) {
    int Vitri = -1;
    for (int i = 0; i < n; i++) {
        if (a[i] == x)
            Vitri = i;
    }
    if (Vitri == -1) cout << "\nkhong co phan tu co gia tri x trong mang";
    else cout << "\nVi tri cua x trong mang la: " << Vitri;
}

int main() {
    int arr[1007], n;
    cout << "nhap so luong phan tu trong mang: ";
    cin >> n;

    cout << "nhap gia tri cua tung phan tu trong mang: ";
    Nhapmang(arr, n);
    cout << "\nmang ban dau la: ";
    Xuatmang(arr, n);

    //Câu 1
    cout << "\nPhan tu nho nhat trong mang: " << NhoNhat(arr, n);
    cout << "\nPhan tu lon nhat trong mang: " << LonNhat(arr, n);
    cout << endl;

    //Câu 2
    cout << "\nSo phan tu chan la: " << DemPTChan(arr, n);
    cout << "\nTong so phan tu chan la: " << TongPTChan(arr, n);
    cout << "\nSo phan tu le la: " << DemPTLe(arr, n);
    cout << "\nTong so phan tu le: " << TongPTLe(arr, n);
    cout << "\nTrung binh cong cua mang la: " << TrungBinhCong(arr, n);
    cout << endl;

    //Câu 3
    cout << "\nTong cac so duong trong mang la: " << TongSoDuong(arr, n);
    cout << "\nTong cac so am trong mang la: " << TongSoAm(arr, n);
    cout << endl;

    //Câu 4
    //Số dương lớn nhất và vị trí trong mảng
    SDLN(arr, n);
    //số âm lớn nhất và vị trí trong mảng
    SDNN(arr, n);
    cout << endl;

    //Câu 5
    //Sắp xếp các phần tử trong mảng từ nhỏ đến lớn
    cout << "\nMang sau khi sap xem la: ";
    Sort(arr, n);
    Xuatmang(arr, n);

    int k, x;
    //đếm số phần tử bằng k
    cout << "\nNhap gia tri k: ";
    cin >> k;
    cout << "\nDem so phan tu co gia tri bang k: " << DemSoPT(arr, n, k);
    //tìm kiếm vị trí của x trong mảng
    cout << "\nnhap gia tri x: ";
    cin >> x;
    TimKiem(arr, n, x);
    return 0;
}