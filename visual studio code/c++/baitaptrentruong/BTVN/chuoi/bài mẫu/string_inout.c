#include <stdio.h>
#include <string.h>
void charlwr(char *a){
    if(*a >= 'A' && *a <= 'Z')
        *a = *a + 32;
}
void my_strlwr(char *s){
    for(int i=0; i<strlen(s); i++)
        charlwr(&s[i]);

}
int main(){
    char s[100];
    fgets(s,sizeof(s),stdin);
    s[strlen(s)-1] = '\0';
    my_strlwr(s);
    printf("%s\n",s);
}