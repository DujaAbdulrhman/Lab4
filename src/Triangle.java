public class Triangle extends Shape{

    private double height;
    private double base;

    public Triangle() {

    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public void calculateCircumference() {
        System.out.println(height*base);
    }

    @Override
    public void calculateArea() {
        System.out.println(2*(base*height));    }

    

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
