public class LargestInArray {
    
    public static int findLargest(int[] list, int currentIndex) {
        /*int x = 0;
        for(int i = 0; i<list.length-1; i++) {
            if(x > max(list[i], list[i+1])) {
                x = findLargest(list, i);
            }
        }
        return x;*/
        if (currentIndex == 0) {
            return list[0];
        } else {
            return max(list[currentIndex-1], findLargest(list, currentIndex - 1));
        }
    }

    public static int max(int a, int b){
         if (a > b) { return a; }
         else { return b; }
    }

    public static void main(String[] args) {
        int[] list = new int[3];
        list[0] = 4;
        list[1] = 2;
        list[2] = 9;

        int max = findLargest(list, list.length);
        System.out.println("the largest number of this array is: " +max);
    }
}

/*
 * 2. (LargestInArray.java) Define a recursive method named findLargest(), 
 * which locates and returns the largest value in an array of integers. 
 * For the sake of efficiency, your method should use the max() helper method below:
public static int max(int a, int b){
    if (a > b) { return a; }
    else { return b; }
}
Your method header should look like the following:
public static int findLargest (int [ ] list, int currentIndex)
Test your method.
 */