import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {

        System.out.print("Number of eggs in the order: ");
        Scanner scan = new Scanner(System.in);
        int egg = scan.nextInt();

        double money; 
        int dozen, rem;
        dozen = egg/12;
        rem = egg%12;
        money = dozen*3.25;
        money+=rem*0.45;

        System.out.println("You ordered "+egg+" eggs. That’s "+dozen+" dozen ("
        +dozen+" x 12 = "+dozen*12+" eggs) at $3.25 per dozen ("+dozen+" x $3.25 = $"
        +(double)dozen*3.25+") and "+rem+" loose eggs at 45 cents ("+rem+" x 45c = $"+(double)rem*.45+
        ") for a total of $"+money+" ($"+(double)dozen*3.25+" + $"+(double)rem*.45+" = $"+money+").");

    }
    
}
