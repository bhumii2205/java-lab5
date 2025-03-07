// Class representing a Square
public class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    public void calculateShape() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 4 * side;
        System.out.println("Perimeter of Square: " + perimeter);
    }
}
