package Problem1;

public class EquilateralTriangle extends Triangle { // EquilateralTriangle is a special case of Triangle
    public EquilateralTriangle(double side) { // EquilateralTriangle is defined by a side
        super(side, side, side);
        super.name = "Equilateral Triangle";
    }
}
