package edu.ucr.cs.cs167.group19;

import edu.ucr.cs.cs167.group19.IsEven;
import edu.ucr.cs.cs167.group19.IsDivisibleByThree;

import java.util.function.Function;

public class App {
    // Sử dụng cách tạo hàm truyền thống
//    public static void printEvenNumbers(int from, int to) {
//        System.out.printf("Printing numbers in the range [%d,%d]\n", from, to);
//        for (int i = from; i <= to; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//    }
//    public static void printNumbersDivisibleByThree(int from, int to) {
//        System.out.printf("Printing numbers in the range [%d,%d]\n", from, to);
//        for (int i = from; i <= to; i++) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//        }
//    }
//    public static void main(String[] args) {
//        if (args.length < 3) {
//            System.out.println("Error: At least three parameters expected, from, to, and base.");
//            return;
//        }
//        int from = Integer.parseInt(args[0]);
//        int to = Integer.parseInt(args[1]);
//        int base = Integer.parseInt(args[2]);
//
//        if (base == 2) {
//            printEvenNumbers(from, to);
//        } else if (base == 3) {
//            printNumbersDivisibleByThree(from, to);
//        } else {
//            System.out.println("Unsupported base value. Use 2 or 3.");
//        }
//    }

    // Sử dụng cách tạo hàm chức năng
    public static void printNumbers(int from, int to, Function<Integer, Boolean> filter) {
        System.out.printf("Printing numbers in the range [%d,%d]\n", from, to);
        for (int i = from; i <= to; i++) {
            if (filter.apply(i)) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Error: At least three parameters expected, from, to, and base.");
            return;
        }

        int from = Integer.parseInt(args[0]);
        int to = Integer.parseInt(args[1]);
        int base = Integer.parseInt(args[2]);
        Function<Integer, Boolean> filter;

        if (base == 2) {
            filter = new IsEven();
        } else if (base == 3) {
            filter = new IsDivisibleByThree();
        } else {
            System.out.println("Unsupported base value. Use 2 or 3.");
            return;
        }

        printNumbers(from, to, filter);
    }
}
