public class Cau27 {
    public static int parseBinary(String binary) {
        int decimalValue = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimalValue += Math.pow(2, power);
            }
            power++;
        }

        return decimalValue;
    }

    public static void main(String[] args) {
        String binary = "10001";
        int decimal = parseBinary(binary);
        System.out.println("Số nhị phân " + binary + " chuyển sang hệ thập phân là: " + decimal);
    }
}
