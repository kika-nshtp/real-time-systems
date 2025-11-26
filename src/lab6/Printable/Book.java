package lab6.Printable;

public class Book implements Printable {
    public void print(){
        System.out.print("Book");
    }
    public static int printBooks(Printable[] printables){
        for (Printable p: printables){
            if (p instanceof Book){
                p.print();
            }
        }
        return 0;
    }
}
