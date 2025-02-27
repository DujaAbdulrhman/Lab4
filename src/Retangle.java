public class Retangle extends Shape{
    private double height;
    private double width;
    public Retangle(int x, int y) {
        super(x, y);
    }

    public Retangle() {

    }


    @Override
    public double calculateArea(double radius) {
        return 0;
    }

    //مدري بالضبط وش المشكله بس كررتها عشان ما تطلعلي ايرور فوق
    @Override
    public double calculateArea(double height,double width) {
        double area=height*width;
        return area;
    }

    @Override
    public double calculateCircumference(double radius) {
        return 0;
    }

    @Override
    public double calculateCircumference(double height,double width) {
        double Circumference=height*2+width*2;
        return Circumference;
    }

    public Retangle(int x, int y, double height, double width) {
        super(x, y);
        this.height = height;
        this.width = width;
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
