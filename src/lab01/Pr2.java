package lab01;
import java.util.Scanner;
//import java.util.Arrays;

public class Pr2 {
    public static void main(String[] args){
//        System.out.println("Введите массив");
//        Scanner scan = new Scanner(System.in);
//        int s0 = scan.nextInt();
//        int[] sp0 = {s0};
//        while (scan.hasNext()){
//            int si = scan.nextInt();
//            int[] sp1 = Arrays.copyOf(sp0, sp0.length +1);
//            sp1[sp1.length-1] = si;
//            sp0 = sp1;
//        }
//        System.out.println(sp1);

        System.out.println("Введите сначала длину массива, далее сам массив");
        Scanner scan = new Scanner(System.in);
        int ln = scan.nextInt();
        int[] sp = new int[ln];
        int i = 0, summa = 0, max = -100000, min = 100000;
        while (i<ln){
            int si = scan.nextInt();
            sp[i] = si;
            summa += si;
            i +=1;
            if (si>max){
                max = si;
            }
            if (si<min){
                min = si;
            }
        }
        System.out.println("Сумма элементов = " + summa);
        System.out.println("Максимальный элемент = " + max);
        System.out.println("Минимальный элемент = " + min);
    }
}
