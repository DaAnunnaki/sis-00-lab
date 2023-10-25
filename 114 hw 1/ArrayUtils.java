import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] array = randomArray(100, 21);
        System.out.println("getting a array of randomly generated integer: "+Arrays.toString(array));
        System.out.println("the sum of the array from above: "+arraySum(array));
        System.out.println("checking to see if this array contains the num 12: "+contains(array, 12));
        System.out.println("the amount of integers in this array that are multiples of 7: "+countMultiplesOf(array, 7));
    }

    public static int[] randomArray(int size, int limit) {
        int[] array = new int[size];
        for(int i = 0; i<array.length; i++) {
            array[i] = (int)Math.floor(Math.random()*limit+0);
        }
        return array;
    }
 
    public static String print(int[] array) {
        String str = "";
        for(int i = 0; i<array.length; i++) {
            str+=array[i]+"";
        }
        return "["+str+"]";
    }

    public static int arraySum(int[] array) {
        int sum = 0;
        for(int i = 0; i<array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }

    public static int contains(int[] array, int n) {
        int index = 0;
        for(int i = 0; i<array.length; i++) {
            index++;
            if(array[i]==n) {
                return index;
            }
        }
        return -1;
    }
    
    public static int countMultiplesOf(int[] array, int num) {
        int n = 0; 
        for(int i = 0; i<array.length; i++) {
            if(array[i]!=0 && array[i]%num==0) {
                n++;
            }
        }
        return n;
    }
       
}

/*
 * (25 points) Create a Java file named ArrayUtils.java and follow the steps below:
a. (5 points) Define a method, named randomArray with two parameters: 1) an integer indicating the size of the 
array to be created and 2) a positive integer indicating the upper limit for the range of random numbers to be generated.
If the second parameter is 101, then it would mean that the random numbers will be in the range of 0 and 100 inclusive. 
This method should create an array of the given size and fill it with random numbers between the given range. 
The function returns the array created as its return value. In your main call randomArray with two actual arguments: 
100 as the size and 21 as the upper limit, and store the returned array into a local variable in main.
Example:
randomArray(5,21) returns [3,16,2,3,19]

b. (5 points)Define a method named print with one parameter of type array of integers, 
which outputs the elements of the given array to the standard output device, i.e., the computer screen. 
In your main call print with the local variable that you chose in the step above to see if the elements in the array are
printed okay. You will want to use this print function whenever you want to see the elements of an array containing integers. 
While testing your program, include a call to this function wherever useful, but comment out all the calls to this function in 
the final version that you hand in.
Example:
print(new int[]{1,2,3,4}) prints [1 2 3 4 ]

c. (5 points) Define a method, named arraySum with one parameter of type array of integers, which returns the sum of all the 
elements in the array. In your main print the average as a double of all the numbers in the array that you obtained in the 
first step above. To compute the average, you must use arraySum that you defined earlier. 
Make sure to add annotations to the output so that it will be meaningful for people seeing the program run.
Example: 
arraySum(new int[]{1, 2}) returns 3

d. (5 points) Define a method named contains with two formal parameters: 
1) an array of integers and 
2) a single integer. The method returns the index of the array where the first occurrence of the second argument is found, 
if that number is contained within the array. If the second argument is not contained in the first array argument, 
the method returns −1. Do not use the existing indexOf method for solving this problem, you are writing your own solution. 
In your main call contains with the array obtained in the first step above (the random array with 100 as the size and 21 
as the upper limit) and 12 as the second argument, and prints the result.
Example: 
contains(new int[]{1,2,3,4), 2) returns 1
contains(new int[]{1,2,3,4), 5) returns -1

e. (5 points) Define a method named countMultiplesOf and add it to the ArrayUtils class. The method should take two parameters: 
1) an array of integers and 2) an integer. This method returns the count of the integers in the array that are multiples of 
the second parameter. For example, 8 is a multiple of 2, but not a multiple of 3, and zero is a multiple of any number. 
Hint: I suggest that you also define and use an auxiliary function that tests if a number is a multiple of another number 
and returns a boolean value.In your main call countMultiplesOf with the array obtained in the first step. 
Use 7 as the second argument and print the result.
Example:
countMultiplesOf(new int[]{1,2,3,4}, 2) returns 2 (because 2 and 4 are multiples of 2).
 */