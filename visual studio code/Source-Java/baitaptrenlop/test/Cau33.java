import java.util.Scanner;

public class Cau33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot chuoi: ");
        String str = scanner.nextLine();

        if (isPalindrome(str)) {
            System.out.println("Chuoi \"" + str + "\" la palindrom.");
        } else {
            System.out.println("Chuoi \"" + str + "\" khong phai la palindrom.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Chuyển đổi chuỗi thành chữ thường và loại bỏ khoảng trắng
        String cleanStr = str.toLowerCase().replaceAll("\\s+", "");

        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
