import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int x = scan.nextInt();
        System.out.print("Enter the second integer: ");
        int y = scan.nextInt();
        if(x<y) {
            int z = y;
            y=x;
            x=z;
        }
        int num = 0;
        for(int i = 1; i<=y; i++) {
            if(x%i==0 && y%i==0) {
                num = i;
            }
        }
        System.out.println("The greatest common divisor is: "+num);

    }
}

/*
 * Write down a program to find out the greatest common divisor for two integers. The program should prompt the user to input two integers and output the greatest common divisor. Here are some example runs:
Enter the first integer: 12
Enter the second integer: 16
The greatest common divisor is: 4
Enter the first integer: 3
Enter the second integer: 5
The greatest common divisor is: 1
 */