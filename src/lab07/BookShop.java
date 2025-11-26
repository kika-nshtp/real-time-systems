package lab07;

import lab06.Printable.Book;
import lab06.Printable.Printable;
import lab06.Printable.Shop;


public class BookShop {
    public static void main(String[]args) {
        Shop m1 = new Shop();
        Shop m2 = new Shop();
        Book b1 = new Book();
        Book b2 = new Book();
        Printable[] printables = new Printable[]{m1,b1,m2,b2};
        Shop.printShops(printables);
        Book.printBooks(printables);
    }
}


