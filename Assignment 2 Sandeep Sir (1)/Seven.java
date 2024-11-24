class Seven {
    public static void main(String[] args) {
        // b) Test how many bytes are used to represent a double value using Double.BYTES.
        System.out.println("Bytes used for a double: " + Double.BYTES);

        // c) Find the minimum and maximum values of double using Double.MIN_VALUE and Double.MAX_VALUE.
        System.out.println("Double Min Value: " + Double.MIN_VALUE);
        System.out.println("Double Max Value: " + Double.MAX_VALUE);

        // d) Declare a method-local variable number of type double and convert it to a String using Double.toString().
        double number = 12345.6789;
        String doubleString = Double.toString(number);
        System.out.println("Double to String: " + doubleString);

        // e) Declare a method-local variable strNumber of type String and convert it to a double value using Double.parseDouble().
        String strNumber = "45678.1234";
        double parsedDouble = Double.parseDouble(strNumber);
        System.out.println("String to Double: " + parsedDouble);

        // f) Attempt to convert an invalid String ("Ab12Cd3") to a double value (will throw NumberFormatException).
        try {
            strNumber = "Ab12Cd3";
            parsedDouble = Double.parseDouble(strNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid String to Double conversion error: " + e);
        }

        // g) Convert a double to the corresponding wrapper class using Double.valueOf().
        Double wrapperDouble = Double.valueOf(number);
        System.out.println("Double to Wrapper Double: " + wrapperDouble);

        // h) Convert a String to the corresponding wrapper class using Double.valueOf().
        wrapperDouble = Double.valueOf("789.6543");
        System.out.println("String to Wrapper Double: " + wrapperDouble);

        // i) Declare two double variables and add them using Double.sum().
        double num1 = 112.3;
        double num2 = 984.5;
        double sum = Double.sum(num1, num2);
        System.out.println("Sum of 112.3 and 984.5: " + sum);

        // j) Find the minimum and maximum between two double values using Double.min() and Double.max().
        double min = Double.min(112.2, 556.6);
        double max = Double.max(112.2, 556.6);
        System.out.println("Min of 112.2 and 556.6: " + min);
        System.out.println("Max of 112.2 and 556.6: " + max);

        // k) Find the square root of -25.0 using Math.sqrt().
        double negativeValue = -25.0;
        double sqrtValue = Math.sqrt(negativeValue);
        System.out.println("Square root of -25.0: " + sqrtValue); // NaN (Not a Number)

        // l) Declare two double variables with the same value, 0.0, and divide them.
        double zero1 = 0.0;
        double zero2 = 0.0;
        double divisionResult = zero1 / zero2;
        System.out.println("Division of 0.0 by 0.0: " + divisionResult); // Result will be NaN

        // m) Experiment with converting a double value into other primitive types.
        int convertedToInt = (int) number;  // Explicit conversion to int
        long convertedToLong = (long) number;  // Explicit conversion to long
        float convertedToFloat = (float) number;  // Explicit conversion to float

        System.out.println("Double to Int: " + convertedToInt);
        System.out.println("Double to Long: " + convertedToLong);
        System.out.println("Double to Float: " + convertedToFloat);
    }
}
