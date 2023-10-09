import java.util.Scanner;

public class Kgs_pounds {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("enter amount: ");

        int x = scan.nextInt();
        scan.close();
        
        System.out.println("kg\tpounds\t\tpound\tkilogram");

        int kg = 1;
        int lb = 20;
        for(int i = 0; i<=x; i++) {
            System.out.println(kg+"\t"+String.format("%.2f",(double)kg*2.2) + "\t\t" + lb+"\t"+String.format("%.2f",(double)lb/2.2));
            kg+=2;
            lb+=5;
        }
    }
}