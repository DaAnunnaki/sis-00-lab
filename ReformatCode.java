import java.io.*;
import java.util.Scanner;

public class ReformatCode {
    public static void main(String[] args) {
        String filename = args[1]; //gets the filename

        try {
            File inputFile = new File(filename);

            Scanner scan = new Scanner(inputFile);
            String str = "";
        } catch(Exception e) {
            str += scan.nextLine() + "\n";
            System.out.println("errorrrrr");
        }
        scan.close();

        while(Exception e)
    }

}

/*
 * (ReformatCode.java: Java Source Code Reformatter) Write a program that reformats Java source code from the next-line brace style to the end-of-line brace style. The program is invoked from the command line with the input Java source code file as args[0]. The original file is changed into the new format. The program makes no other changes the source code, including whitespace. For example, the following command converts the Java source code file Test.java to the end-of-line brace style.
java ReformatCode Test.java
Sample input file Test.java:
public class Test
{
public static void main(String[] args)
{
System.out.println("Test 1");
System.out.println("Test 2");
}
}
The above source code would be reformatted into the following code, which is then saved back into Test.java:
public class Test{
public static void main(String[] args){
System.out.println("Test 1");
System.out.println("Test 2");
}
}
 */