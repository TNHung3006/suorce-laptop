import java.util.Scanner;

public class Cau23 {
    public static int reverse(int n){
        int index = 0;
        int tmp = n;
        while(tmp != 0){
            index = index*10 + tmp%10;
            tmp = tmp / 10;
        } 
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so nguyen n: ");
        int n = sc.nextInt();
        System.out.print("so dao nguoc cua so nguyen " +n+ " la: " + reverse(n));
        sc.close();
    } 
}
