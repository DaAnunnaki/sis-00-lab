import java.util.Scanner;

public class Pyramid {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        
            int numOfNum = 1;
            
            for(int num = scan.nextInt(); num>0; num--) { //loop thru lines
                System.out.print("\t");
                int power = 0;
                for(int i = numOfNum/2; i>0; i--) {
                    System.out.print((int)Math.pow(2, power)+" ");
                    power++;                    
                }
                for(int i = numOfNum-(numOfNum/2); i>0; i--) {
                    System.out.print((int)Math.pow(2, power)+" ");
                    power--;
                }
                System.out.println("");
                numOfNum+=2;

            }

    }
}