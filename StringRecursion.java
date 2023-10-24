public class StringRecursion {

    public static void printReverse(String str) {
        if (str != null && str.length() != 0) {
            System.out.print(str.charAt(str.length() - 1));
            printReverse(str.substring(0, str.length() - 1));
        }
    }

    public static String trim(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (str.equals("")) {
            return str;
        }

        if (str.charAt(0) == ' ') {
            return trim(str.substring(1));
        }
        else if (str.charAt(str.length() - 1) == ' ') {
            return trim(str.substring(0, str.length() - 1));
        }
        else {
            return str;
        }
    }
    public static void main(String[] args) {

    }
}
