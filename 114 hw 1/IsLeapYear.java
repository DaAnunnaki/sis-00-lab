import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {

        System.out.print("Enter in a year: ");
        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();
        scan.close();

        System.out.print(year);
        if(year%400 == 0) {
            System.err.println(" is a leap year.");
        } else if(year%100==0) {
            System.err.println(" is not a leap year.");
        }else if(year%4==0) {
            System.err.println(" is a leap year.");
        } else {
            System.err.println(" is not a leap year.");
        }
    }
    
}
