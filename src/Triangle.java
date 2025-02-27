public class Triangle extends Shape{

    private double height;
    private double base;
    public Triangle(int x, int y) {
        super(x, y);
    }

    public Triangle() {

    }

    @Override
    public double calculateArea(double radius) {
        return 0;
    }

    @Override
    public double calculateArea(double height, double base) {
        double area=height*base;
        return 0;
    }

    @Override
    public double calculateCircumference(double radius) {
        return radius;
    }

    @Override
    public double calculateCircumference(double height, double base) {
        double circumference=2*(base*height);
        return circumference;
    }

    public double getHeight(double height) {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase(double base) {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
