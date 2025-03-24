import java.util.Scanner;

public class Cau38a {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so luong phan tu trong mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap gia tri cua cac phan tu:");
        for(int i =0; i < n; i ++){
            arr[i]= sc.nextInt();
            sum += arr[i]; 
        }
        System.out.println("tong cac so la: " + sum);
    }
}
