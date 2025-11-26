package lab3;
import java.util.Random;

public class MathAndRandom3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(90)+10;
        int rand_int2 = rand.nextInt(90)+10;
        int rand_int3 = rand.nextInt(90)+10;
        int rand_int4 = rand.nextInt(90)+10;
        int[] random = {rand_int1, rand_int2, rand_int3, rand_int4};
        for (int i = 0; i<4; i++){
            System.out.print(random[i] +" ");
        }
        if ((rand_int1<rand_int2)&&(rand_int2<rand_int3)&&(rand_int3<rand_int4)){
            System.out.println("\nМассив является строго возрастающей последовательностью");
        }
        else{
            System.out.println("\nМассив НЕ является строго возрастающей последовательностью");
        }
    }
}
