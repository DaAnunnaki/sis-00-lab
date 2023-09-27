import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input: ");
        String str = scan.nextLine();

        System.out.println(new StringBuilder(str).reverse().toString());
    }
}