import java.util.Arrays;

public class Cau12 {
    public static int[] reverseArrayCopy(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        return reversedArr;
    }

    public static void reverseArrayInPlace(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArr = reverseArrayCopy(arr);
        System.out.println("Mang ban dau: " + Arrays.toString(arr));
        System.out.println("mang dao nguoc bang mang moi: " + Arrays.toString(reversedArr));
        reverseArrayInPlace(arr);
        System.out.println("mang dao nguoc tai cho: " + Arrays.toString(arr));
    }
}
