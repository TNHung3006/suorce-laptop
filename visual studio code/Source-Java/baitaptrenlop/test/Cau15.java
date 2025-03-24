public class Cau15 {
    public static String convertDecimalToBinary(int value) {
        if (value == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (value > 0) {
            int remainder = value % 2;
            binary.insert(0, remainder);
            value /= 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        int[] values = {8, 298, 9123};
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            String binary = convertDecimalToBinary(value);
            System.out.println("he thap phan " + value + ", he nhi phan: " + binary);
        }
    }
    
}
