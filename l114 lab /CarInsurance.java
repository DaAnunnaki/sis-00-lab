import java.util.Scanner;

public class CarInsurance {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter in the premium price of the auto insurance policy: ");
        double pre = scan.nextDouble();

        System.out.print("Please enter in the person's age: ");
        int age = scan.nextInt();

        System.out.print("Please enter in either Male or Female for gender: ");
        String sex = scan.next();

        if(age>=18 && age<21 && sex.equals("Male")) {
            pre*=1;
        } else if(age>=18 && age<21 && sex.equals("Female")) {
            pre*=0.9;
        } else if(age>=21 && age<30) {
            pre*=0.75;
        } else if(age>=30 && age<60 && sex.equals("Male")) {
            pre*=0.6;
        } else if(age>=30 && age<60 && sex.equals("Female")) {
            pre*=0.7;
        } else if(age>=60) {
            pre*=1;
        } else {
            pre = -1.0;
        }
        System.out.println("Premium: "+pre);

    }    
}
