package Problem1;

public class Triangle extends Shape { // Triangle is a special case of Shape
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) { // Triangle is defined by three sides
        super("Triangle");
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("Invalid triangle sides."); // Invalid triangle sides
        }
    }

    private boolean isValidTriangle(double side1, double side2, double side3) { // isValidTriangle() checks if the sides
                                                                                // form a valid triangle
        return (side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2);
    }

    @Override
    public double getPerimeter() { // getPerimeter() returns the perimeter of the triangle
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() { // getArea() returns the area of the triangle
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
