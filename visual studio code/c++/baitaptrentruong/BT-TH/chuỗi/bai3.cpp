#include <iostream>
#include <string.h>
using namespace std;

void XoaKhoaTrang(char S1[], char S2[]){
    int j=0;
    for(int i = 0; i < strlen(S1); i++){
        if(S1[i] != ' '){
            S2[j++] = S1[i];
        } 
    }
    S2[j]='\0';
}
int main(){
    char s[107], s1[107];
    cout << "nhap vao 1 chuoi bat ki: ";
    fgets(s, sizeof(s), stdin);
    s[strlen(s)-1] = '\0';
    cout << "chuoi vua nhap la: " << s << endl;
    XoaKhoaTrang(s, s1);
    cout << "chuoi sau khi xoa khoang trang la: " << s1 << endl;
    return 0;
}