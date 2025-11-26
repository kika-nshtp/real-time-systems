package lab04.Shape;

public abstract class Shape {
    private String type;
    public Shape(String type){
        this.type = type;
    }

    public String getType(){return type;}
    abstract double getArea();
    abstract double getPerimeter();

    public String toString() {
        return "Shape{"+"type ="+type;
    }
}
