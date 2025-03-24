
import java.util.Scanner;

public class Cau19 {
    public static int sumDigits(int n){
        int tmp = n;
        int S = 0;

        while (tmp != 0) {
            S += tmp%10;
            tmp = tmp / 10;
        }

        return S;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so nguyen n: ");
        int n = sc.nextInt();
        System.out.print("Tong cac chu so cua 1 so nguyen: " + sumDigits(n));

    }
}
