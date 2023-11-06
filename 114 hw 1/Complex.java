public class Complex {

    private double realPart, imaginaryPart;

    public Complex() {
        this(0, 0);
    }
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex addition(Complex x) {
        double realResult = this.realPart + x.realPart;
        double imaginaryResult = this.imaginaryPart + x.imaginaryPart;
        return new Complex(realResult, imaginaryResult);
    }

    public Complex subtraction(Complex x) {
        double realResult = this.realPart - x.realPart;
        double imaginaryResult = this.imaginaryPart - x.imaginaryPart;
        return new Complex(realResult, imaginaryResult);
    }

    public void print() {
        System.out.println("(" + realPart + ", " + imaginaryPart + ")");
    }

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in); //import Scanner, smorter way lol

        System.out.print("Enter real part of the first complex number: ");
        double real1 = scan.nextDouble();
        System.out.print("Enter imaginary part of the first complex number: ");
        double imaginary1 = scan.nextDouble();

        System.out.print("Enter real part of the second complex number: ");
        double real2 = scan.nextDouble();
        System.out.print("Enter imaginary part of the second complex number: ");
        double imaginary2 = scan.nextDouble();

        Complex complex1 = new Complex(real1, imaginary1);
        Complex complex2 = new Complex(real2, imaginary2);

        System.out.print("First complex number is: ");
        complex1.print();

        System.out.print("Second complex number is: ");
        complex2.print();

        System.out.print("additionition of the complex numbers is: ");
        complex1.addition(complex2).print();

        System.out.print("subtractionion of the complex numbers is: ");
        complex1.subtraction(complex2).print();
    }
}


/*
 * Complex.java) Create a class called Complex for performing arithmetic with complex numbers. 
 * Complex numbers have the form: realPart + imaginaryPart * i, where i is √(-1). 
 * Your class for storing Complex numbers will keep 2 data fields: realPart and imaginaryPart as double private variables. 
- Provide a constructor that enables an object of this class to be initialized when it’s declared with its realPart and imaginaryPart.
- Provide a no-argument constructor with default values in case no initializers are provided with both the realPart and imaginaryPart 0. 
Provide public methods that perform the following operations:
- addition two Complex numbers: The real parts are additioned together and the imaginary parts are additioned together. The result should be a Complex number.
- subtraction two Complex numbers: The real part of the right operand is subtractioned from the real part of the left operand, and the imaginary part of the right operand is subtractioned from the imaginary part of the left operand. The result should be a Complex number.
- print() to print Complex numbers in the form 
(a,b) 
where a the real part and b is the imaginary part.
Provide a main method that tests all the methods as in this sample run:
Enter real part of the first complex number: 3
Enter imaginary part of the first complex number: 6
Enter real part of the second complex number: 2
Enter imaginary part of the second complex number: 7
First complex number is: (3.0, 6.0)
Second complex number is: (2.0, 7.0)
additionition of the complex numbers is: (5.0, 13.0)
subtractionion of the complex numbers is: (1.0, -1.0)
 */