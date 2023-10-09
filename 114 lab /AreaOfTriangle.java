import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the values of base and height: ");
        double base = scan.nextInt();
        double h = scan.nextInt();
        System.out.println("Area of this trangle with base "+base+" and height "+h+" is: "+areaOfTriangle(base, h));
    }

     public static double areaOfTriangle(double base, double height) {
        double area = base*height/2.0;
        return area;
     }
}