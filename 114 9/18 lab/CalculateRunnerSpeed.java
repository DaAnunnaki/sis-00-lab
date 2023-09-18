import java.util.Scanner;

public class CalculateRunnerSpeed {

    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input the distance in miles: ");
        int m = scan.nextInt();
        System.out.print("Input the time in minutes: ");
        int min = scan.nextInt();
        double hr = (double)min/60.0;

        double speed = (double)m / hr;

        System.out.println("Speed: " + speed);


    }
    
}
