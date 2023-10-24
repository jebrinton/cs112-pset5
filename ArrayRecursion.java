public class ArrayRecursion {
    public static boolean search(int item, int[] arr, int start) {
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

        if (item == arr[start]) {
            return true;
        }
        else {
            return search(item, arr, start+1);
        }
    }

    public static String reverseArrayToString(String[] arr, int index) {
        if (arr == null) {
            return "";
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
        System.out.println(reverseArrayToString(new String[]{"you", "testing", "am", "I"}, 0));
    }
}
