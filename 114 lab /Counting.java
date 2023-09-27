import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a series of number (enter 0 to stop): ");
        
        int x = scan.nextInt();
        int neg = 0;
        int pos = 0;
        int total = 0;
        int num = 0;
        while(x!=0) {
            if(x<0) {
                neg++;
                total++;
                num+=x;
            } else {
                pos++;
                total++;
                num+=x;
            }
            x = scan.nextInt();
        } 
            scan.close();
            System.out.println("amount of positive num: "+pos+
            "\namount of negative number: "+neg+
            "\ntotal: "+total+
            "\naverage: "+((float)num)/((float)total));
    }
}
