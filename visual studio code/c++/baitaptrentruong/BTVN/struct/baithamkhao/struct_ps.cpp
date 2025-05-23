#include<stdio.h>
struct ps{
    int tu, mau;
};
void nhap_ps(ps &p){
    scanf("%d/%d",&p.tu,&p.mau);
}
void xuat_ps(ps p){
    printf("%d/%d",p.tu,p.mau);
}
int uscln_songuyen(int x, int y){
    int uscln = 1;
    int max_loop = x<y?x:y;
    for(int i=2; i<=max_loop; i++)
        if(x%i==0 and y%i==0) uscln = i;
    return uscln;
}
void rut_gon_ps(ps &p){
    int tu = p.tu, mau = p.mau;
    int uscln = uscln_songuyen(tu,mau);
    p.tu = tu/uscln;
    p.mau = mau/uscln;
}
int main(){
    struct ps p1,p2;
    printf("moi nhap ps1 (dinh dang tu/mau): ");
    nhap_ps(p1);
    printf("phan so p1="); xuat_ps(p1);
    printf("\nrut gon ps p1=");
    rut_gon_ps(p1);
    xuat_ps(p1);
    // printf("moi nhap ps2 (dinh dang tu/mau): ");
    // nhap_ps(p2);
    // printf("phan so p1="); xuat_ps(p1);
    // printf("\nphan so p2="); xuat_ps(p2);
}