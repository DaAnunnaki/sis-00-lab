public class Emirp {
    public static void main(String[] arg) {

        for(int i = 0; i<=100; i++) {

        }

    }    

    public static boolean non_palindrome(int n) {
        return true;
    }

    public static boolean prime(int n) {
        for(int i = 0; i<n; i++) {
            if(n%n!=0) {
                return false;
            } 
        }
        return true;
    }
}

/*
 * (Emirp.java) An emirp (prime spelled backward) is a non-palindromic prime number whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so 17 and 71 are emirps. Write a program that displays the first 100 emirps. Display all numbers in one line, separated by exactly one space, as follows:
13 17 31 37 71 73 79 97 107 113 149 157 167 179 199 311 337 347 359 389 …
Do not write the complete program in the main method. You must define and use two additional methods: 
- one to check for the non_palindrome(int n) (returns boolean), and 
- one to check for prime(int n) (returns boolean). 
 
 */