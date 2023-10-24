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
    public static void main(String[] args) {
        System.out.println(search(3, new int[]{4, 1, 3, 9}, 0));
        System.out.println(search(3, new int[]{}, 0));
        System.out.println(search(7, new int[]{7, 7, 7, 7, 7}, 0));
        System.out.println(search(7, new int[]{7, 9, 3, 0}, 1));
        System.out.println(search(7, null, 1));
    }
}
