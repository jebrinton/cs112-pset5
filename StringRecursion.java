import javax.swing.text.html.StyleSheet;

public class StringRecursion {

    public static void printReverse(String str) {
        if (str != null && str.length() > 0) {
            System.out.print(str.charAt(str.length() - 1));
            printReverse(str.substring(0, str.length() - 1));
        }

        // doesn't print anything if null or ""
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

    public static int indexOf(char ch, String str) {
        return find(ch, str);
    }

    public static void main(String[] args) {
//        System.out.println(indexOf('c', null));
//        printReverse(null);
//        System.out.println(indexOf(' ', null));
//        System.out.println(find('a', null));
//        System.out.print(weave("1", "str2"));
//        System.out.print("|" + trim("       sw d d fkj ds p p p p   " + "     dskjf null   ") + "|");
//        System.out.print("\n|" + weave("train", "           ") + "|");
        System.out.println(find('a', "asdf"));
        System.out.println(find('s', "asdf"));
        System.out.println(find('d', "asdf"));
        System.out.println(find('f', "asdf"));
        System.out.println(find('j', "asdf"));

        System.out.println(find('m', "maki"));
        System.out.println(find('m', "amki"));

        System.out.println(find('z', "_________"));

    }
}
