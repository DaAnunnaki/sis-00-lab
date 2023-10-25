import java.util.Scanner;

public class Geometry {
    public static double getTriangleArea(double[][] points) {
        double p, area, a, b, c;
        double x1x2 = points[1][0] - points[0][0];
        double y1y2 = points[1][1] - points[0][1];

        double x2x3 = points[2][0] - points[1][0];
        double y2y3 = points[2][1] - points[1][1];

        double x3x1 = points[2][0] - points[0][0];
        double y3y1 = points[2][1] - points[0][1];

        a = Math.sqrt(Math.pow(x1x2, 2)+Math.pow(y1y2, 2));
        b = Math.sqrt(Math.pow(x2x3, 2)+Math.pow(y2y3, 2));
        c = Math.sqrt(Math.pow(x3x1, 2)+Math.pow(y3y1, 2));

        double slope1 = y1y2/x1x2;
        double slope2 = y2y3/x2x3;

        if(Math.abs(slope1-slope2)<0.001) return -1;

        p = 0.5*(a+b+c);
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] triangle = new double[3][2];
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        
        for(double[] pt: triangle) {
            pt[0] = scan.nextDouble();
            pt[1] = scan.nextDouble();
        }

        double area = getTriangleArea(triangle);
        System.out.printf(area==-1 ? "The three points are on the same line." : "The area of the triangle is %.2f",area);
    }
}

/*
 * area of a triangle) Write a method that returns the area of a triangle using the following header:
public static double getTriangleArea(double[][] points)
The points are stored in a 3-by-2 two-dimensional array points with points[0][0] and points[0][1] for (x1, y1). 
The triangle area can be computed using the Heron's formula  http://en.wikipedia.org/wiki/Heron%27s_formula , 
while using the Pythagorean Theorem you can find the distance between two points in the coordinate system. 
The method returns 0 if the three points are on the same line.
Write a program that prompts the user to enter three points of a triangle and displays the triangle's area.
Here are sample runs of the program:
Enter x1, y1, x2, y2, x3, y3: 2.5 2 5 -1.0 4.0 2.0
The area of the triangle is 2.25
Enter x1, y1, x2, y2, x3, y3: 2 2 4.5 4.5 6 6
The three points are on the same line.
 */