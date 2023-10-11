import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        System.out.print("Enter decimal: ");
        int decimal = new Scanner(System.in).nextInt();
        System.out.println(dec2Bin(decimal));
    }

    public static String dec2Bin(int value) {
        String binary = Integer.toBinaryString(value);
        return "Binary: "+binary;
    }
}
/*
 *  (DecimalToBinary.java) Write a method that converts a decimal number into a binary number as a string. The method header is:
public static String dec2Bin(int value)
Write a main method that prompts the user to enter a decimal number and displays its binary equivalent. Example:
Enter decimal: 10
Binary: (1010)_2
 */
