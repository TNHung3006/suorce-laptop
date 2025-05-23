#include <stdio.h>
#include <string.h>
#define maxs 100
void delete_spaces(char *s, char *snew){
    int i,j=0;
    for(i=0;i<strlen(s);i++){
        if(s[i]!=' ') snew[j++]=s[i];
    }
    snew[j]='\0';
}
int main(){
    char s[maxs], snew[maxs];
    fgets(s,sizeof(s),stdin);
    s[strlen(s)-1] = '\0';
    printf("chuoi vua nhap la: %s\n",s);
    delete_spaces(s,snew);
    printf("chuoi sau khi xoa khoang trang la: %s",snew);
}