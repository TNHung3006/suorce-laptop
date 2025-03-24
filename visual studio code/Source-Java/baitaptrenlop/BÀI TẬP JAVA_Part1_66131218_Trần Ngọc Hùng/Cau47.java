public class Cau47 {

    public static String replace(String x, String y, String z) {
        return x.replaceAll(y, z);
    }

    public static void main(String[] args) {
        String x = "This is a test string. This string contains the word test.";
        String y = "test";
        String z = "example";

        String result = replace(x, y, z);
        System.out.println(result);
    }
}