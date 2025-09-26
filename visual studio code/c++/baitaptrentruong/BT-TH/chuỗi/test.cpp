#include <iostream>
#include <string.h>
using namespace std;

void Xoa(char s[],int vt){
    if(vt >= 0 && vt < strlen(s))
    for(int i = vt; i < strlen(s) - 1; i++){
        s[i] = s[i+1];
    }
    s[strlen(s) - 1] = '\0';
}

void XoaKTTrai (char s[]){
    while(s[0] == ' ') strcpy(&s[0], &s[1]);
}
void XoaKTPhai (char s[]){
    while (s[strlen(s)-1] == ' ') s[strlen(s)-1] = '\0';
}
void XoaKTGiua (char s[]){
    size_t i = 0;
    while (i < strlen(s)){
        if(s[i] == ' ' && s[i+1] == ' ') Xoa(s, i--);
        i++;
    }
}

void ChuanHoaKhoangTrang(char s[]){
    XoaKTTrai(s);
    XoaKTPhai(s);
    XoaKTGiua(s);
}

void strlwr(char &s){
    if(s >= 'A' && s <= 'Z')
        s+=32;
}
void strupr(char &s){
    if(s >= 'a' && s <= 'z')
        s-=32;
}

void my_strlwr(char s[]){
    for(int i = 0; i < strlen(s); i++){
        strlwr(s[i]);
    }
}
void my_strupr(char s[]){   
    if(s[0] != ' ') strupr(s[0]);
    for(int i = 0; i < strlen(s); i++){
        if(s[i] == ' ') strupr(s[i+1]);
    }
    ChuanHoaKhoangTrang(s);
}

//Dem kí tự trong chuỗi là
int DemKiTu(char s[]){
    int Dem = 0;
    for(int i = 0; i < strlen(s); i++){
        if(s[i] != ' ') Dem++;
    }
    return Dem;
}

//Dem tu trong chuoi
int Demtutrongchuoi(char s[]){
    int Dem = 0;
    for(int i = 0; i < strlen(s); i++){
        if(s[i] != ' ' && (s[i+1] == ' ' || s[i+1] == '\0')) Dem++;
    }
    return Dem;
}

//in ra từ dài nhất trong chuỗi và in số lượng của từ đó
void TuDaiNhat(char s[]){
    char smax[107] = "", s_hientai[107] = "";
    int Dem = 0, max = 0;
    for(int i = 0; i < strlen(s); i++){
        if(s[i] != ' ') s_hientai[Dem++] = s[i];
        else{
            s_hientai[Dem] ='\0';
            if(max < strlen(s_hientai)){
                max = strlen(s_hientai);
                strcpy(smax, s_hientai);
            }
            Dem = 0;
        }
    }
    if(max > 0) {
        cout << "tu dai nhat trong chuoi la: " << smax << "\nchieu dai cua tu do la: " << max << endl;
    }else cout << "trong chuoi khong co tu\n";
}
// Hàm kiểm tra chuỗi con
// Trả về 1 nếu chuỗi con nằm trong chuỗi mẹ, 0 nếu không
int KiemTraChuoiCon(char chuoiMe[], char chuoiCon[]) {
    if(strlen(chuoiCon) == 0) return 1;
    if(strlen(chuoiCon) > strlen(chuoiMe)) return 0;

    // Duyệt qua chuỗi mẹ
    for (int i = 0; i <= strlen(chuoiMe) - strlen(chuoiCon); i++) {
        int j;
        for (j = 0; j < strlen(chuoiCon); j++) {
            if (chuoiMe[i + j] != chuoiCon[j]) {
                return 0;
            }
        }
        if (j == strlen(chuoiCon)) {
            return 1;
        }
    }
    return 0; // Không tìm thấy chuỗi con sau khi duyệt hết
}

int Kiemtrachuoi(char s[], char s1[]){
    if(strlen(s1)> strlen(s)) return 0;
    for(int i =0; i<= strlen(s)-strlen(s1); i++){
        for(int j =0; j<strlen(s1); j++)
            if(s[i+j]!=s[j]) return 0;
        if(j == strlen(s1)) return 1;
    }
    return 0;
}

int main(){
    char s[107], s1[107];
    cout << "nhap chuoi s: ";
    fgets(s, sizeof(s), stdin);
    s[strlen(s)-1] = '\0';
    cout << "Nhap chuoi s1: ";
    fgets(s1, sizeof(s1), stdin);
    s1[strlen(s1) - 1] = '\0';
    // cout << "chuoi ban dau co dang la: " << s << endl;
    // my_strlwr(s);
    // my_strupr(s);
    // cout << "Chuoi sau khi chuan hoa va viet hoa la: " << s << endl;
    // cout << "Tong so ki tu trong chuoi la: " << DemKiTu(s) << endl;
    // cout << "Tong so tu trong chuoi la: " << Demtutrongchuoi(s) << endl;
    // TuDaiNhat(s);

    if(KiemTraChuoiCon(s, s1)) cout << "chuoi moi da nhap co trong chuoi cu\n";
    else cout << "chuoi moi da nhap khong co trong chuoi cu\n";
    return 0;
}