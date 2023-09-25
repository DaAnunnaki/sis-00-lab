import java.util.Scanner;

public class RegularPolygon {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int side = scan.nextInt();

        System.out.print("Enter the side length: ");
        double length = scan.nextDouble();
        scan.close();

        double area = side*(length*length)/(4*Math.tan(Math.PI/side));
        System.out.println("The area of the polygon is "+area);

    }
}