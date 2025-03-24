public class FoolishTypist1 {
    // Chương trình có lỗi cú pháp không? Có nên dùng biến "j" chung như vậy không? Hãy giải thích.
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;
        int j;     // Same "j" used for both loops.

        for (j = 0; j < 8; j = j + 2)
            sumEven = sumEven + j;

        System.out.println("The sum of evens is: " + sumEven);

        for (j = 1; j < 8; j = j + 2)
            sumOdd = sumOdd + j;

        System.out.println("The sum of odds is: " + sumOdd);
    }
}