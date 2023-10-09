import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String input = scan.nextLine();
        scan.close();
        
        String str = input;
        for(int i = 0; i<input.length(); i++) {
            if(input.substring(i, i+1).equals(" ")) {
                str = str.substring(0, i)+str.substring(i+1, str.length());
            }
        }
        if(new StringBuilder(str).reverse().equals(str)) {
            System.out.println("Input string "+input+" is a palindrome");
        } else {
            System.out.println("Input string "+input+" is NOT a palindrome");
        }
    }
}
/*
 * Write a method that checks whether the input string or a sentence (a string with spaces) is a palindrome or not. The method should be case insensitive and should ignore spaces. Write a test program that prompts the user to input a string and invokes this method. Some example runs are:
Enter the input string: madam
Input string madam is a palindrome
Enter the input string: banana
Input string banana is NOT a palindrome
Enter the input string: Race Car
Input string Race Car is a palindrome
Enter the input string: Too HOT to hoot
Input string Too HOT to hoot is a palindrome
 */