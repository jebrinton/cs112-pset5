/**
 * GenerateSums.java
 *
 * A class with a method that can generate the sums of the first n natural
 * numbers.
 *
 * Computer Science 112, Boston University
 *
 * Jacob Brinton
 * jbrin@bu.edu
 */

public class GenerateSums {
    // creates a series of sums in String form and what they are equal to
    public static String generateSums(int n) {
        // initial setup
        int sum = 1;
        String sub = "1";
        String result = "1";
        // loop thru additional numbers
        for (int i = 2; i <= n; i++) {
            // appending the substring
            sub = sub + " + " + i;
            // adding to the sum
            sum = sum + i;
            // forming the result string and adding newline
            result = result + "\n" + sub + " = " + sum;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
