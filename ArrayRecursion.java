import java.util.Objects;

public class ArrayRecursion {
    public static boolean search(Object item, Object[] arr, int start) {
        if (arr == null) {
            throw new IllegalArgumentException();
        }
        if (start < 0 || start > arr.length) {
            throw new IllegalArgumentException();
        }
        // case for never found item in array
        if (start == arr.length) {
            return false;
        }

        if (Objects.equals(item, arr[start])) {
            return true;
        }
        else {
            return search(item, arr, start+1);
        }
    }

    public static String reverseArrayToString(Object[] arr, int index) {
        if (arr == null) {
            return "";
        }
        if (index < 0) {
            throw new IllegalArgumentException(
                    "Negative index input not allowed");
        }

        if (index == arr.length) {
            return "[";
        }
        else if (index == 0) {
            return reverseArrayToString(arr, 1) + arr[0] + "]";
        }
        else {
            return reverseArrayToString(arr, index+1) + arr[index] + ", ";
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseArrayToString(new String[]{"first", "second", "third", "fourth"}, -4));
//        System.out.println(reverseArrayToString(new Integer[]{4, 3, 90, 1991}, 0));
//        System.out.println(reverseArrayToString(new Sudoku[]{new Sudoku(), new Sudoku(), new Sudoku()}, 0));
//        System.out.print("|" + reverseArrayToString(new String[]{"     ", " "}, 0) + "|");
    }
}
