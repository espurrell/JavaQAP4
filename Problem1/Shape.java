package Problem1;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    @Override
    public String toString() {
        return String.format("Shape: %s, Area: %.2f, Perimeter: %.2f", name, getArea(), getPerimeter());
    }
}
