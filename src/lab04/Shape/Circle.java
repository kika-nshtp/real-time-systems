package lab04.Shape;
import java.lang.Math;

public class Circle extends Shape {
    private double r;

    public Circle(String type, double r){
        super(type);
        this.r = r;
    }
    @Override public String getType(){
        return super.getType();
    }
    public double getArea(){
        return Math.PI*Math.pow(r,2);
    }
    public double getPerimeter(){
        return 2*Math.PI*r;
    }
    @Override public String toString(){
        return super.toString() + "{"+"r=" + r + '\''+'}';
    }
}
