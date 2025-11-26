package lab06.Printable;

public class Shop implements Printable{
    public void print(){
        System.out.print("Shop");
    }
    public static int printShops(Printable[] printables){
        for (Printable p: printables){
            if (p instanceof Shop){
                p.print();
            }
        }
        return 0;
    }
}
