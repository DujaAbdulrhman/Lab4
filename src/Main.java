
public class Main {
    public static void main(String[] args) {
        Circle c1=new Circle(2);
        System.out.println("\n-------------- Circle Class--------------");
        System.out.println("the radius is: "+c1.getRadius(5));
        System.out.println("The circumference of the circle is:");
        c1.calculateCircumference();
        System.out.println("The circle area is:");
        c1.calculateArea();
        System.out.println("\n-------------- Rectangle Class--------------");
        Rectangle retangle=new Rectangle(2,2);
        System.out.println("The rectangle width is: "+retangle.getWidth(2)+" and the height is:"+retangle.getHeight(2));
        System.out.println("The rectangle area is:");
        retangle.calculateArea();
        System.out.println("The rectangle circumference: ");
        retangle.calculateCircumference();
        Triangle triangle=new Triangle(2,4);
        System.out.println("\n-------------- Triangle Class--------------");

        System.out.println("The triangle area is:");
        triangle.calculateArea();
        System.out.println("The triangle circumference is:");
        triangle.calculateCircumference();



    }
}
