package lab7;

import lab6.Printable.Book;
import lab6.Printable.Printable;
import lab6.Printable.Shop;


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


