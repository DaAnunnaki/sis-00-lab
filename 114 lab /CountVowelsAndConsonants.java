import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        str = str.toLowerCase();

        int v = 0;
        int c = 0;
        for(int i = 0; i<str.length(); i++) {
            if(str.substring(i, i+1).equals("a")||str.substring(i, i+1).equals("e")||str.substring(i, i+1).equals("i")||str.substring(i, i+1).equals("o")||str.substring(i, i+1).equals("u")) {
                v++;
            } else if(!str.substring(i, i+1).equals(" ")) {
                c++;
            }
        }
        System.out.println("The number of vowels is "+v+"\nThe number of consonants is "+c);
    }
}
/*
 * Enter a string: Programming is fun
The number of vowels is 5
The number of consonants is 11
 */