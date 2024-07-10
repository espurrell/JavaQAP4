package Problem2;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Ellipse(10, 5),
                new Triangle(3, 4, 5),
                new EquilateralTriangle(6)
        };

        System.out.println("Before scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        scaleShapes(shapes, 2.0);

        System.out.println("\nAfter scaling by a factor of 2.0:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleShapes(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }
}
