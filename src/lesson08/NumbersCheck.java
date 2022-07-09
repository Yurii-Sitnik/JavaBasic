package lesson08;

import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int a = scanner.nextInt();
        Method(a);
    }
    private static void Method(int a) {
        int[] arr = {2, 3, 5, 6, 9};

        if (a > 0)
            System.out.println("данное число положительное");
        else {
            System.out.println("данное число отрицательное");
        }

        for (int j : arr)
            if (a % j == 0)
                System.out.println("„исло делитс€ на " + j);
            else
                System.out.println("„исло не делитс€ на " + j);
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println("Ёто не простое число");
                return;
            }
        }
        System.out.println("Ёто простое число");
    }
}






