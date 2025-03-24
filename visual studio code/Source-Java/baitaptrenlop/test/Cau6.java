

import java.util.Scanner;

public class Cau6{
	public static void main (String args[]){
        System.out.println("nhap vao 3 so nguyen: ");
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();
        int num3 = new Scanner(System.in).nextInt();
        if(num1 > num2){
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        if(num2 > num3){
            int tmp = num2;
            num2 = num3;
            num3 = tmp;
            if(num1 > num2){
                int tmp1 = num1;
                num1 = num2;
                num2 = tmp1;
            }
        }
        System.out.println("Cac so nguyen co gia tri la: " + num1 + "<=" + num2 + "<=" + num3);


	}
}