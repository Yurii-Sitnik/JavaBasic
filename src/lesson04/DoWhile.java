package lesson04;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("����� 5");
            value = scanner.nextInt();
        }while (value!=5);
        System.out.println( "�� ����� 5");
    }
}
