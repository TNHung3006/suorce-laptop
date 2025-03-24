public class FoolishTypist2 {
    // Chương trình có lỗi cú pháp không? Có nên dùng biến "i và "j" như vậy không? Hãy giải thích.
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;
        int j = 0;
        int i = 1;

        for (j = 0; j < 8; j = j + 2)
            sumEven = sumEven + j;

        System.out.println("The sum of evens is: " + sumEven);

        for (i = 1; i < 8; i = i + 2)
            sumOdd = sumOdd + j;

        System.out.println("The sum of odds is: " + sumOdd);
    }
}