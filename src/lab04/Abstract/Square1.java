package lab04.Abstract;

public class Square1 extends Rectangle1{
    private double side;

    public Square1(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){return side;}
    public void setSide(double side){this.side = side;}
    @Override
    public void setLenght(double side) {this.side = side;}
    @Override
    public void setWidth(double side){this.side = side;}

    @Override
    public String toString() {
        return "Square{"+"side="+side+'\''+'}';
    }
}
