import java.util.Scanner;

public class Cau32 {
    public static String convertMillis(long timeMillis) {
        long seconds = timeMillis / 1000;
        long hours = seconds / 3600;
        seconds %= 3600;
        long minutes = seconds / 60;
        seconds %= 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so milli giay: ");
        long n = sc.nextLong();

        System.out.println(convertMillis(n));
    }
}
