package lab1;
import java.util.Scanner;

public class Pr5 {
    public static void main(String[] args) {
        System.out.println("Введите число, факториал которого необходимо вычислить: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), factorial = 1;
        if (n == 0){
            System.out.println("факториал 0 = " + factorial);
        }
        else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("факториал "+n+" = "+factorial);
        }
    }
}
