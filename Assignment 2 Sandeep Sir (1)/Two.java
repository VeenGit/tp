public class Two {
    public static void main(String[] args) {
        // a) Explore Java API Documentation: java.lang.Byte.
        // No code required, just reading the documentation.

        // b) Test how many bytes are used to represent a byte value.
        System.out.println("Bytes used for a byte: " + Byte.BYTES);

        // c) Find the minimum and maximum values of byte.
        System.out.println("Byte Min Value: " + Byte.MIN_VALUE);
        System.out.println("Byte Max Value: " + Byte.MAX_VALUE);

        // d) Convert byte to String.
        byte number = 12;
        String byteString = Byte.toString(number);
        System.out.println("Byte to String: " + byteString);

        // e) Convert String to byte.
        String strNumber = "20";
        byte parsedByte = Byte.parseByte(strNumber);
        System.out.println("String to Byte: " + parsedByte);

        // f) Attempt to convert invalid String to byte (will throw an exception).
        try {
            strNumber = "ABCD123";
            parsedByte = Byte.parseByte(strNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid String to Byte conversion error: " + e);
        }

        // g) Convert byte to Wrapper class.
        Byte wrapperByte = Byte.valueOf(number);
        System.out.println("Byte to Wrapper Byte: " + wrapperByte);

        // h) Convert String to Wrapper class.
        wrapperByte = Byte.valueOf("25");
        System.out.println("String to Wrapper Byte: " + wrapperByte);
    }
}
