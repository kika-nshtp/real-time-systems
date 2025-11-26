package lab2.Ball;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(1.5, 3.7);
        System.out.println("x = "+ball1.getX()+", y = "+ball1.getY());
        System.out.println("в строку "+ball1.toString());
        ball1.setX(1.1);
        ball1.setY(3.2);
        System.out.println("x = "+ball1.getX()+", y = "+ball1.getY());
        ball1.setXY(5.23,6.983);
        System.out.println("x = "+ball1.getX()+", y = "+ball1.getY());
        ball1.move(1.0,2.5);
        System.out.println("x = "+ball1.getX()+", y = "+ball1.getY());
    }
}
