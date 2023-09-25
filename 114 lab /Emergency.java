import java.util.Scanner;

public class Emergency {
    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);

        System.out.println(emergency("Hello, my name is John Smith. I need to report a fire. Please come to 100 Circle Road.")); 
        // expecting "a fire at 100 Circle Road reported by John Smith"
        System.out.println(emergency("Hello, my name is Mary Smith. I need to report a car accident. Please come to 2635 Main Street.")); 
        // expecting "a car accident at 2635 Main Street reported by Mary Smith"
        System.out.println(emergency("Hello, my name is Joe Bell. I need to report a robbery. Please come to 3595 Oakwood Avenue."));
        // expecting "a robbery at 3595 Oakwood Avenue reported by Joe M Bell"

    }

    public static String emergency(String str) {

        int ind1 = str.indexOf("report" )+7; //47
        int ind2 = str.indexOf("Please")-2;
        String event = str.substring(ind1, ind2);

        int ind3 = str.indexOf("is")+3;
        int ind4 = str.indexOf("I")-2;
        String name = str.substring(ind3, ind4);

        int ind5 = str.indexOf("come")+8;
        String location = str.substring(ind5, str.length()-1);

        String it = event + " at " + location + " by " + name;

        return it;
    }
    
}

/*
 * Write a method emergency() that takes one parameter, call, which is a string that contains information about a 911 emergency call. The method’s purpose is to analyze the call (a String) and return a formatted string based on the information. You can assume that the String will be valid.
The unformatted string is always in the following format: Hello, my name is NAME. I need to report EVENT. Please come to WHERE.
• NAME: This part is the caller’s name.
• EVENT: This part describes the event called in. It may be one word (e.g. “theft”), or more than one word (e.g. “heart attack”, “a very serious collision”). You should handle both lowercase and uppercase letters in the event.
• WHERE: This part describes the place where the event happened. It has three parts: first it starts with (1) one or more digits that represent the number on the street, then followed by (2) a space, then followed by (3) some letter characters that represent the street (with possible spaces in between for the street name). An example of this is “127 East Main Street”.
As mentioned above, your method should take the unformatted string and format it in a specific way like described below. The all-capitalized parts are the parts you need to move around to match the following format:
EVENT at WHERE reported by NAME
Note: Please follow the format and do not include excessive elements or spaces.
Examples
System.out.println(emergency("Hello, my name is John Smith. I need to report a fire. Please come to 100 Circle Road.")); // expecting "a fire at 100 Circle Road reported by John Smith"
        
System.out.println(emergency("Hello, my name is Mary Smith. I need to report a car accident. Please come to 2635 Main Street.")); // expecting "a car accident at 2635 Main Street reported by Mary Smith"
        
System.out.println(emergency("Hello, my name is Joe Bell. I need to report a robbery. Please come to 3595 Oakwood Avenue.")); // expecting "a robbery at 3595 Oakwood Avenue reported by Joe M Bell"
 */