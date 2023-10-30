import java.util.Scanner;

public class other {

    public static void main(String[] args) {

        System.out.printf("'%-13s' %n", "sup");
        double d = 61.0;
        int i = 3;
        int j = (int) (d / i);
        System.out.println((double) 90 / 9);
        double f4 = 22;
        int p = (int) 5.9;
        System.out.println(p);

        Scanner keyboard = new Scanner(System.in);
        int intOne = 0;
        double doubleOne = 0;
        short shortOne = 0;
        byte byteOne = 0;
        System.out.print("Enter a byte :: ");
        System.out.println(byteOne);

        //System.out.println("Hyde "42/8-3" Park");

        System.out.println((int)(Math.random() * 18) -27 + "okay");

        for(int m =0; m<5; m++) { //m is i
            System.out.print(m + " ");
            for(int q = 0; q<5; q++) { //q is j
                System.out.print(q + " ");
            }
            System.out.println();
        }


        int x=-2;
        while(x<9)
        {
        x++;
        System.out.print(x + " ");
        }

        String str = "MRBLUE";
        while(!str.isEmpty()) // str = RBLUE
        {
            for(int k=0; k<str.length(); k+=2) // k = 4
                System.out.print(str.charAt(k)); // RLE
            System.out.println();
            str = str.substring(1); //str = RBLUE
        }




    }
}
