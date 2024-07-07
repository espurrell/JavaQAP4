package Problem1;

public abstract class Shape { // Shape is an abstract class
    protected String name;

    public Shape(String name) { // Shape is defined by a name
        this.name = name;
    }

    public String getName() { // getName() returns the name of the shape
        return name;
    }

    public abstract double getPerimeter(); // getPerimeter() is an abstract method

    public abstract double getArea(); // getArea() is an abstract method

    @Override
    public String toString() { // toString() returns a string representation of the shape
        return String.format("Shape: %s, Area: %.2f, Perimeter: %.2f", name, getArea(), getPerimeter());
    }
}
