package lab06.Priceable;

class Table implements Priceable {
    public static double getPrice(){return 286482.5;}
}
class Chair implements Priceable{
    public static double getPrice(){return 9763.648;}
}
class Pencil implements Priceable{
    public static double getPrice(){return 36.12;}
}
public class Main {
    public static void main(String[] args) {
        System.out.println(Table.getPrice());
        System.out.println(Chair.getPrice());
        System.out.println(Pencil.getPrice());
    }
}
