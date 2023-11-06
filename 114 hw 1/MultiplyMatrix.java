
import java.util.Scanner;

public class MultiplyMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter matrix1:");
        double[][] one = new double[3][3];
        for(int i = 0; i<3; i++) {
            for(int j = 0; j<3; j++) {
                one[i][j] = scan.nextDouble();
            }
        }

        System.out.println("Enter matrix2:");
        double[][] two = new double[3][3];
        for(int i = 0; i<3; i++) {
            for(int j = 0; j<3; j++) {
                two[i][j] = scan.nextDouble();
            }
        }
        scan.close();
        System.out.println("Multiplication of the matrices is: ");
        print(multiplyMatrix(one, two));

    }

    public static double[][] multiplyMatrix(double [][] a,double[][] b) {
        double[][] result = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double sum = 0;
                for (int k = 0; k < 3; k++) {
                    sum += a[i][k] * b[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }

    public static void print(double[][] x) {
        for(int i = 0; i<3; i++) {
            for(int j = 0; j<3; j++) {
                System.out.printf(" %.1f", x[i][j]);
            }
            System.out.println();
        }
    }
}

/*
 * (MultiplyMatrix.java) Write a method to multiply two matrices:
public static double[][] multiplyMatrix(double [][] a,double[][] b).
To multiply matrix a by matrix b, the number of columns in a must be the same as the number of rows in b. 
Let c be the result of the multiplication. Assume the column size of matrix a is n. 
Each element c_ij = a_i1×b_1j + a_i2×b_2j + ... + a_in×b_nj  

Write a main method that prompts the user to enter two 3×3 matrices and displays their product.
Here is a sample run:

Enter matrix1: 
1 2 3 
4 5 6 
7 8 9
Enter matrix2: 
0 2 4 
1 4.5 2.2 
1.1 4.3 5.2
Multiplication of the matrices is:   
5.3 23.9 24.0
11.6 56.3 58.2
17.9 88.7 92.4x
 */
