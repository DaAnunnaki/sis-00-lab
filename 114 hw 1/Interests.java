import java.util.Scanner;

public class Interests {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter loan amount: ");
        double loan = scan.nextDouble();
        System.out.print("Number of years: ");
        int year = scan.nextInt();

        System.out.println("Interest Rate\tMonthly Payment\tTotal Payment");
        double increment = 0.125;
        for(double interest = 5.0; interest<=8.0; interest+=increment) {
            //System.out.println(interest);
            //System.out.println(d+"%\t"+String.format("%.2f", d*loan/12)+"\t"+String.format("%.2f",d*loan));
            double monthlyInterestRate = interest / 1200;
            double monthlyPayment = loan * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), year * 12)));
            double totalPayment = monthlyPayment * year * 12;
            System.out.printf("%.3f%%  %.2f  %.2f\n", interest, monthlyPayment, totalPayment);
        }
    }   
}