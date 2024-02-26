package Marks;

public class B extends Marks{
    double a;
    double b;
    double c;
    double d;

    public B(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getPercentage() {
        return (a + b + c + d) / 4;
    }
}
