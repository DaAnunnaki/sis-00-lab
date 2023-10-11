import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = scan.nextLine();
        System.out.print("Enter the second string: ");
        String sec = scan.nextLine();
        scan.close();
        System.out.println(anagram(first, sec));
    }

    public static String anagram(String s1, String s2) {
        String str1 = s1.replaceAll("\\s", "").toLowerCase();
        String str2 = s2.replaceAll("\\s", "").toLowerCase();

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if(Arrays.equals(charArray1, charArray2)) {
            return s1+" and "+s2+" are anagrams";
        } else return s1+" and "+s2+" are NOT anagrams";
    }
}

/*
 * (Anagram.java) Two strings are anagrams if they are written using the same exact letters. 
 * Write a method anagram(String s1, String s2) to check if given two strings are anagrams or not. 
 * You have to ignore the case and space characters. Write a test program for that prompts 
 * the user to input two strings and invokes this method. Some example runs are:
Enter the first string: abbacba
Enter the second string: abcabba
abbacba and abcabba are anagrams
Enter the first string: banana
Enter the second string: cabana
banana and cabana are NOT anagrams
Enter the first string: Eleven plus two
Enter the second string: Twelve plus one
Eleven plus two and Twelve plus one are anagrams
 */