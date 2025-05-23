#include <iostream>
#include <math.h>

using namespace std;

struct Diem {
    int x;
    int y;
};

struct TAMGIAC {
    Diem dinhA;
    Diem dinhB;
    Diem dinhC;
};

void nhapTamGiac(TAMGIAC& tamGiac) {
    cout << "Nhap toa do dinh A:\n";
    cout << "Hoanh do (x): ";
    cin >> tamGiac.dinhA.x;
    cout << "Tung do (y): ";
    cin >> tamGiac.dinhA.y;

    cout << "\nNhap toa do dinh B:\n";
    cout << "Hoanh do (x): ";
    cin >> tamGiac.dinhB.x;
    cout << "Tung do (y): ";
    cin >> tamGiac.dinhB.y;

    cout << "\nNhap toa do dinh C:\n";
    cout << "Hoanh do (x): ";
    cin >> tamGiac.dinhC.x;
    cout << "Tung do (y): ";
    cin >> tamGiac.dinhC.y;
}

void xuatTamGiac(TAMGIAC& tamGiac) {
    cout << "Toa do dinh A: (" << tamGiac.dinhA.x << ", " << tamGiac.dinhA.y << ")\n";
    cout << "Toa do dinh B: (" << tamGiac.dinhB.x << ", " << tamGiac.dinhB.y << ")\n";
    cout << "Toa do dinh C: (" << tamGiac.dinhC.x << ", " << tamGiac.dinhC.y << ")\n";
}
double tinhDoDaiCanh(Diem& p1, const Diem& p2) {
    return sqrt(pow(p1.x - p2.x, 2) + pow(p1.y - p2.y, 2));
}

double tinhChuVi(TAMGIAC& tamGiac) {
    double a = tinhDoDaiCanh(tamGiac.dinhB, tamGiac.dinhC);
    double b = tinhDoDaiCanh(tamGiac.dinhA, tamGiac.dinhC);
    double c = tinhDoDaiCanh(tamGiac.dinhA, tamGiac.dinhB);
    return a + b + c;
}

double DienTichTamGiac(TAMGIAC& tamGiac) {
    float DienTich = 0.5 * abs(tamGiac.dinhA.x * (tamGiac.dinhB.y - tamGiac.dinhC.y) +
    tamGiac.dinhB.x * (tamGiac.dinhC.y - tamGiac.dinhA.y) +
    tamGiac.dinhC.x * (tamGiac.dinhA.y - tamGiac.dinhB.y));
    return DienTich;
}

int main() {
    TAMGIAC ABC;

    cout << "Nhap thong tin tam giac:\n";
    nhapTamGiac(ABC);

    cout << "\nThong tin tam giac da nhap:\n";
    xuatTamGiac(ABC);

    cout << "\nChu vi tam giac: " << tinhChuVi(ABC);

    cout << "\nDien tich tam giac la: " << DienTichTamGiac(ABC);

    return 0;
}