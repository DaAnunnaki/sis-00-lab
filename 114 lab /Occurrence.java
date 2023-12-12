public class Occurrence {

    public static int count(char[] chars, char ch) {
        return count(chars, ch, chars.length - 1);
    }

    public static int count(char[] chars, char ch, int high) {
        if (high < 0) {
            return 0;
        } else {
            int currentCount = (chars[high] == ch) ? 1 : 0;
            return currentCount + count(chars, ch, high - 1);
        }
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'a', 'd', 'a'};
        char targetChar = 'a';
        int occurrences = count(arr, targetChar);
        System.out.println("Occurrences of " + targetChar + ": " + occurrences);
    }
}


/*
 * 1. (Occurrences.java: Occurrences of a specified character in an array) 
 * Write a recursive method that finds the number of occurrences of a specified character in an array. 
 * You need to declare the following two methods. 
 * The second one is a recursive helper method. Test your method.
public static int count(char[ ] chars, char ch){...}
public static int count(char[ ] chars, char ch, int high){...}
 */