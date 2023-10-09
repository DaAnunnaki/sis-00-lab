import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine().toLowerCase();
        System.out.print("Enter a character: ");
        char c = scan.next().toLowerCase().charAt(0);
        
        System.out.println(count(str, c));

    }

    public static int count(String str, char a) {
        int num = 0;
        for(int i =0; i<str.length(); i++) {
            if(str.substring(i, i+1).equals(String.valueOf(a))) {
                num++;
            }
        }
        return num;
    }
}