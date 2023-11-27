public class Triangle extends GeometricObject {
    
    double side1, side2, side3;
    public String color;
    public boolean filled;

    public void Triangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public void Triangle(double s1, double s2, double s3, String color, boolean fill) {
        super(color, fill);
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public double getSide1() { return this.side1; }
    public double getSide2() { return this.side2; }
    public double getSide3() { return this.side3; }

    public double getArea() {
        double p = 0.5*(side1+side2+side3);
        double area = Math.sqrt(p*(p-side1)+(p-side2)+(p-side3))
        return area;
    }

    public double getPerimeter() {
        return side1+side2+side3;
    }

    public String toString() {
        return "Triangle: \nside one: "+ side1 + 
        "\nside two: " + side2 + "\nside three: " +
        side3+ "\nfilled: " + filled + "\narea: ";
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle(1, 1.5, 1);
        System.out.println(t1);
    }

}
