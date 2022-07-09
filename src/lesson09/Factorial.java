package lesson09;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("¬ведите число дл€ вычислени€ факториала");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        factorial(n);
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);

        }
    }
}
