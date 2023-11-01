public class Scratchpad {
    public static void main(String[] args) {
//        System.out.println("minithing before");
//        for (int i = 0; i < 29; i++) {
//            System.out.println("i is " + i);
//
//        }
        for (int i = 0; i < 18; i++) {
            System.out.print("i=" + i + ": " + loop4(i));
            if (i > 0) {
                System.out.println("\t  \t\t" +
                        ((loop4(i + 1) - loop4(i)) -
                                (loop4(i) - loop4(i - 1))));
            } else {
                System.out.println();
            }
            System.out.println("\t\t  " + (loop4(i + 1) - loop4(i)));
        }
    }

    public static void printLoop(int min, int max) {
        for (int i = 0; i < 11; i++) {
            System.out.print("i=" + i + ": " + loop(i));
            if (i > 0) {
                System.out.println("\t  \t\t" +
                        ((loop(i + 1) - loop(i)) -
                                (loop(i) - loop(i - 1))));
            } else {
                System.out.println();
            }
            System.out.println("\t\t  " + (loop(i + 1) - loop(i)));

        }
    }

    public static int loop(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
//            System.out.println("\ni is " + i);
            for (int j = 0; j < n; j++) {
//                System.out.println(j);
                for (int k = 0; k < j; k++) {
//                    System.out.print(k);
                    sum++;
                }
            }
        }
        return sum;
    }

    public static int loop2(int n) {
        int sum = 0;
        for (int i = n; i > 0; i/=2) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 1000; k++) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public static int loop3(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2*n; j++) {
                for (int k = n; k >= 1; k = k/2) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public static int loop4(int n) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < j; k++) {
                    sum++;
                }
            }
        }
        return sum;
    }

}
