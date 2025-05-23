#include<stdio.h>
#include<math.h>

struct diem2d{
    float x,y;
};
struct hinh_chu_nhat{
    struct diem2d diem_tren_trai, diem_duoi_trai, 
                    diem_duoi_phai, diem_tren_phai;
};
void nhap_hinh_chu_nhat(hinh_chu_nhat &hcn){
    float temp;
    // nhap diem tren trai
    printf("moi nhap toa do x diem tren trai HCN: ");
    scanf("%f",&temp);
    hcn.diem_tren_trai.x = temp;
    printf("moi nhap toa do y diem tren trai HCN: ");
    scanf("%f",&temp);
    hcn.diem_tren_trai.y = temp;
    // nhap diem duoi phai
    printf("moi nhap toa do x diem duoi phai HCN: ");
    scanf("%f",&temp);
    hcn.diem_duoi_phai.x = temp;
    printf("moi nhap toa do y diem duoi phai HCN: ");
    scanf("%f",&temp);
    hcn.diem_duoi_phai.y = temp;
    // diem diem_duoi_trai, 
    hcn.diem_duoi_trai.x = hcn.diem_tren_trai.x;
    hcn.diem_duoi_trai.y = hcn.diem_duoi_phai.y;
    // diem diem_duoi_trai, 
    hcn.diem_tren_phai.x = hcn.diem_duoi_phai.x;
    hcn.diem_tren_phai.y = hcn.diem_tren_trai.y;
}
void xuat_hinh_chu_nhat(hinh_chu_nhat hcn){
    printf("Toa do dinh tren trai, duoi phai cua hinh chu nhat la: ");
    printf("\ntren_trai(%.2f,%.2f),duoi_phai(%.2f,%.2f)",
        hcn.diem_tren_trai.x,hcn.diem_tren_trai.y,
        hcn.diem_duoi_phai.x,hcn.diem_duoi_phai.y);
    printf("\ntren_phai(%.2f,%.2f),duoi_trai(%.2f,%.2f)",
    hcn.diem_tren_phai.x,hcn.diem_tren_phai.y,
    hcn.diem_duoi_trai.x,hcn.diem_duoi_trai.y);
}

void chieu_dai_rong_hcn(hinh_chu_nhat hcn, float &cd, float &cr){
    cd = sqrt(pow(hcn.diem_tren_phai.x - hcn.diem_tren_trai.x,2)+
              pow(hcn.diem_tren_phai.y - hcn.diem_tren_trai.y,2));
    cr = sqrt(pow(hcn.diem_tren_phai.x - hcn.diem_duoi_phai.x,2)+
              pow(hcn.diem_tren_phai.y - hcn.diem_duoi_phai.y,2));
}

float chuvi_hcn(hinh_chu_nhat hcn){
    float chuvi = 0.0, cd, cr;
    chieu_dai_rong_hcn(hcn,cd,cr);
    return (cd+cr)*2;
}
int main(){
    struct hinh_chu_nhat hcn1;
    //goi ham nhap xuat toa do cua cac dinh trong HCN
    nhap_hinh_chu_nhat(hcn1);
    xuat_hinh_chu_nhat(hcn1);
    printf("\nchu vi cua hinh chu nhat la: %.2f",chuvi_hcn(hcn1));
}