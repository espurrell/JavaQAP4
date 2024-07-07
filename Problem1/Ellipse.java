package Problem1;

public class Ellipse extends Shape { // Ellipse is a special case of Shape
    private double a; // maj axis
    private double b; // min axis

    public Ellipse(double axis1, double axis2) { // Ellipse is defined by two axes
        super("Ellipse");
        this.a = Math.max(axis1, axis2);
        this.b = Math.min(axis1, axis2);
    }

    @Override
    public double getPerimeter() { // 4aE(m) = 2πa + 2πb
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    @Override
    public double getArea() { // πab
        return Math.PI * a * b;
    }
}
