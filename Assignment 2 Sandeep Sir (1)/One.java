public class One {
    public static void main(String[] args) {
        // a) Explore Java API Documentation: just reading the documentation.

        // b) Method-local variable status of type boolean with value true, convert to String.
        boolean status = true;
        String statusString = Boolean.toString(status);
        System.out.println("Boolean to String: " + statusString);

        // c) Convert String "true" to boolean using parseBoolean.
        String strStatus = "true";
        boolean parsedStatus = Boolean.parseBoolean(strStatus);
        System.out.println("String to Boolean: " + parsedStatus);

        // d) Attempt to convert String "1" or "0" to boolean.
        strStatus = "1";
        boolean parsedInvalid = Boolean.parseBoolean(strStatus);
        System.out.println("String '1' to Boolean (invalid behavior): " + parsedInvalid); // Output: false

        // e) Convert boolean 'true' to Boolean wrapper class.
        Boolean wrapperStatus = Boolean.valueOf(status);
        System.out.println("Boolean to Wrapper Boolean: " + wrapperStatus);

        // f) Convert String "true" to Boolean wrapper class.
        wrapperStatus = Boolean.valueOf("true");
        System.out.println("String to Wrapper Boolean: " + wrapperStatus);

        // g) Experiment converting Boolean to other types - skipping, as Boolean only converts to String.
    }
}
