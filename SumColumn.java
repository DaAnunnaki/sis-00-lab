import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dimensions of the matrix: ");
        int rowNum = input.nextInt();
        int colNum = input.nextInt();

        double[][] matrix = new double[rowNum][colNum];
        
        System.out.println("Enter the matrix of "+rowNum+" x "+colNum+":");
        //get values of the matrix 
        for(int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = input.nextDouble();
            }
        }

        //loop through all the columns in matrix, and get the sum using sunColumn method
        System.out.println("The sums of the columns are: ");
        for(int col = 0; col < matrix[0].length; col++) {
            System.out.print(sumColumn(matrix, col) + " ");
        }
    }

    //gets the sum of a specific column c in matrix m
    public static double sumColumn(double[][] m, int c) {
        double colSum = 0;
        for(int row = 0; row < m.length; row++) {
            colSum += m[row][c];
        }
        return colSum;
    }
}

/*
 * Write a method  that sums all the numbers in a column in an n x n matrix of double values using the following header:
public static double sumColumn(double [][] m, int c)

Write a main method that first prompts the user to enter the dimension n of an n x m matrix, 
then asks them to enter the matrix row by row (with the elements  separated by spaces). 
The program  should then print out the sums of all the columns of the matrix.
Example:
Enter the dimensions of an n x m matrix: 2 3
Enter the matrix of 2 x 3:
1 2 3
4 5 6
The sums of the columns are:
5 7 9
 */