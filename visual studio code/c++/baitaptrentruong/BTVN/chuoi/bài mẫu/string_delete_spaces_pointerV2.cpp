#include <stdio.h>
#include <string.h>
#define maxs 100
char* delete_spaces(char *s){
    char snew[maxs], *p=snew;
    int i,j=0;
    for(i=0;i<strlen(s);i++){
        if(s[i]!=' ') snew[j++]=s[i];
    }
    snew[j]='\0';
    return p;
}
int main(){
    char s[maxs], ps[maxs];
    fgets(s,sizeof(s),stdin);
    s[strlen(s)-1] = '\0';
    printf("chuoi vua nhap la: %s\n",s);
    stpcpy(ps,delete_spaces(s));
    printf("chuoi sau khi xoa khoang trang la:%s",ps);
}