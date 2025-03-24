import java.util.Scanner;

public class Cau44 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap 1 xau: ");
        String input = scanner.nextLine();

        tachTu(input);

        scanner.close();
    }

    public static void tachTu(String input) {
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetter(c)) {
                currentWord.append(c);
            } else {
                if (currentWord.length() > 0) {
                    System.out.println(currentWord.toString());
                    currentWord.setLength(0); // Xóa nội dung của StringBuilder
                }
            }
        }

        // In từ cuối cùng (nếu có)
        if (currentWord.length() > 0) {
            System.out.println(currentWord.toString());
        }
    }
}