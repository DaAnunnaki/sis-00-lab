public class Factorial {
    public static void main(String[] args) {
        for(int i = 1; i<11; i++) {
            System.out.println("Num: "+i+" Factorial: "+factorial(i));
        }
    }

    public static long factorial(int num) {
        long factorial = 1; 
        for(int i = 2; i<=num; i++) {
            factorial*= i;
        }
        return factorial;
    }
    
}

/*
 * Write a method using loops (no recursion yet) factorial(n) to compute the factorial of an integer n using iteration 
 * (n! = 1 * 2 * ... * n). Note that you should use a long to store the computed result, 
 * and return a long (due to possible overflow issues past 13!). 
 * Write a test program that displays the value of factorial(i) for values of i between 1 and 10 (inclusive).
 */
