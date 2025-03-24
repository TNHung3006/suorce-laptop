public class SameName {
    // Chương trình này có lỗi gì? Hãy sửa lại cho đúng!
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int j = 0; j < 8; j = j + 2)
            sumEven = sumEven + j;

        System.out.println("The sum of evens is: " + sumEven);

        for (j = 1; j < 8; j = j + 2)      // Notice the change in this line
            sumOdd = sumOdd + j;

        System.out.println("The sum of odds is: " + sumOdd);
    }
}