public class StringRecursion {

    public static void printReverse(String str) {
        if (str != null && str.length() != 0) {
            System.out.print(str.charAt(str.length() - 1));
            printReverse(str.substring(0, str.length() - 1));
        }
    }
    public static void main(String[] args) {
        printReverse("Maki");
        printReverse("Ch i n a");
    }
}
