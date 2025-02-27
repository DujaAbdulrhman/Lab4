public class Circle extends Shape {

    double radius;
    private double storingRad;

    public Circle(double radius) {
        super(radius);
    }

    public Circle(int x, int y) {
        super(x, y);
    }

    public Circle() {
        super();
    }

    public double getRadius(double radius) {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea(double radius) {
        double area=(radius*radius)*3.14;
        return area;
    }

    @Override
    public double calculateArea(double height, double width) {
        return 0;
    }

    @Override
    public double calculateCircumference(double radius) {
        double circumference;
        circumference = 3.14*radius*2;
        return circumference;
    }

    @Override
    public double calculateCircumference(double height, double width) {
        return 0;
    }
}
