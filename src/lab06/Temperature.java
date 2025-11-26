package lab06;

public class Temperature implements Convertable{
    private double temp;
    private String name;

    public Temperature(double temp, String name){
        this.temp = temp;
        this.name = name;
    }
    public double getTemp() {return temp;}
    public void setTemp(double temp) {this.temp = temp;}
    public String getName(){return name;}
    public void setName(String name) {this.name = name;}
    public void convert() {
        switch (name){
            case "K" -> System.out.println(temp + "°С = "+(temp + 273)+"K");
            case "F" -> System.out.println(temp+"°C = "+(temp*4.5+32)+"°F");
        }
    }
}
