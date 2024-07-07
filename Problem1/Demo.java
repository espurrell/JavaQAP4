package Problem1;

public class Demo { // This class is in the default package
    public static void main(String[] args) { // This method is in the default package
        Shape[] shapes = { // This array is in the default package
                new Circle(5),
                new Ellipse(10, 5),
                new Triangle(3, 4, 5),
                new EquilateralTriangle(6)
        };

        for (Shape shape : shapes) { // This loop is in the default package
            System.out.println(shape);
        }
    }
}
