import java.util.Scanner;
import java.util.ArrayList;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int up = scan.nextInt();
        scan.close();

        ArrayList<Integer> array = new ArrayList<>();

        for(int i = 1; i<=up; i++) { //loop thru each num till limit
            int divisor = 1;
            int num = 0;
            for(int x = 1;x<i;x++) { //loop thru each divisor till divisor is the num itself
                if(i%divisor==0) {
                num+=divisor;
                }
                divisor++;
            }
            if(num==i) {
                array.add(i);
            }
        }

        System.out.print("The perfect numbers below "+up+" are: " + array);
    }
}