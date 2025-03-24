import java.util.Scanner;
// Dòng 11 có lỗi cú pháp không? Mô tả ngắn gọn chức năng của chương trình này.
public class EvalSqrt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x;

        System.out.print("Enter a value for x or -1 to exit: ");
        x = scan.nextDouble();

        for (; x >= 0.0; ) {
            System.out.println("Square root of " + x + " is " + Math.sqrt(x));

            System.out.print("Enter a value for x or <0 to exit: ");
            x = scan.nextDouble();
        }
    }
}