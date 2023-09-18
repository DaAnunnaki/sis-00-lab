import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Side1: ");
        double side1 = scan.nextDouble();
        System.out.print("Side2: ");
        double side2 = scan.nextDouble();
        System.out.print("Side3: ");
        double side3 = scan.nextDouble();

        System.out.print("output: ");
        if(side1+side2>side3 && side2+side3>side1 && side1+side3>side2) {
            if(side1==side2 && side2==side3) {
                System.out.println("Equilateral");
            } else if(side1==side2 || side2==side3 || side1==side3) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.err.println("invalid input!");
        }

    }
}
