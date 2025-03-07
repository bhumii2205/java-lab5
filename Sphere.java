// Class representing a Sphere
public class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    @Override
    public void calculateShape() {
        double area = 4 * Math.PI * radius * radius;
        System.out.println("Surface Area of Sphere: " + area);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Sphere has no perimeter.");
    }

    @Override
    public void calculateVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of Sphere: " + volume);
    }
}
