class Three {
    public static void main(String[] args) {
        // a) Explore Java API Documentation: java.lang.Short
        // No code required, this is reading documentation.

        // b) Test how many bytes are used to represent a short value.
        System.out.println("Bytes used for a short: " + Short.BYTES);

        // c) Find the minimum and maximum values of short.
        System.out.println("Short Min Value: " + Short.MIN_VALUE);
        System.out.println("Short Max Value: " + Short.MAX_VALUE);

        // d) Declare a method-local variable number of type short and convert it to a String.
        short number = 1500;
        String shortString = Short.toString(number);
        System.out.println("Short to String: " + shortString);

        // e) Declare a method-local variable strNumber of type String and convert it to a short value.
        String strNumber = "2500";
        short parsedShort = Short.parseShort(strNumber);
        System.out.println("String to Short: " + parsedShort);

        // f) Attempt to convert invalid String to short (will throw an exception).
        try {
            strNumber = "Ab12Cd3";
            parsedShort = Short.parseShort(strNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid String to Short conversion error: " + e);
        }

        // g) Convert short to Wrapper class (Short).
        Short wrapperShort = Short.valueOf(number);
        System.out.println("Short to Wrapper Short: " + wrapperShort);

        // h) Convert String to Wrapper class (Short).
        wrapperShort = Short.valueOf("3500");
        System.out.println("String to Wrapper Short: " + wrapperShort);

        // i) Experiment with converting a short value into other primitive types.
        int convertedToInt = number;  // Implicit conversion to int
        long convertedToLong = number; // Implicit conversion to long
        float convertedToFloat = number; // Implicit conversion to float
        double convertedToDouble = number; // Implicit conversion to double

        System.out.println("Short to Int: " + convertedToInt);
        System.out.println("Short to Long: " + convertedToLong);
        System.out.println("Short to Float: " + convertedToFloat);
        System.out.println("Short to Double: " + convertedToDouble);
    }
}
