import java.util.Scanner;
import java.util.Stack;

public class Cau21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap 1 so nguyen duong: ");
        int n = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();

        // Tìm tất cả các thừa số
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                stack.push(i);
            }
        }

        // In các thừa số theo thứ tự giảm dần
        System.out.print("cac thua so theo thu tu giam dan: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        scanner.close();
    }
}
