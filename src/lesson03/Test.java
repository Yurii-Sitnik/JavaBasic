package lesson03;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введіть текст, ціле то дробове число");
        int var1 = scan.nextInt();
        double var2 = scan.nextDouble();
        String text = scan.nextLine();
        System.out.printf("%2$s", var2, var1, text);
    }
}
