

import java.util.Scanner;

public class Cau8 {
    public static void main(String args[]){
        int soluongsoduong = 0;
        int tongsoduong = 0;
        int soluongsoam = 0;
        int tongsoam = 0;
        int num = 0;
        float trungbinh = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap vao cac so nguyen: ");
        do{
            num = sc.nextInt();
            if(num > 0){
                tongsoduong += num;
                soluongsoduong++;
            }else if(num <0){
                tongsoam +=num;
                soluongsoam++;
            }
        }while(num != 0);
        trungbinh = (tongsoduong+tongsoam)/(soluongsoam+soluongsoduong);
        System.out.println("tong so duong la: " + tongsoduong + "\ntong so am la: " + tongsoam);
        System.out.println("so luong so duong la: " + soluongsoduong + "\nso luong so am la: " +soluongsoam);
        System.out.println("trung binh cong cac so la: "+ trungbinh);
    }
}
