public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle() {

    }

    public Rectangle( double height, double width) {
        this.height = height;
        this.width = width;
    }



    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void calculateCircumference() {
        System.out.println(height*width);
    }

    @Override
    public void calculateArea() {
        System.out.println(2*(height+width));
    }


    public double getHeight(int i) {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth(double width) {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
