import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = scan.nextLine();

        System.out.print("Enter the second string: ");
        String sec = scan.nextLine();
        scan.close();

        // String[] words = first.split("\\s+");
        // String[] ww = sec.split("\\s+");

/*      String com = "";
        for(int i = 0; i<words.length; i++) {
            if(i<=ww.length) {
                if(words[i].equals(ww[i])) {
                    com+=words[i];
                }
            }
        }
*/

        String com = "";
        for(int i = 0; i<first.length(); i++) {
            if(i<sec.length()) {
                int x = i+1;
                if(first.substring(i, x).equals(sec.substring(i, x))) {
                    com+=first.substring(i, x);
                }
            }
        }

        if(com.equals("")) {
            System.out.print(first+ " and "+sec+" have no common prefix.");
        } else {
            System.out.print("The common prefix is: "+com);
        }
        
    }
}