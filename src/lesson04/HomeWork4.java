package lesson04;

import java.util.Scanner;
public class HomeWork4 {
    public static void main(String[] args) {
        for (int i = 0; ; i = i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("����� �����");
            double a = scanner.nextDouble();
            System.out.println("����� ������");
            String str = scanner.next();
            if (str.equals("q")) {
                System.out.println("Stop");
                break;
            }
        }
    }
}