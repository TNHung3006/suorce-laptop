#include <iostream>

using namespace std;

#define maxR 107
#define maxC 107

// Viết chương trình nhập vào ma trận có mxn phần tử.
// in ra các phần tử là số chính phương
// viết hàm tính tổng các số chính phương
// kiểm tra xem mảng có chứa toàn snt hay ko
// kiểm tra xem ma trận có phải đối xứng hay không
// in ra ma trận hoán vị của ma trận đã nhập.

void Nhapmang(int a[][maxC], int m, int n) {
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++)
            cin >> a[i][j];
    }
}
void Xuatmang(int a[][maxC], int m, int n) {
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++)
            cout << a[i][j] << " ";
        cout << endl;
    }
}

int main() {
    int arr[maxR][maxC], m, n;
    cout << "nhap so luong phan tu hang: ";
    cin >> m;
    cout << "nhap so luong phan tu cot: ";
    cin >> n;

    return 0;
}