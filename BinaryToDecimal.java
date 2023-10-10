import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.print("Enter binary: ");
        String bin = new Scanner(System.in).nextLine();
        System.out.println("Decimal: " +bin2Dec(bin));
    }

    public static int bin2Dec(String binaryString) {
        int dec = Integer.parseInt(binaryString, 2);
        return dec;
    }
}

/*
 * (BinaryToDecimal.java) Write a method that parses a binary number as a string and converts it into a decimal integer. The method header is: 
public static int bin2Dec(String binaryString)
Write a main method that prompts the user to enter a binary number as a string and displays its decimal equivalent. Example:
Enter binary: 1010
Decimal: 10
 */