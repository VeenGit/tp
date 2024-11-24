public class Six {
    public static void main(String[] args) {
        // b) Test how many bytes are used to represent a float value using Float.BYTES.
        System.out.println("Bytes used for a float: " + Float.BYTES);

        // c) Find the minimum and maximum values of float using Float.MIN_VALUE and Float.MAX_VALUE.
        System.out.println("Float Min Value: " + Float.MIN_VALUE);
        System.out.println("Float Max Value: " + Float.MAX_VALUE);

        // d) Declare a method-local variable number of type float and convert it to a String using Float.toString().
        float number = 123.45f;
        String floatString = Float.toString(number);
        System.out.println("Float to String: " + floatString);

        // e) Declare a method-local variable strNumber of type String and convert it to a float value using Float.parseFloat().
        String strNumber = "456.78";
        float parsedFloat = Float.parseFloat(strNumber);
        System.out.println("String to Float: " + parsedFloat);

        // f) Attempt to convert an invalid String ("Ab12Cd3") to a float value (will throw NumberFormatException).
        try {
            strNumber = "Ab12Cd3";
            parsedFloat = Float.parseFloat(strNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid String to Float conversion error: " + e);
        }

        // g) Convert a float to the corresponding wrapper class using Float.valueOf().
        Float wrapperFloat = Float.valueOf(number);
        System.out.println("Float to Wrapper Float: " + wrapperFloat);

        // h) Convert a String to the corresponding wrapper class using Float.valueOf().
        wrapperFloat = Float.valueOf("789.01");
        System.out.println("String to Wrapper Float: " + wrapperFloat);

        // i) Declare two float variables and add them using Float.sum().
        float num1 = 112.3f;
        float num2 = 984.5f;
        float sum = Float.sum(num1, num2);
        System.out.println("Sum of 112.3 and 984.5: " + sum);

        // j) Find the minimum and maximum between two float values using Float.min() and Float.max().
        float min = Float.min(112.2f, 556.6f);
        float max = Float.max(112.2f, 556.6f);
        System.out.println("Min of 112.2 and 556.6: " + min);
        System.out.println("Max of 112.2 and 556.6: " + max);

        // k) Find the square root of -25.0f using Math.sqrt().
        float negativeValue = -25.0f;
        double sqrtValue = Math.sqrt(negativeValue);
        System.out.println("Square root of -25.0: " + sqrtValue); // NaN (Not a Number)

        // l) Declare two float variables with the same value, 0.0f, and divide them.
        float zero1 = 0.0f;
        float zero2 = 0.0f;
        float divisionResult = zero1 / zero2;
        System.out.println("Division of 0.0f by 0.0f: " + divisionResult); // Result will be NaN

        // m) Experiment with converting a float value into other primitive types.
        int convertedToInt = (int) number;  // Explicit conversion to int
        long convertedToLong = (long) number;  // Explicit conversion to long
        double convertedToDouble = number;  // Implicit conversion to double

        System.out.println("Float to Int: " + convertedToInt);
        System.out.println("Float to Long: " + convertedToLong);
        System.out.println("Float to Double: " + convertedToDouble);
    }
}
