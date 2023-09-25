import java.util.Scanner;

public class PremiumAirlines {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter membership (Diamond/Platinum/Regular): ");
        String mem = scan.next();

        System.out.print("Please enter ticket price: ");
        int price = scan.nextInt();

        System.out.print("Please enter current points: ");
        int point = scan.nextInt();

        scan.close();
        
        if(mem.equals("Diamond")) {
            if(price>=5000) {
                point+=35;
            } else if(price>=2000 && point>300) {
                point+=30;
            } else if(price>=500 && point>=100) {
                point+=10;
            } else if(point>=25) {
                point+=2;
            }
        } else if(mem.equals("Platinum")) {
            if(price>=5000) {
                point+=35;
            } else if(price>=2000) {
                point+=20;
            }
        } else if(mem.equals("Regular") && price>=5000) {
            point+=5;
        }
        System.out.println("Points: "+point);

    }
}
