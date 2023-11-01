/**
 * ArrayRecursion.java
 *
 * A class of various recursive methods that operate on arrays.
 *
 * Computer Science 112, Boston University
 *
 * Jacob Brinton
 * jbrin@bu.edu
 */

public class ArrayRecursion {
    // searches for an Object, item, in an Object array
    public static boolean search(Object item, Object[] arr, int start) {
        if (arr == null || item == null) {
            throw new IllegalArgumentException();
        }
        if (start < 0 || start > arr.length) {
            throw new IllegalArgumentException();
        }
        // case for never found item in array
        if (start == arr.length) {
            return false;
        }

        if (item.equals(arr[start])) {
            return true;
        }
        else {
            return search(item, arr, start+1);
        }
    }

    // reverses an array and prints the remaining contents as a String
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
            return reverseArrayToString(arr, index+1)
                    + arr[index] + ", ";
        }
    }

    public static void main(String[] args) {

    }
}
