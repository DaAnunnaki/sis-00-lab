import java.util.Random;

public class RandomString {
    public static void main(String[] args) {

    }

    public static String randomString(int len, char ulCase) {
        //String str = RandomStringUtils.random(len, useLetters, useNumbers);;
        if(ulCase=='u') {
            str.toUpperCase();
        } else str.toLowerCase();
        return str;
    }
}

/*
 * Write down a complete program to generate random string. It should call a method randomString().  
 * The method should accept an integer parameter ‘len’ and a character parameter ‘ulCase’ from the user 
 * as its arguments in the parameter list.  
 * 
 * The integer parameter ‘len’ will be used by the randomString() method to generate a string of length ‘len’, 
 * whereas, the parameter ‘case’ will determine whether the generated string is uppercase or lowercase. 
 * If ulCase’ = ‘u’ generate random uppercase string. If case = ‘l’ generate a lowercase random string. 
 * Please use the appropriate method signature.  
 */