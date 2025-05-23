#include <stdio.h>
#include <string.h>

char charupr(char a){
    if(a >= 'a' && a <= 'z')
        a = a - 32;
    return a;
}
char* my_strupr(char s[]){
    char new_s[strlen(s)], *p = new_s;
    for(int i=0; i<strlen(s); i++)
        new_s[i] = charupr(s[i]);
    return p;
}
int main(){
    char s[100], s1[100];
    fgets(s,sizeof(s),stdin);
    s[strlen(s)-1] = '\0';
    strcpy(s1, my_strupr(s));
    printf("chuoi goc ban dau %s\nchuoi sau khi xu ly %s\n",s,s1);
}