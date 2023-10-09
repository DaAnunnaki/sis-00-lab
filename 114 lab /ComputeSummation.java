public class ComputeSummation {
    public static void main(String[] args) {
        System.out.println("i\tm(i)");
        double num = 0.0;
        for(int i =1; i<=20; i++) {
            num+= (double)i/(i+1);
            System.out.printf("%-2d\t%.4f\n", i, num);
        }
    }    
}
/*
 * Write a method to compute the following summation:
m(i)= 1/2+2/3+…+i/(i+1) 
Write a main method that displays the following table:
i        m(i)
1        0.5000
2        1.1667
…
19        16.4023
20        17.3546
 */