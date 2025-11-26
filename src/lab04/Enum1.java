package lab04;

public class Enum1 {
    public enum Seasons{
        WINTER(-10),SPRING(10),SUMMER(20),AUTUMN(5);
        private final int temp;
        Seasons(int temp){
            this.temp = temp;
        }
        public static void lovely(Seasons season) {
            switch (season) {
                case WINTER -> System.out.println("Я люблю зиму");
                case SPRING -> System.out.println("Я люблю весну");
                case SUMMER -> System.out.println("Я люблю лето");
                case AUTUMN -> System.out.println("Я люблю осень");
            }
        }
        public static String getDescription(Seasons season){
            if (season.temp>10){
                return "Тёплое время года";
            }
            else{
                return "Холодное время года";
            }
        }
    }

    public static void main(String[] args) {
        Seasons season1 = Seasons.SPRING;
        Seasons.lovely(season1);
        for (Seasons season: Seasons.values()){
            System.out.println(season+" "+season.temp+"C");
            System.out.println(Seasons.getDescription(season));
        }
    }
}
