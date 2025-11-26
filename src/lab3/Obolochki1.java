package lab3;

public class Obolochki1 {
    public static void main(String[] args) {
        System.out.println(Double.valueOf(12.5));
        String a = "15.6";
        System.out.println("String: " + a);
        double b = Double.parseDouble(a);
        System.out.println("double: " + b);
        Double b1 = b;
        System.out.println("\nbyte: " + b1.byteValue());
        System.out.println("short: " + b1.shortValue());
        System.out.println("int: " + b1.intValue());
        System.out.println("long: " + b1.longValue());
        System.out.println("float: " + b1.floatValue());
        System.out.println("double: " + b1.doubleValue());
        System.out.println("boolean: "+ !(b1==0.0));
        System.out.println("char: "+(char)b1.intValue());
        double c = 24.3;
        String d = Double.toString(c);
        System.out.println("\nString: " + d);
    }
}
