public class EnhancedForLoop {
    // So sánh ngắn gọn 2 cách duyệt dãy các ký tự nguyên âm sau đây.
    public static void main(String[] args) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // iterating through an array using a for loop
        for (int i = 0; i < vowels.length; ++i) {
            System.out.println(vowels[i]);
        }

        // iterating through an array using the for-each loop
        for (char item : vowels) {
            System.out.println(item);
        }
    }
}
