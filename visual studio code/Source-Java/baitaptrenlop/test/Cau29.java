public class Cau29 {
    // Phương thức tính trung bình của mảng số nguyên
    public static int average(int[] array) {
        int sum = 0;
        for (int i=0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    // Phương thức tính trung bình của mảng số thực
    public static double average(double[] array) {
        double sum = 0;
        for (int i=0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6};
        double[] doubleArray = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};

        int intAverage = average(intArray);
        double doubleAverage = average(doubleArray);

        System.out.println("Trung bình của mảng số nguyên: " + intAverage);
        System.out.println("Trung bình của mảng số thực: " + doubleAverage);
    }
}
