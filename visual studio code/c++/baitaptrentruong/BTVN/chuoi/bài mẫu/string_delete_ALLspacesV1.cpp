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
// void xoa_kt_trai(char s[]){
//     while (s[0]==' ')
//         Xoa(s,0);
// }
void xoa_kt_trai(char s[]){
    for(size_t i=0; i<strlen(s); i++)
        if(s[i]==' ') Xoa(s,i--);
        else break; 
}
void xoa_kt_phai(char s[]){
    for(size_t i=strlen(s)-1; i>=0; i--)
        if(s[i]==' ') s[i]='\0';
        else break; 
}
int main(){
    char s[maxs];
    fgets(s,sizeof(s),stdin);
    s[strlen(s)-1] = '\0';
    printf("chuoi vua nhap la: %s\n",s);
    xoa_kt_phai(s);
    printf("chuoi sau khi xoa toan bo ki tu khoang trang ben phai:%s", s);
}