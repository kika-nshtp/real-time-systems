package lab01;

public class Pr1 {
    public static void main(String[] args){
        int[] sp = {1, 5, 15, 83, 44, -2};
        int summa = 0;
        for (int i = 0; i<sp.length; i++){
            summa += sp[i];
        }
        System.out.println(summa/sp.length);
    }
}
