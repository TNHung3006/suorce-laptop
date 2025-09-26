#include <iostream>
#include <string.h>
using namespace std;

// Bài 4: Viết hàm nhận vào một chuỗi s và đếm xem có bao nhiêu từ trong chuỗi đó.
int DemTu(char s[]){
    int dem = 0;
    for(size_t i = 0; i<strlen(s); i++){
        if(s[i] != ' ' && (s[i+1] == ' ' || s[i+1] == '\0' )) dem++;
    }
    return dem;
}

// Bài 5: Viết hàm nhận vào một chuỗi s và xuất các từ trên các dòng liên tiếp.
void XuongDong(char s[]){
    while(s[0] == ' ') strcpy(&s[0], &s[1]);
    for(size_t i = 0; i<strlen(s); i++){
        cout << s[i];
        if(s[i] == ' ' && s[i+1] != ' ')    
            cout << endl;
    }
}
//Bài 6: Viết hàm tìm từ có chiều dài lớn nhất và xuất ra màn hình từ đó và độ dài tương ứng.
void DemChieuDai(char s[]){
    char s_hientai[107] = "", smax[107] = "";
    int dem = 0;
    int max = 0;
    for(int i = 0; i < strlen(s); i++){
        if(s[i] != ' ') s_hientai[dem++] = s[i];
        else {
            s_hientai[dem] = '\0';
            if (max <strlen(s_hientai)) {
                max = strlen(s_hientai);
                strcpy(smax, s_hientai);
            }
            dem = 0;
        }
    }
    if (max > 0) {
        cout << "\nDo dai lon nhat la: " << max << endl;
        cout << "Tu dai nhat la: " << smax << endl;
    }else cout << "Khong co tu nao trong chuoi" << endl;
}


int main(){
    char s[107], s1[107];
    cout << "nhap 1 chuoi ngau nhien: ";
    fgets(s, sizeof(s), stdin);
    s[strlen(s)-1]='\0';
    strcpy(s1, s);
    cout << "so luong tu trong chuoi la: " << DemTu(s1) << endl;
    XuongDong(s1);

    // từ có chiều dài lớn nhất và xuất ra màn hình từ đó và độ dài tương ứng.
    DemChieuDai(s);
    return 0;
}