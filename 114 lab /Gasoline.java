import java.util.Scanner;

public class Gasoline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        double min = scan.nextDouble();
        System.out.print("Enter the constant speed of the car (m/h): ");
        double mph = scan.nextDouble();
        System.out.print("Enter the fuel efficiency of the car (m/g): ");
        double mpg = scan.nextDouble();
        System.out.println("Consumed gas for the period (in gallons): " + min/60*mph*1/mpg);

        scan.close();


    }
    
}