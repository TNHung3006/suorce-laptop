#include <iostream>
#include <string.h>
using namespace std;

//Bài 4: Viết hàm nhận vào một chuỗi s và đếm xem có bao nhiêu từ trong chuỗi đó.
int DemSoTu(char s[]){ //abc
    int dem = 0;
    for(size_t i = 0; i<strlen(s); i++){
        if(s[i] != ' ' and (s[i+1] == ' ' or s[i+1] == '\0')) dem++;
    }
    return dem;
}
int main(){
    char s[107];
    cout << "nhap vao 1 chuoi ki tu s: ";
    fgets(s, sizeof(s), stdin);
    s[strlen(s)-1]='\0';
    cout << "chuoi co so luong tu la: " << DemSoTu(s) << endl;

    return 0;
}