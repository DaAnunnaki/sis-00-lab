
import java.util.Scanner;

public class SortRows {
    public static double[][] sortRows(double[][] m) {
        double[][] x = new double[3][3];
        for (int i = 0; i < m.length; i++) {
            x[i] = selectionSort(m[i]);
        }
        return x;
    }

    public static double[] selectionSort(double[] d) {
        for (int i = 0; i < d.length - 1; i++) {
            int minIndex = i;
            
            for (int j = i + 1; j < d.length; j++) {
                if (d[j] < d[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                double temp = d[i];
                d[i] = d[minIndex];
                d[minIndex] = temp;
            }
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        
        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scan.nextDouble();
            }
        }
        scan.close();
        System.out.println("The row-sorted array is:");
        displayMatrix(sortRows(matrix));
    }

    public static void displayMatrix(double[][] x) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(x[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
}

/*
 * (SortRows.java) Implement the following method to sort (in ascending order) each row in a two-dimensional array. 
 * A new array is returned and the original array is intact.
public static double[][] sortRows(double[][] m) 
Write a main method that prompts the user to enter a 3× 3 matrix of double values and displays a new row-sorted matrix. 
Here is a sample run:
Enter a 3-by-3 matrix row by row:
0.15  0.875  0.375
0.55  0.005  0.225
0.30  0.12    0.4
The row-sorted array is:
0.15    0.375  0.875
0.005  0.225  0.55
0.12    0.30    0.4
[Note: Implement your own sorting algorithm from this list: 
selection sort, insertion sort (discussed in the lecture notes) or the bubble sort method (implemented in the lab)]
 */