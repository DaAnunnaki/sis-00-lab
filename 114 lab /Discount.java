import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Fixed price: $");
        double p = scan.nextInt();
        System.out.print("Quantity: ");
        int q = scan.nextInt();
        scan.close();

        double dp = 0.0;
        double apu = 0.0;
        int disc = 0;

        if(q<20 && q>9) {
            disc = 20;
        } else if(q<50 && q>19) {
            disc = 30;
        } else if(q<100 && q>49) {
            disc = 40;
        } else if(q>99) {
            disc = 50;
        }
        dp = p*((double) disc/100.0);
        apu = p-dp;
        System.out.println("Discount: " + disc + "%\nDiscounted price: $" + dp 
        + "\nDiscounted amont per unit: $" + apu + "\nTotal price: $"+apu
        + " * " + q + " = $" + apu*q);

    }
}
