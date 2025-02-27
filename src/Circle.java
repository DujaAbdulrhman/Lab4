public class Circle extends Shape {

    double radius;
    private double storingRad;




    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateCircumference() {
        System.out.println(radius*3.14*2);
    }

    @Override
    public void calculateArea() {
        System.out.println((radius*radius)*3.14);
    }

    public double getRadius(double radius) {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
