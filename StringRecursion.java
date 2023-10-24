public class StringRecursion {

    public static void printReverse(String str) {
        if (str != null && str.length() != 0) {
            System.out.print(str.charAt(str.length() - 1));
            printReverse(str.substring(0, str.length() - 1));
        }
    }

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

    public static int find(char ch, String str) {
        if (str == null) {
            return -1;
        }
        if (str.equals("")) {
            return -1;
        }

        if (str.charAt(0) == ch) {
            return 0;
        }
        else {
            return 1 + find(ch, str.substring(1));
        }
    }

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

    public static void main(String[] args) {
        System.out.println("|" + weave("roma", "    ") + "|");
    }
}
