public class Emirp {
    public static void main(String[] arg) {

        int x = 0;
        int i = 13;
        while(x<100) {
            if(prime(i) && non_palindrome(i)) {
                System.out.print(i+" ");
                x++;
            }
            i++;
        }
    }    

    public static boolean non_palindrome(int n) {
        String p = Integer.toString(n);
        String str = new StringBuilder(p).reverse().toString();
        int i = Integer.valueOf(str);
        if(i!=n && prime(i)) { // eliminate num like 101, 151 etc
            return true;
        } else return false;
    }

    public static boolean prime(int n) {
        int x = 0;
        for(int i = 1; i<n; i++) {
            if(n%i==0) {
                x++;
            } 
        }
        if(x==1) {
            return true;
        } else return false;
    }
}

/*
 * (Emirp.java) An emirp (prime spelled backward) is a non-palindromic prime number whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so 17 and 71 are emirps. Write a program that displays the first 100 emirps. Display all numbers in one line, separated by exactly one space, as follows:
13 17 31 37 71 73 79 97 107 113 149 157 167 179 199 311 337 347 359 389 …
Do not write the complete program in the main method. You must define and use two additional methods: 
- one to check for the non_palindrome(int n) (returns boolean), and 
- one to check for prime(int n) (returns boolean). 
 
 */