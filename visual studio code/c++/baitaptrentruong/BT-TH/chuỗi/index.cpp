#include <iostream>
#include <string.h>
using namespace std;

void strlwr(char &a){
    if(a >= 'A' && a <= 'Z' )
        a+=32;
}
void Mystrlwr(char s[]){
    for(int i = 0; i < strlen(s); i++){
        strlwr(s[i]);
    }
}

void strupr(char &a){
    if(a >= 'a' && a <= 'z' )
        a-=32;
}

void Mystrupr(char s[]){
    for(int i = 0; i < strlen(s); i++){
        strupr(s[i]);
    }
}

//chuỗi ngược
void Swap(char &a, char &b){
    char tmp = a;
    a=b;
    b=tmp;
}
char *strrev(char *s){
    unsigned long n =strlen(s);
    for(int i=0; i < n/2; i++){
        Swap(s[i], s[n-i-1]);
    }
    return s;
}

int KT_SDX(char s[]){
    int n = strlen(s);
    for(int i = 0; i < n; i++){
        if(s[i] != s[n-1-i]) return 0;
    }
    return 1;
}
void Space_KiTu(char s[]){
    for(int i = 0; i < strlen(s); i++){
        if(s[i] !=' ' && s[i+1] != ' '){
            cout << s[i] << " ";
        }else cout << s[i];
    }
}

void ChuanHoa(char s[]){
    if(s[0] != ' ') strupr(s[0]);
    for(int i = 0; i < strlen(s); i++){
        if(s[i] == ' ') strupr(s[i+1]);
    }
}

int KT2ChuoiBangNhau(char s1[], char s2[]){
    int i = 0;
    if(strlen(s1) != strlen(s2)) return 0;
    while (s1[i] !='\0'){
        if(s1[i] != s2[i]) return 0;
        i++;
    }
    return 1;
}

int DemCacKitu(char s[]){
    int count = 0;
    int i = 0;
    while (s[i] != '\0') {
        char ch = s[i];
        if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
            count++;
        }
        i++;
    }
    return count;
}

void sapxeptangdan(char s[]){
    int n = strlen(s);
    for(int i = 0; i < n-1; i++){
        for(int j = i+1; j < n; j++){
            if(s[i] > s[j]){
                Swap(s[i], s[j]);
            }
        }
    }
}
void sapxepgiandan(char s[]){
    int n = strlen(s);
    for(int i = 0; i < n-1; i++){
        for(int j = i+1; j < n; j++){
            if(s[i] < s[j]){
                Swap(s[i], s[j]);
            }
        }
    }
}

void XuongDong_KiTu(char s[]){
    for(int i = 0; i < strlen(s); i++){
        if(s[i] != ' ') cout << s[i] << endl;
    }
}
int DemSoKiTu(char s[]){
    int count = 0;
    for(int i = 0; i < strlen(s); i++){
        if(s[i] != ' ') count++;
    }
    return count;
}

int DemSoTu(char s[]){ 
    int dem = 0;
    for(size_t i = 0; i<strlen(s); i++){
        if(s[i] != ' ' and (s[i+1] == ' ' or s[i+1] == '\0')) dem++;
    }
    return dem;
}

void XuongDong(char s[]){
    while(s[0] == ' ') strcpy(&s[0], &s[1]);
    for(size_t i = 0; i<strlen(s); i++){
        cout << s[i];
        if(s[i] == ' ' && s[i+1] != ' ')    
            cout << endl;
    }
}

void Xoa(char s[], int vtri){
    if(vtri >= 0 && vtri < strlen(s)){
        for(int i = vtri; i < strlen(s)-1; i++){
            s[i] = s[i+1];
        }
        s[strlen(s)-1] ='\0';
    }
}
//Xoá khoảng trắng trái
void XoaKTTrai(char s[]){
    while (s[0] == ' ') strcpy(&s[0], &s[1]);
}
//Xoá khoảng trắng phải
void XoaKTPhai(char s[]){
    while (s[strlen(s)-1] == ' ')
        s[strlen(s)-1] = '\0';
}
//Xoá khoảng trắng giửa
void XoaKTGiua(char s[]){
    size_t i= 0;
    while (i < strlen(s)){
        if(s[i] == ' ' && s[i+1] == ' ')  Xoa(s, i--);
        i++;
    }
}
void ChuanHoaKhoangTrang(char s[]){
    XoaKTTrai(s);
    XoaKTPhai(s);
    XoaKTGiua(s);
}

//chuyển kí tự đàu từ thành in hoa và chuẩn hoá.
void ChuanHoaChuoi(char s[]){
    if(s[0] != ' ') strupr(s[0]);
    for(int i = 0; i < strlen(s)-1; i++){    
        if (s[i] == ' ') strupr(s[i+1]);
    }
    ChuanHoaKhoangTrang(s);
}

void Intudautien(char s[]){
    ChuanHoaKhoangTrang(s);
    for(int i = 0; i <strlen(s); i++){
        if(s[i] != ' ') cout << s[i];
        else {
            cout << endl;
            break;
        }
    }
}

void Intucuoi(char s[]){
    ChuanHoaKhoangTrang(s);
    for(int i = strlen(s)-1; i >= 0; i--){
        if(s[i] != ' ') cout << s[i];
        else {
            cout << endl;
            break;
        }
    }
}

int main(){
    char s[207], s1[207];
    cout << "nhap vao 1 chuoi: ";
    fgets(s,sizeof(s),stdin);
    s[strlen(s)-1]='\0';
    cout << "chuoi ban dau co dang la: " << s << "\nva do dai chuoi la: " << strlen(s) << endl;
    strcpy(s1, s);
    //1.3,1.4
    // Mystrlwr(s1);
    // Mystrupr(s1);
    // cout << s1 << endl;
    //1.5
    // strrev(s1);
    // cout << "Chuoi sau khi dao nguoc la: " << s1 << endl;
    //1.6
    // if(KT_SDX(s1)) cout << "La chuoi doi xung\n";
    // else cout << "La chuoi khong doi xung\n";
    //1.7
    //Space_KiTu(s1);
    //1.8
    // ChuanHoa(s1);
    // cout << "chuoi sau khi chuan hoa: " << s1 << endl;
    //1.9
    //kiểm tra 2 chuỗi có bằng nhau không
    // cout << "nhap vao 1 chuoi: ";
    // char s2[207];
    // fgets(s2, sizeof(s2), stdin);
    // s2[strlen(s2)-1] = '\0';
    // if(KT2ChuoiBangNhau(s1, s2)) cout << "2 chuoi bang nhau\n";
    // else cout << "2 chuoi khong bang nhau\n";
    //1.10
    // cout << "so luong ki tu trong chuoi la: " << DemCacKitu(s1) << endl;
    //1.11
    // sapxeptangdan(s1);
    // cout << "chuoi sau khi sap xep la: " << s1 << endl;
    // sapxepgiandan(s1);
    // cout << "chuoi sau khi sap xep giam dan la: " << s1 << endl;
    //1.12
    // XuongDong_KiTu(s1);
    // cout << "so luong ki tu trong chuoi la: " << DemSoKiTu(s1) << endl;
    //1.13
    cout << "so luong tu trong chuoi la: " << DemSoTu(s1) << endl;
    Intudautien(s1);
    Intucuoi(s1);
    // cout << "chuoi sau khi xuong dong la: " << endl;
    // XuongDong(s1);
    //1.14
    // if(KT_SDX(s2)) cout << "La chuoi doi xung\n";
    // else cout << "La chuoi khong doi xung\n";
    //1.15
    // ChuanHoaChuoi(s1);
    // cout << "chuoi sau khi chuan hoa la: " << s1 << endl;
    
    return 0;
}