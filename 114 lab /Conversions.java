import java.util.Scanner;

public class Conversions {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("A - convert pounds to kilos\n" + //
                "B - convert kilos to pounds\n" + //
                "C - convert kilometers to miles\n" + //
                "D - convert miles to kilometers\n" + //
                "E - convert Celsius to Fahrenheit\n" + //
                "F - convert Fahrenheit to Celsius\n" + //
                "G - Exit\n" + //
                "Enter your option: ");
        String str = scan.next();

        while(!str.equals("G")) {
            if (str.equals("A")) {
            System.out.print("Enter a quantity in pounds: ");
            int x = scan.nextInt();
            System.out.println(x+" pounds is " + ((double)x)/2.205 + " kgs");
        } else if (str.equals("B")) {
            System.out.print("Enter a quantity in kilos: ");
            int x = scan.nextInt();
            System.out.println(x+" kilos is " + ((double)x)*2.205 + " lbs");
        } else if (str.equals("C")) {
            System.out.print("Enter a quantity in kilometers: ");
            int x = scan.nextInt();
            System.out.println(x+" kilometers is " + ((double)x)/1.609 +" miles");
        } else if (str.equals("D")) {
            System.out.print("Enter a quantity in miles: ");
            int x = scan.nextInt();
            System.out.println(x+" miles is " + ((double)x)*1.609 +" km");
        } else if (str.equals("E")) {
            System.out.print("Enter a quantity in celsius: ");
            int x = scan.nextInt(); //(0°C × 9/5) + 32 = 32°F
            double it = (double)x*9/5+32;
            System.out.println(x+" celsius is " + it +"f");
        } else if (str.equals("F")) {
            System.out.print("Enter a quantity in Fahrenheit: ");
            int x = scan.nextInt();
            System.out.println(x+" Fahrenheit is " +((double)x-32)*5/9 + "c");
        } 
        System.out.println("Enter your option: ");
        str = scan.next();      
        }
        
        scan.close();
        System.out.println("Good bye!");
    }   
}