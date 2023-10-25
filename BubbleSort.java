public class BubbleSort {
    public static void main (String[] args) {
        double[] x = {16.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5}; 
        bubbleSort(x);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
    
    public static void bubbleSort(double[] arr) {
        boolean changed = true;
        do {
            changed = false; 
            for (int j = 0; j < arr.length -1; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap arr[j]] and arr[j+1] value 
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    changed = true;
                }
            }
        }while(changed);
    }

}
/*
 * Write a  bubbleSort method that uses the bubble-sort algorithm. 
 * The bubble-sort algorithm makes several passes through the array. 
 * On each pass, successive neighboring pairs are compared. If a pair is in decreasing order, 
 * its values are swapped; otherwise, the values remain unchanged. 
 * The technique is called a bubble sort or sinking sort because the smaller values gradually "bubble" 
 * their way to the top and the larger values sink to the bottom. The algorithm can be described as follows:
boolean changed = true;
do {
   changed = false;
   for (int j = 0; j < list.length - 1; j++)
      if (list[j] > list[j + 1]) {
         swap list[j] with list[j + 1];
         changed = true;
      }
} while (changed);
Clearly, the list is in increasing order when the loop terminates. 
It is easy to show that the do loop executes at most list.length –1 times. 
Use the values [6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5] to test the method. Include your main method that tests your program.
 */