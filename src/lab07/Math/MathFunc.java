package lab07.Math;
import java.lang.Math;

public class MathFunc {
    static double pow(double x, int p){
        return Math.pow(x,p);
    }
    static double complexAbs(double a, double b){
        return Math.pow(Math.pow(a,2)+Math.pow(b,2),0.5);
    }
    static double circleLength(double r){
        return (2*Math.PI*r);
    }
}
