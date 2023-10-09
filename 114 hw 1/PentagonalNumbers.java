import java.util.Scanner;

public class PentagonalNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.err.print("Enter n: ");
        int n = scan.nextInt();
        scan.close();

        int num = n*(3*n-1)/2;
        System.out.println("Pentagonal number: "+num);
    }
}