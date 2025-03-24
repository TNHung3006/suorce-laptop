import java.util.Scanner;

public class Cau26 {
    public static int uscln(int m, int n){
        if(n==0) return m;
        return uscln(n, m%n);
    }

    // Phương thức tính BSCNN
    public static int bscnn(int m, int n) {
        return (m * n) / uscln(m, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 2 so nguyen a b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("uoc chung lon nhat cua 2 so nguyen a b la: " + uscln(a, b));
        System.out.print("boi chung nho nhat cua 2 so nguyen a b la: " + bscnn(a, b));

        sc.close();
    }
}
