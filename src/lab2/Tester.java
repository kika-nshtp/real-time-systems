package lab2;

public class Tester {
    private Circle[] test;
    private int len;

    public Tester(Circle[] test){
        this.test = test;
        this.len = test.length;
    }

    public Circle[] getTest() {return test;}
    public void setTest(Circle[] test) {this.test = test;}
    public int getLen() {return len;}
    public void setLen(int len) {this.len = len;}
}