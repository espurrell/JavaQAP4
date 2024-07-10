package Problem2;

public class Ellipse extends Shape {
    protected double a; // major axis
    protected double b; // minor axis

    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        this.a = Math.max(axis1, axis2);
        this.b = Math.min(axis1, axis2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public void scale(double factor) {
        this.a *= factor;
        this.b *= factor;
    }
}