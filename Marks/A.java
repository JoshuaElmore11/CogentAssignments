package Marks;

public class A extends Marks{
    double a;
    double b;
    double c;

    public A(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPercentage() {
        return (a + b + c) / 3;
    }
}
