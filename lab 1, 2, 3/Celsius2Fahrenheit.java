import java.util.Scanner;

public class Celsius2Fahrenheit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        int c = scan.nextInt();

        double f = 0.0;
        f = (9.0/5) * c + 32;

        System.out.println(c + " in Celsius is " + f + " in Fahrenheit.");
    }
}
