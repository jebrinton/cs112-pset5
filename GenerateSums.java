public class GenerateSums {
    public static String generateSums(int n) {
        int sum = 1;
        String sub = "1";
        String result = "1";
        for (int i = 2; i <= n; i++) {
            sub = sub + " + " + i;
            sum = sum + i;
            result = result + "\n" + sub + " = " + sum;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print(1 / 2);
//        for (int i = 0; i < 10; i++) {
//            System.out.println();
//            System.out.println(generateSums(i));
//        }
//        System.out.print(generateSums(2));
    }
}
