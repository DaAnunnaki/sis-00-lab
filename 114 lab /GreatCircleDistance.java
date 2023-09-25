import java.util.Scanner;

public class GreatCircleDistance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = Math.toRadians(scan.nextDouble());
        double y1 = Math.toRadians(scan.nextDouble());

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = Math.toRadians(scan.nextDouble());
        double y2 = Math.toRadians(scan.nextDouble());
        scan.close();

        double dis = 6371.01 * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
        //d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

        System.out.println("The distance between the two points is "+dis+"km");
    }
}

/*
 Enter point 1 (latitude and longitude) in degrees: 39.55 -116.25
Enter point 2 (latitude and longitude) in degrees: 41.5 87.37
The distance between the two points is 10691.791832 km
 */