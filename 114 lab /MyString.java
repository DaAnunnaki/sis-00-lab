// public class MyString {
    
// }

public class MyString {
    private char[] chars;

    public MyString(char[] chars) {
        this.chars = chars.clone();
    }

    public char charAt(int index) {
        if (index >= 0 && index < chars.length) {
            return chars[index];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public int length() {
        return chars.length;
    }

    public MyString substring(int begin, int end) {
        if (begin >= 0 && begin < end && end <= chars.length) {
            char[] subChars = new char[end - begin];
            for (int i = begin, j = 0; i < end; i++, j++) {
                subChars[j] = chars[i];
            }
            return new MyString(subChars);
        } else {
            throw new IndexOutOfBoundsException("Invalid substring indices");
        }
    }

    public MyString toLowerCase() {
        char[] lowerChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                lowerChars[i] = Character.toLowerCase(chars[i]);
            } else {
                lowerChars[i] = chars[i];
            }
        }
        return new MyString(lowerChars);
    }

    public boolean equals(MyString s) {
        if (s == null || s.length() != chars.length) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static MyString valueOf(int i) {
        String intStr = Integer.toString(i);
        char[] intChars = intStr.toCharArray();
        return new MyString(intChars);
    }

    public MyString[] split(MyString s) { // okay yeah basically use loops to get each individual chars
        String originalStr = new String(chars);
        String delimiter = new String(s.chars);
        String[] parts = originalStr.split(delimiter);

        MyString[] result = new MyString[parts.length];
        for (int i = 0; i < parts.length; i++) {
            result[i] = new MyString(parts[i].toCharArray());
        }

        return result;
    }

    public static void main(String[] args) {
        char[] chars = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};

        MyString test = new MyString(chars);
        //System.out.println("tester one: " +test.toString());
        System.out.println("index 0: " +test.charAt(0));
        System.out.println("index 4: " + test.charAt(4));
        System.out.println(test.substring(2,6));
    }
}

/*
 * 1. (MyString.java and MyString.jpg) As you know, the String class is provided in the Java library. Provide your own UML diagram in iDraw or Violet, and implementation for the class (name the new class MyString) with a char[] for storing the chars and the following methods:
public MyString(char[] chars)
public char charAt(int index)
public int length()
public MyString substring(int begin, int end)
public MyString toLowerCase()
public boolean equals(MyString s)
public static MyString valueOf(int i)
public MyString[] split(MyString s)
Note: do not use the methods with the same name from the Java String API, but implement them using the char[] array storing the chars of the string. 
Optional: implement other String methods, like match with regular expressions.
 */