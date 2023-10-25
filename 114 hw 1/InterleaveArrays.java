import java.util.Arrays;

public class InterleaveArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6})));
        System.out.println(Arrays.toString(interleaveArrays(new int[]{10,20,30,40,50,60,70,80}, new int[]{2,4,6,8})));
        System.out.println(Arrays.toString(interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6,8,10})));
        System.out.println(Arrays.toString(interleaveArrays(new int[]{0,0,0}, new int[]{1,2,3})));
        System.out.println(Arrays.toString(interleaveArrays(new int[]{5,10,15,20}, new int[]{3,6,9})));

    }

    public static int[] interleaveArrays(int[] array1, int[] array2) {
        int[] array = new int[array1.length+array2.length];
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            array[k++] = array1[i++];
            array[k++] = array2[j++];
        }
        while (i < array1.length) {
            array[k++] = array1[i++];
        }
        while (j < array2.length) {
            array[k++] = array2[j++];
        }
        return array;
    }
}

/*
 * InterleaveArrays.java: Write a method public static int[] interleaveArrays(int[] array1, int[] array2) that takes in two arrays of integers. 
 * Create and return a new array by interleaving the array together. Once an array is empty, use all the elements 
 * from the remaining array. Include in your program the test cases listed below and add at least 2 more.
Example:
interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6}) returns [1, 2, 3, 4, 5, 6]
interleaveArrays(new int[]{10,20,30,40,50,60,70,80}, new int[]{2,4,6,8}) returns [10, 2, 20, 4, 30, 6, 40, 8, 50, 60, 70, 80]
interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6,8,10}) returns [1, 2, 3, 4, 5, 6, 8, 10]
 */