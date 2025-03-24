public class Cau39 {
     // Chuyển đổi từ hệ 16 sang hệ 10
     public static int hex2decimal(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

    // Chuyển đổi từ hệ 10 sang hệ 16
    public static String decimal2hex(int d) {
        String digits = "0123456789ABCDEF";
        if (d == 0) return "0";
        String hex = "";
        while (d > 0) {
            int digit = d % 16;
            hex = digits.charAt(digit) + hex;
            d = d / 16;
        }
        return hex;
    }

    public static void main(String[] args) {
        String hex = "1A2B";
        int decimal = 4267;

        System.out.println("Hệ 16 -> Hệ 10: " + hex + " = " + hex2decimal(hex));
        System.out.println("Hệ 10 -> Hệ 16: " + decimal + " = " + decimal2hex(decimal));
    }
}
