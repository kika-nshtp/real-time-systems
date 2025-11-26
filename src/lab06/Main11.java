package lab06;
public class Main11 {
    public static void main(String[] args) {
        double temp = 20;
        Temperature temperature1 = new Temperature(temp, "K");
        Temperature temperature2 = new Temperature(temp, "F");
        temperature1.convert();
        temperature2.convert();
    }
}
