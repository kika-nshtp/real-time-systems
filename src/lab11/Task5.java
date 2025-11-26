package lab11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task5 {
    public static void main(String[]args) {
        System.out.println("ARRAYLIST");
        long from = System.currentTimeMillis();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 1; i < 1000000; i++) {
            a.add(i);
        }
        long to = System.currentTimeMillis();
        System.out.println("Заполнение за "+(to-from)+" миллисекунд");

        from = System.currentTimeMillis();
        a.reversed();
        a.sort(null);
        to = System.currentTimeMillis();
        System.out.println("Сортировка за "+(to-from)+" миллисекунд");

        from = System.currentTimeMillis();
        for (int i = 0; i < a.size(); i+=500){
            a.remove(i);
        }
        to = System.currentTimeMillis();
        System.out.println("Удаление каждого 500 элемента за "+(to-from)+" миллисекунд");

        from = System.currentTimeMillis();
        for (int i = 1; i < a.size();i+=500){
            a.indexOf(i);
        }
        to = System.currentTimeMillis();
        System.out.println("Каждый 500 элемент найден "+(to-from)+" миллисекунд");




        System.out.println("\nLINKEDLIST");
        from = System.currentTimeMillis();
        LinkedList<Integer> b = new LinkedList<Integer>();
        for (int i = 1; i < 1000000; i++) {
            b.add(i);
        }
        to = System.currentTimeMillis();
        System.out.println("Заполнени за "+(to-from)+" миллисекунд");

        from = System.currentTimeMillis();
        b.reversed();
        b.sort(null);
        to = System.currentTimeMillis();
        System.out.println("Сортировка за "+(to-from)+" миллисекунд");

        from = System.currentTimeMillis();
        for (int i = 0; i < b.size(); i+=500){
            b.remove(i);
        }
        to = System.currentTimeMillis();
        System.out.println("Удаление каждого 500го элемента за "+(to-from)+" миллисекунд");

        from = System.currentTimeMillis();
        for (int i = 1; i < b.size();i+=500){
            b.indexOf(i);
        }
        to = System.currentTimeMillis();
        System.out.println("Каждый 500 элемент найден за "+(to-from)+" миллисекунд");


    }
}
