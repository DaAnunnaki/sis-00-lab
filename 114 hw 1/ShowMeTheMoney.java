import java.util.Scanner;

public class ShowMeTheMoney {

    public static void main(String[] args) {

        System.out.print("Enter in the number of farthings: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int sterling, shilling, penny, rem;

        sterling = input / 960;
        rem = input % 960;
        shilling = rem / 48;
        rem = rem % 48;
        penny = rem / 4;
        rem = rem % 4;
      

        System.out.println("Pound Sterling " + sterling + "\nShilling " + shilling + "\nPenny " + penny + "\nFarthings " + rem);

    }
    
}
