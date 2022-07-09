package lesson04;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите какое - нибудь число");
        int x = scanner.nextInt();
        System.out.println("Вы ввели "+x);
    }
}
