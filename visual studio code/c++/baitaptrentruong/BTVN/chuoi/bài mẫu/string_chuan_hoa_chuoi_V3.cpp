#include <stdio.h>
#include <string.h>
#define maxs 100

void Xoa(char a[], int vt){
	if (vt >= 0 && vt < strlen(a)){
		for (int i = vt; i < strlen(a) - 1; i++){
			a[i] = a[i + 1];
        }
		a[strlen(a)-1] = '\0';
	}
}
void xoa_kt_trai(char s[]){
    while (s[0]==' ') strcpy(&s[0],&s[1]);
}
void xoa_kt_phai(char s[]){
    while (s[strlen(s)-1]==' ')
        s[strlen(s)-1] = '\0';
}
void xoa_kt_giua(char s[]){
    size_t i=0;
    while (i<strlen(s)-1){
        if(s[i]==' ' and s[i+1]==' ') Xoa(s,i--);
        i++;
    }
}
void chuan_hoa_khoangtrang(char s[]){
    xoa_kt_trai(s);
    xoa_kt_phai(s);
    xoa_kt_giua(s);
}
void charlwr(char &a){
    if(a >= 'A' && a <= 'Z')
        a = a + 32;
}
void charupr(char &a){
    if(a >= 'a' && a <= 'z')
        a = a - 32;
}
void chuyen_kt_sang_thuong(char s[]){
    for(size_t i=0; i<strlen(s); i++)
        charlwr(s[i]);
}
void viet_hoa_kitu_dau_tu(char s[]){
    for(size_t i=0; i<strlen(s)-1; i++)
        if(s[i]==' ' and s[i+1]!=' ')
            charupr(s[i+1]);
}
void chuan_hoa_chuoi(char s[]){
    chuyen_kt_sang_thuong(s);
    viet_hoa_kitu_dau_tu(s);
    chuan_hoa_khoangtrang(s);
}

int main(){
    char s[maxs];
    fgets(s,sizeof(s),stdin);
    s[strlen(s)-1] = '\0';
    printf("chuoi vua nhap la: %s\n",s);
    chuan_hoa_chuoi(s);
    printf("chuoi sau khi xoa toan bo ki tu khoang trang:%s", s);
}
//   in:     ngUyen     VaN  a !G1    ->NgUyen VaN A !G1  -> out: Nguyen Van A 