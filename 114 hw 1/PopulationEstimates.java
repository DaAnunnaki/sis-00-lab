import java.util.Scanner;

public class PopulationEstimates {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scan.nextInt();
        scan.close();
         
        String str = year+"";
        String n = str.substring(2, 4);
        int nn = Integer.valueOf(n);
        int num = (nn-10)*3+310;

        System.out.println("Population estimate (millions of people): "+num);



    }
    
}
