import java.util.Scanner;

public class ComputeEquation {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        double x = scan.nextDouble();
        System.out.print("Enter second value: ");
        double y = scan.nextDouble();
        //x/(y−3x) + (x−1)/(y/(x+1))
        scan.close();

        double output = x/(y-3*x)+(x-1)/(y/(x+1));
        System.out.println("Equation value: "+output);
    }
}
