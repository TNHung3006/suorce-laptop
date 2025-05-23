#include<iostream>
#include<math.h>
using namespace std;

struct DIEM{
    float x;
    float y;
};
void NhapDiem(DIEM &diem){
    cout << "nhap vao toa do truc x: ";
    cin >> diem.x;
    cout << "nhap vao toa do truc y: ";
    cin >> diem.y;
}
void XuatDiem(DIEM& diem) {
    cout << "Toa do la: (" << diem.x << ", " << diem.y << ")" << endl;
}
float KhoangCach2Diem(DIEM &A, DIEM &B){
    float KhoangCach = sqrt(pow((B.x-A.x) , 2) + pow((B.y-A.y), 2));
    return KhoangCach;
}

//hàm tìm đối xứng qua gốc tọa độ
DIEM DiemDoiXungQuaGoc(const DIEM& diem) {
    DIEM diemDoiXung;
    diemDoiXung.x = -diem.x;
    diemDoiXung.y = -diem.y;
    return diemDoiXung;
}

//hàm tìm điểm đối xứng qua trục Ox
DIEM DiemDoiXungQuaOx(const DIEM& diem) {
    DIEM diemDoiXung;
    diemDoiXung.x = diem.x;
    diemDoiXung.y = -diem.y;
    return diemDoiXung;
}

//hàm tìm điểm đối xứng qua trục Oy
DIEM DiemDoiXungQuaOy(DIEM& diem) {
    DIEM diemDoiXung;
    diemDoiXung.x = -diem.x;
    diemDoiXung.y = diem.y;
    return diemDoiXung;
}
//tìm điểm thuộc phần tư nào
void kiemTraPhanTu(DIEM& diem) {
    if (diem.x > 0 && diem.y > 0) {
        cout << "Diem thuoc phan tu thu nhat (I)." << endl;
    } else if (diem.x < 0 && diem.y > 0) {
        cout << "Diem thuoc phan tu thu hai (II)." << endl;
    } else if (diem.x < 0 && diem.y < 0) {
        cout << "Diem thuoc phan tu thu ba (III)." << endl;
    } else if (diem.x > 0 && diem.y < 0) {
        cout << "Diem thuoc phan tu thu tu (IV)." << endl;
    } else if (diem.x == 0 && diem.y != 0) {
        cout << "Diem nam tren truc Oy." << endl;
    } else if (diem.y == 0 && diem.x != 0) {
        cout << "Diem nam tren truc Ox." << endl;
    } else {
        cout << "Diem la goc toa do." << endl;
    }
}

int main(){
    DIEM A, B;
    //nhập xuất 1 điểm trong trục tọa độ.
    cout << "nhap thong tin toa do diem A\n";
    NhapDiem(A);
    XuatDiem(A);

    cout << "nhap thong tin toa do diem B\n";
    //tính khoảng cách giữa 2 điểm trong trục tọa độ
    NhapDiem(B);
    XuatDiem(B);
    cout << "khoang cach giua 2 diem la: " << KhoangCach2Diem(A, B) << endl;

    // Tìm điểm đối xứng qua gốc tọa độ
    DIEM diemDoiXungGoc = DiemDoiXungQuaGoc(A);
    cout << "Diem doi xung cua A qua goc toa do ";
    XuatDiem(diemDoiXungGoc);

    // Tìm điểm đối xứng qua trục Ox
    DIEM diemDoiXungOx = DiemDoiXungQuaOx(A);
    cout << "Diem doi xung cua A qua truc Ox ";
    XuatDiem(diemDoiXungOx);

    // Tìm điểm đối xứng qua trục Oy
    DIEM diemDoiXungOy = DiemDoiXungQuaOy(A);
    cout << "Diem doi xung cua A qua truc Oy ";
    XuatDiem(diemDoiXungOy);


    return 0;
}