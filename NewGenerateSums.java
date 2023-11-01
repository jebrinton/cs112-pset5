public class NewGenerateSums {
    public static void generateSums(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                sum = sum + j; // how many times is this executed?
                counter++;
            }
//            System.out.println(sum);
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print("i is " + i + ": ");
            generateSums(i);
        }
    }
}
