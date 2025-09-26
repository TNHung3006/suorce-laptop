#include <iostream>
#include <string.h>
using namespace std;

//Bài 2: Viết hàm nhận vào một chuỗi và trả về chuỗi tương ứng (giữ nguyên chuỗi đầu vào): Các ký tự đầu tiên mỗi từthànhkýtựhoa. Chuẩn hóa chuỗi (xóa khoảng trắng thừa).
//input:     tRaN    NgOc   hUNG  -> output: Tran Ngoc Hung

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
    while (s[strlen(s)-1] == ' ') s[strlen(s)-1] = '\0';
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
void strlwr(char &a){
    if(a >= 'A' && a <= 'Z')
        a = a + 32;
}
//chuyển tất cả kí tự thành in thường
void my_strlwr(char s[]){
    for(int i=0; i<strlen(s); i++)
        strlwr(s[i]);
}
void strupr(char &a){
    if(a >= 'a' && a <= 'z')
        a = a - 32;
}
//chuyển kí tự đàu từ thành in hoa và chuẩn hoá.
void ChuanHoaChuoi(char s[]){
    if(s[0] != ' ') strupr(s[0]);
    for(int i = 0; i < strlen(s)-1; i++){    
        if (s[i] == ' ') strupr(s[i+1]);
    }
    ChuanHoaKhoangTrang(s);
}
int main(){
    char s[207], s1[206];
    cout << "nhap vao 1 chuoi s co cac ki tu thuong: ";
    fgets(s,sizeof(s), stdin);
    s[strlen(s)-1] = '\0';
    strcpy(s1, s);
    my_strlwr(s1);
    ChuanHoaChuoi(s1);
    cout << "chuoi s1 sau khi chuyen doi ki tu va chuan hoa la: " << s1 << endl;

    return 0;
}