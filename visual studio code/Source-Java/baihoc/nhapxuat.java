package baihoc;
import java.util.Scanner;

public class nhapxuat {
    public static void main(String[] args) {
        // //khởi tạo 1 đối tượng scanner
        // Scanner sc = new Scanner(System.in);

        // //cho phép nhập chuỗi
        // System.out.print("Moi nhap mk cap 1: ");
        // String mk1 = sc.nextLine();
        // //Hoặc
        // String mk = new Scanner(System.in).nextLine();
        // System.out.println("mk cap 1 la: " + mk1);
        // System.out.println("mk la: " + mk);

        // //nhập số nguyên
        // System.out.print("moi nhap so nguyen: ");
        // int a = sc.nextInt();
        // System.out.println("So nguyen co gia tri la: " + a);

        // //nhập số nguyên
        // System.out.print("moi nhap so thuc: ");
        // float b = sc.nextFloat();
        // System.out.println("So thuc co gia tri la: " + b);

        // ----- Bài Tập ----- //
        //tính chu vi và diện tích hình tròn
        System.out.print("Nhap ban kinh: ");
        double r = new Scanner(System.in).nextDouble();
        double cv = 2 * Math.PI * r;
        double dt = Math.PI * Math.pow(r, 2);
        System.out.println("chu vi: " + cv);
        System.out.println("Dien tich: " + dt);
        
    }
}
