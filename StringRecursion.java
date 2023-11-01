/**
 * StringRecursion.java
 *
 * A class with various recursive methods that act on strings.
 *
 * Computer Science 112, Boston University
 *
 * Jacob Brinton
 * jbrin@bu.edu
 */

public class StringRecursion {
    // prints a String in reverse character order
    public static void printReverse(String str) {
        if (str != null && str.length() > 0) {
            System.out.print(str.charAt(str.length() - 1));
            printReverse(str.substring(0, str.length() - 1));
        }

        // doesn't print anything if null or empty String
    }

    // returns a String with whitespace before or after
    public static String trim(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("")) {
            return str;
        }

        if (str.charAt(0) == ' ') {
            return trim(str.substring(1));
        }
        if (str.charAt(str.length() - 1) == ' ') {
            return trim(str.substring(0, str.length() - 1));
        }
        else {
            return str;
        }
    }

    // returns the first index of a char ch in String str
    public static int find(char ch, String str) {
        if (str == null) {
            return -1;
        }
        if (str.equals("")) {
            return -1;
        }

        if (ch == str.charAt(0)) {
            return 0;
        }
        else {
            if (find(ch, str.substring(1)) == -1) {
                return -1;
            }
            else {
                return 1 + find(ch, str.substring(1));
            }
        }
    }

    // creates a new String formed by taking the characters in alternating
    // order from str1 and str2. str1's first character goes first,
    // str2's first character goes second, then str1's second character,
    // and so on
    public static String weave(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException();
        }
        if (str1.equals("")) {
            return str2;
        }
        else if (str2.equals("")) {
            return str1;
        }

        return "" + str1.charAt(0) + str2.charAt(0) +
                weave(str1.substring(1), str2.substring(1));
    }

    // equivalent to find method
    public static int indexOf(char ch, String str) {
        return find(ch, str);
    }

    public static void main(String[] args) {

    }
}
