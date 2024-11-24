public class Nine {
    
    // Instance variables (non-static fields)
    boolean instanceBoolean;
    char instanceChar;
    byte instanceByte;
    short instanceShort;
    int instanceInt;
    long instanceLong;
    float instanceFloat;
    double instanceDouble;

    // Static variables (static fields)
    static boolean staticBoolean;
    static char staticChar;
    static byte staticByte;
    static short staticShort;
    static int staticInt;
    static long staticLong;
    static float staticFloat;
    static double staticDouble;

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();

        // Print instance variable default values
        System.out.println("Instance Variables Default Values:");
        System.out.println("boolean: " + obj.instanceBoolean);
        System.out.println("char: " + obj.instanceChar);
        System.out.println("byte: " + obj.instanceByte);
        System.out.println("short: " + obj.instanceShort);
        System.out.println("int: " + obj.instanceInt);
        System.out.println("long: " + obj.instanceLong);
        System.out.println("float: " + obj.instanceFloat);
        System.out.println("double: " + obj.instanceDouble);

        // Print static variable default values
        System.out.println("\nStatic Variables Default Values:");
        System.out.println("boolean: " + DefaultValues.staticBoolean);
        System.out.println("char: " + DefaultValues.staticChar);
        System.out.println("byte: " + DefaultValues.staticByte);
        System.out.println("short: " + DefaultValues.staticShort);
        System.out.println("int: " + DefaultValues.staticInt);
        System.out.println("long: " + DefaultValues.staticLong);
        System.out.println("float: " + DefaultValues.staticFloat);
        System.out.println("double: " + DefaultValues.staticDouble);
    }
}
