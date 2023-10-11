import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        System.out.print("Enter numbers: ");
        Scanner scan = new Scanner(System.in);
        int[] num =  new int[10];
        ArrayList<Integer> array = new ArrayList<>();

        for(int i = 0; i<10; i++) {
            int n = scan.nextInt();
            num[i]=n;
            array.add(n);
        }
        scan.close();

        for(int numm: num/*int i = 0; i<num.length; i++*/) {
           if(array.contains(numm)) {
            array.remove(numm);
           }
        }
        
        System.out.println("Unique number: "+array);
    }
}

/*
 * DistinctNumbers.java: Write a program that reads in ten numbers and displays distinct numbers (i.e., if a number appears multiple times, it is displayed only once).
Hint: Read a number and store it to an array if it is new. If the number is already in the array, discard it. After the input, the array contains the distinct numbers. Keep a counter of the unique numbers.
Example:
Enter numbers: 1 2 2 1 3 4 3 2 1 5 
Unique numbers: 1 2 3 4 5

 */