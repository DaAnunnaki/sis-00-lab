import java.util.Scanner;

public class GasRefillCalculator {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the distance: ");
        int mile = scan.nextInt();
        System.out.print("Enter the mpg: ");
        double mpg = scan.nextDouble();
        System.out.print("Enter the price: ");
        double price = scan.nextDouble();

        double p = (double)mile/mpg*price;
        System.out.println("Price for the trip: "+ p);
    }
}
