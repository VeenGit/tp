public class Eight {
    public static void main(String[] args) {
        // 1. byte
        byte byteValue = 10;
        String byteToString = Byte.toString(byteValue);
        String byteStringValueOf = String.valueOf(byteValue);
        System.out.println("Byte to String using toString: " + byteToString);
        System.out.println("Byte to String using valueOf: " + byteStringValueOf);

        // 2. short
        short shortValue = 100;
        String shortToString = Short.toString(shortValue);
        String shortStringValueOf = String.valueOf(shortValue);
        System.out.println("Short to String using toString: " + shortToString);
        System.out.println("Short to String using valueOf: " + shortStringValueOf);

        // 3. int
        int intValue = 1000;
        String intToString = Integer.toString(intValue);
        String intStringValueOf = String.valueOf(intValue);
        System.out.println("Int to String using toString: " + intToString);
        System.out.println("Int to String using valueOf: " + intStringValueOf);

        // 4. long
        long longValue = 10000L;
        String longToString = Long.toString(longValue);
        String longStringValueOf = String.valueOf(longValue);
        System.out.println("Long to String using toString: " + longToString);
        System.out.println("Long to String using valueOf: " + longStringValueOf);

        // 5. float
        float floatValue = 10.5f;
        String floatToString = Float.toString(floatValue);
        String floatStringValueOf = String.valueOf(floatValue);
        System.out.println("Float to String using toString: " + floatToString);
        System.out.println("Float to String using valueOf: " + floatStringValueOf);

        // 6. double
        double doubleValue = 100.1234;
        String doubleToString = Double.toString(doubleValue);
        String doubleStringValueOf = String.valueOf(doubleValue);
        System.out.println("Double to String using toString: " + doubleToString);
        System.out.println("Double to String using valueOf: " + doubleStringValueOf);

        // 7. char
        char charValue = 'A';
        String charToString = Character.toString(charValue);
        String charStringValueOf = String.valueOf(charValue);
        System.out.println("Char to String using toString: " + charToString);
        System.out.println("Char to String using valueOf: " + charStringValueOf);

        // 8. boolean
        boolean booleanValue = true;
        String booleanToString = Boolean.toString(booleanValue);
        String booleanStringValueOf = String.valueOf(booleanValue);
        System.out.println("Boolean to String using toString: " + booleanToString);
        System.out.println("Boolean to String using valueOf: " + booleanStringValueOf);
    }
}
