public class Cau48 {

    public static void reverseDisplay(int value) {
        if (value < 10) {
            System.out.print(value);
        } else {
            System.out.print(value % 10);
            reverseDisplay(value / 10);
        }
    }

    public static void main(String[] args) {
        reverseDisplay(2341);
    }
}