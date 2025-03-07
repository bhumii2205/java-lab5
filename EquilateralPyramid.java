// Class representing an Equilateral Pyramid (Square Base)
public class EquilateralPyramid extends Shape implements Volume {
    private double baseSide, height;

    public EquilateralPyramid(double baseSide, double height) {
        super("Equilateral Pyramid");
        this.baseSide = baseSide;
        this.height = height;
    }

    @Override
    public void calculateShape() {
        double area = baseSide * baseSide + 2 * baseSide * (Math.sqrt((baseSide / 2) * (baseSide / 2) + height * height));
        System.out.println("Surface Area of Equilateral Pyramid: " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 4 * baseSide;
        System.out.println("Perimeter of Pyramid base: " + perimeter);
    }

    @Override
    public void calculateVolume() {
        double volume = (1.0 / 3.0) * (baseSide * baseSide) * height;
        System.out.println("Volume of Equilateral Pyramid: " + volume);
    }
}
