
public class Main {
    public static void main(String[] args) {
        Circle c1=new Circle();
        System.out.println("\n-------------- Circle Class--------------");
        System.out.println("the radius is: "+c1.getRadius(5));
        System.out.println("The circumference of the circle is:"+c1.calculateCircumference(5));
        System.out.println("The circle area is:"+c1.calculateArea(5));
        System.out.println("\n-------------- Rectangle Class--------------");
        Retangle retangle=new Retangle();
        System.out.println("The rectangle width is: "+retangle.getWidth(2)+" and the height is:"+retangle.getHeight(2));
        System.out.println("The rectangle area is:"+retangle.calculateArea(2,5));
        System.out.println("The rectangle circumference: "+retangle.calculateCircumference(5,5));
        Triangle triangle=new Triangle();
        System.out.println("\n-------------- Triangle Class--------------");
        System.out.println("The triangle height is:"+triangle.getHeight(2)+" and the base is:"+ triangle.getBase(4));
        System.out.println("The triangle area is:"+triangle.calculateArea(2,4));
        System.out.println("The triangle circumference is:"+triangle.calculateCircumference(2,4));



    }
}