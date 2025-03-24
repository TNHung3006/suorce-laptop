
import java.util.Scanner;

public class Cau9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so nguyên n: ");
        int n = sc.nextInt();

        System.out.println("cac thua so cua so nguyen " +n+ " la: ");
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
