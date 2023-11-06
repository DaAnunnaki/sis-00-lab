
import java.util.Scanner;

public class Rational {

    private int numerator, denominator;

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator cannot be 0. Setting denominator to 1.");
            this.numerator = numerator;
            this.denominator = 1;
        } else {
            int a = Math.abs(numerator), b = Math.abs(denominator);
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            int gcd = Math.abs(a);
            this.numerator = numerator / gcd;
            this.denominator = denominator / gcd;
            if (denominator < 0) {
                this.numerator = -this.numerator;
                this.denominator = -this.denominator;
            }
        }
    }

    public Rational() {
        this(0, 1);
    }

    public Rational addition(Rational num) {
        int newNumerator = this.numerator * num.denominator + num.numerator * this.denominator;
        int newDenominator = this.denominator * num.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational subtraction(Rational num) {
        int newNumerator = this.numerator * num.denominator - num.numerator * this.denominator;
        int newDenominator = this.denominator * num.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational multiplication(Rational num) {
        int newNumerator = this.numerator * num.numerator;
        int newDenominator = this.denominator * num.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational division(Rational num) {
        int newNumerator = this.numerator * num.denominator;
        int newDenominator = this.denominator * num.numerator;
        return new Rational(newNumerator, newDenominator);
    }

    public void print() {
        System.out.println(numerator+"/"+denominator);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter numerator for the first rational number: ");
        int numerator1 = scan.nextInt();
        System.out.print("Enter a non-zero denominator for the first rational number: ");
        int denominator1 = scan.nextInt();

        System.out.print("Enter numerator for the second rational number: ");
        int numerator2 = scan.nextInt();
        System.out.print("Enter a non-zero denominator for the second rational number: ");
        int denominator2 = scan.nextInt();

        Rational rational1 = new Rational(numerator1, denominator1);
        Rational rational2 = new Rational(numerator2, denominator2);

        System.out.print("First rational number is: ");
        rational1.print();

        System.out.print("Second rational number is: ");
        rational2.print();

        System.out.print("Addition of the rational numbers is: ");
        rational1.addition(rational2).print();

        System.out.print("Subtraction of the rational numbers is: ");
        rational1.subtraction(rational2).print();

        System.out.print("Multiplication of the rational numbers is: ");
        rational1.multiplication(rational2).print();

        System.out.print("Division of the rational numbers is: ");
        rational1.division(rational2).print();
    }
}
/*
 * Create a class called Rational for performing arithmetic with fractions. 
 * Use integer variables to represent the private instance variables of the class: the numerator and the denominator. 
 * 
- Provide a constructor that enables an object of this class to be initialized when it’s declared with numerator and denominator. 
The constructor should store the fraction in reduced form such that the greatest common divider between the absolute value of the numerator 
and the absolute value of the denominator is 1, and the denominator > 0. 
For example, the fraction 2/4 is equivalent to 1/2 and would be stored in the object as 1 in the numerator and 2 in the denominator. 

- Provide a no-argument constructor with default values in case no initializers are provided with numerator 0 and denominator 1 (because no division by 0 is allowed. 
Note: the denominator cannot be 0). 

Provide public methods that perform each of the following operations:
- Add two Rational numbers: The result of the addition should be a Rational number.
- Subtract two Rational numbers: The result of subtraction should be a Rational number.
- Multiply two Rational numbers: The result of the multiplication should be a Rational number.
- Divide two Rational numbers: The result of the division should be a Rational number.
- print() to Rational number in the form a/b, where a is the numerator and b is the denominator.
Provide a main method that tests all the methods as in this sample run:
Enter numerator for the first rational number: 4
Enter a non-zero denominator for the first rational number: 6
Enter numerator for the second rational number: 1
Enter a non-zero denominator for the second rational number: 4
First rational number is: 2/3
Second rational number is: 1/4
Addition of the rational numbers is: 11/12
Subtraction of the rational numbers is: 5/12
Multiplication of the rational numbers is: 1/6
Division of the rational numbers is: 8/3

if(x<y) {
            int z = y;
            y=x;
            x=z;
        }
        int num = 0;
        for(int i = 1; i<=y; i++) {
            if(x%i==0 && y%i==0) {
                num = i;
            }
        }
 */

 