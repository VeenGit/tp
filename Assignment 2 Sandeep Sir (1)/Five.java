public class Five {
    public static void main(String[] args) {
        // b) Test how many bytes are used to represent a long value using Long.BYTES.
        System.out.println("Bytes used for a long: " + Long.BYTES);

        // c) Find the minimum and maximum values of long using Long.MIN_VALUE and Long.MAX_VALUE.
        System.out.println("Long Min Value: " + Long.MIN_VALUE);
        System.out.println("Long Max Value: " + Long.MAX_VALUE);

        // d) Declare a method-local variable number of type long and convert it to a String using Long.toString().
        long number = 9876543210L;
        String longString = Long.toString(number);
        System.out.println("Long to String: " + longString);

        // e) Declare a method-local variable strNumber of type String and convert it to a long value using Long.parseLong().
        String strNumber = "1234567890";
        long parsedLong = Long.parseLong(strNumber);
        System.out.println("String to Long: " + parsedLong);

        // f) Attempt to convert an invalid String ("Ab12Cd3") to a long value (will throw NumberFormatException).
        try {
            strNumber = "Ab12Cd3";
            parsedLong = Long.parseLong(strNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid String to Long conversion error: " + e);
        }

        // g) Convert a long to the corresponding wrapper class using Long.valueOf().
        Long wrapperLong = Long.valueOf(number);
        System.out.println("Long to Wrapper Long: " + wrapperLong);

        // h) Convert a String to the corresponding wrapper class using Long.valueOf().
        wrapperLong = Long.valueOf("987654321");
        System.out.println("String to Wrapper Long: " + wrapperLong);

        // i) Declare two long variables and add them using Long.sum().
        long num1 = 1123L;
        long num2 = 9845L;
        long sum = Long.sum(num1, num2);
        System.out.println("Sum of 1123 and 9845: " + sum);

        // j) Find the minimum and maximum between two long values using Long.min() and Long.max().
        long min = Long.min(1122L, 5566L);
        long max = Long.max(1122L, 5566L);
        System.out.println("Min of 1122 and 5566: " + min);
        System.out.println("Max of 1122 and 5566: " + max);

        // k) Convert a long value (7) to binary, octal, and hexadecimal strings using Long.toBinaryString(), Long.toOctalString(), and Long.toHexString().
        long value = 7L;
        String binaryString = Long.toBinaryString(value);
        String octalString = Long.toOctalString(value);
        String hexString = Long.toHexString(value);
        System.out.println("Long 7 in Binary: " + binaryString);
        System.out.println("Long 7 in Octal: " + octalString);
        System.out.println("Long 7 in Hexadecimal: " + hexString);

        // l) Experiment with converting a long value into other primitive types or vice versa.
        int convertedToInt = (int) number;  // Explicit conversion to int
        float convertedToFloat = number;    // Implicit conversion to float
        double convertedToDouble = number;  // Implicit conversion to double

        System.out.println("Long to Int: " + convertedToInt);
        System.out.println("Long to Float: " + convertedToFloat);
        System.out.println("Long to Double: " + convertedToDouble);
    }
}
