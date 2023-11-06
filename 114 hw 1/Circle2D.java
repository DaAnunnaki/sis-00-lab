public class Circle2D {

    private double x, y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double testX, double testY) {
        double distance = Math.sqrt(Math.pow(testX - x, 2) + Math.pow(testY - y, 2));
        return distance < radius;
    }

    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(circle.x - x, 2) + Math.pow(circle.y - y, 2));
        return (distance + circle.radius) <= radius;
    }

    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(circle.x - x, 2) + Math.pow(circle.y - y, 2));
        return distance < (circle.radius + radius) && distance > Math.abs(circle.radius - radius);
    }

    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        
        System.out.printf("Area of c1: %.2f", c1.getArea());
        System.out.println();
        System.out.printf("Perimeter of c1: %.2f", c1.getPerimeter());
        System.out.println();
        
        System.out.println("c1.contains(3, 3): " + c1.contains(3, 3));
        System.out.println("c1.contains(new Circle2D(4, 5, 10.5)): " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("c1.overlaps(new Circle2D(3, 5, 2.3)): " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}


/*
 * Circle2D.java) Define the Circle2D class that contains:
- Two double data fields named x and y that specify the center of the circle with getter methods.
- A data field radius with a getter method. (non void method)
- A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1 for radius.
- A constructor that creates a circle with the specified x, y, and radius.
- A method getArea() that returns the area of the circle.
- A method getPerimeter() that returns the perimeter of the circle.
- A method contains(double x, double y) that returns true if the specified point (x, y) is inside the circle.
- A method contains (Circle2D circle) that returns true if the specified circle is inside this circle.
- A method overlaps(Circle2D circle) that returns true if the specified circle overlaps with this circle.
Write a main method that creates a Circle2D object c1 with its x, y coordinates and the radius as 2, 2, and 5.5, respectively. 
Display the area and the perimeter of c1.
Display the result of c1.contains(3, 3), c1.contains (new Circle2D(4, 5, 10.5)), and c1.overlaps(new Circle2D(3, 5, 2.3)). 

 */