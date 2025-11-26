package lab6.Printable;

public class Main6_9 {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Shop shop1 = new Shop();

        Printable[] sp = {book1, book2, shop1};
        for (int i = 0; i< sp.length;i++){
            sp[i].print();
        }
    }
}
