package lab4.Abstract;

public class Rectangle1 extends Shape1{
    private double width;
    private double lenght;

    public Rectangle1(double width, double lenght, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {return width;}
    public double getLenght() {return lenght;}
    public void setWidth(double width) {this.width = width;}
    public void setLenght(double lenght) {this.lenght = lenght;}

    public double getArea(){return width*lenght;}
    public double getPerimeter(){return 2*(width+lenght);}

    @Override
    public String toString() {
        return "Rectangle{"+"width="+width+", lenght="+lenght+'\''+'}';
    }
}
