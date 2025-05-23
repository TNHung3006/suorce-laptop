#include <iostream>
#include <string.h>
using namespace std;

//Bài 3: Viết hàm nhận vào một chuỗi s và trả về chuỗi tương ứng sau khi xóa các khoảngtrắng.
void XoaKhoangTrang(char s[], char s1[]){
    int j = 0;
    for(int i = 0; i< strlen(s); i++){
        if(s[i] != ' ') s1[j++] = s[i];
    }
    s1[strlen(s)-1] = '\0';
}

int main(){
    char s[107], s1[107];
    cout << "nhap vao 1 chuoi ki tu s: ";
    fgets(s, sizeof(s), stdin);
    s[strlen(s)-1] = '\0';
    XoaKhoangTrang(s, s1);
    cout << "chuoi ban dau co dang la: " << s << endl;
    cout << "chuoi sau khi xoa khoang trang la: "<< s1 << endl;

    return 0;
}