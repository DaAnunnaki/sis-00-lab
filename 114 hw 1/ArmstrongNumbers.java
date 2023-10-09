import java.util.Scanner;
import java.util.ArrayList;

public class ArmstrongNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>(); 

        System.out.print("Enter the lower limit: ");
        int low = scan.nextInt();

        System.out.print("Enter the upper limit: ");
        int high = scan.nextInt();

        scan.close();

        for(int i = low; i<=high; i++) {
            String num = Integer.toString(i);
            int m = 0;
            for (int x = 0; x<num.length(); x++) {
	            int n = Character.getNumericValue(num.charAt(x));
                m+=Math.pow(n, num.length());
            } if (i==m) {
                array.add(i);
            }
        }
        
        System.out.println("The Armstrong numbers between "+low+" and "+high+" are: "+array);
    }   
}