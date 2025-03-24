import java.util.Scanner;

public class Cau36 {
     // Phương thức tính số Fibonacci bằng đệ quy
    public static long fib1(long index) {
        if (index <= 1) {
            return index;
        }
        return fib1(index - 1) + fib1(index - 2);
    }

    // Phương thức tính số Fibonacci bằng vòng lặp
    public static long fib2(long index) {
        if (index <= 1) {
            return index;
        }
        long a = 0, b = 1, fib = 0;
        for (long i = 2; i <= index; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chi so Fibonacci: ");
        long index = scanner.nextLong();

        long fib1Result = fib1(index);
        long fib2Result = fib2(index);

        System.out.println("Fibonacci thu " + index + " de quy: " + fib1Result);
        System.out.println("Fibonacci thu " + index + " vong lap: " + fib2Result);

        scanner.close();
    }
}
