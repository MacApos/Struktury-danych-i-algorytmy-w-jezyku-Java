public class binary_to_decimal {
    public static void main(String[] args) {
        System.out.println(convert("101111"));
    }

    public static int convert(String binary){
        int conversion = 1;
        int result = 0;
        for (int i = 1; i <= binary.length(); i++) {
            if (binary.charAt(binary.length() - i) == '1') {
                result += conversion;
            }
            conversion *= 2;
        }
        return result;
    }
}
