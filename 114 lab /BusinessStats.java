import java.util.Scanner;

public class BusinessStats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] array = new double[10];
        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i<array.length; i++) {
            array[i] = scan.nextDouble();
        }
        System.out.format("The mean is %.2f", mean(array));
        System.out.println();
        System.out.format("The standard deviation is %.4f", deviation(array));
    }

    public static double deviation(double[] x) {
        double mean = mean(x), numerator = 0, denominator = x.length-1;
        //standard_deviation = Sqrt( ( Sum i=1,n((xi = mean)^2) ) / (n-1) )
        for(double num: x) {
            numerator += Math.pow(num-mean, 2);
        }
        return Math.sqrt(numerator/denominator);
    }

    public static double mean(double[] x) {
        double mean = 0.0;
        double sum = 0.0;
        for(double n: x) {
            sum+=n;
        }
        mean=sum/10.0;
        //mean = ( Sum i=1,n(xi) ) / n
        return mean;
    }
}

/*
 * In business applications, you are often asked to compute the average/mean and standard deviation of data. The mean is simply the average of the numbers. The standard deviation is a statistic that tells you how tightly all the data are clustered around the mean in a set of data. Compute the standard deviation of numbers. Please use the following formula to compute the standard deviation of n numbers.
mean = ( Sum i=1,n(xi) ) / n
standard_deviation = Sqrt( ( Sum i=1,n((xi = mean)^2) ) / (n-1) )
To compute the standard deviation using the above formula, you have to store the individual numbers using an array, so they can be used after the mean is obtained.
Your program should contain the following methods:
 to compute the deviation of double values: 
public static double deviation(double[] x) 
 to compute the mean of an array of double values: 
public static double mean(double[] x) 
Write a main method that prompts the user to enter 10 numbers and displays the mean and standard deviation, as presented in the following sample run:
Enter 10 numbers : 1.9 2.5 3.7 2 1 6 3 4 5 2
The mean is 3.11
The standard deviation is 1.55738
 */