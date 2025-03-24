public class Cau45 {
    // Phương thức đệ quy tính tổng chuỗi
    public static double m(int i) {
        if (i == 1) {
            return 1.0 / 2;
        }
        return (double) i / (i + 1) + m(i - 1);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("m(" + i + ") = " + m(i));
        }
    }
}