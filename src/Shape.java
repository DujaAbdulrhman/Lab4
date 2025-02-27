public abstract class Shape {
    int x;
    int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public Shape(double radius) {
    }

    public Shape() {

    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calculateArea(){
        calculateArea();
        return 0;
    }

    public double calculateCircumference() {
        return calculateCircumference();
    }

    public abstract double calculateArea(double radius);

    public abstract double calculateArea(double height, double width);

    public abstract double calculateCircumference(double radius);

    public abstract double calculateCircumference(double height, double width);
}
