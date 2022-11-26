package lesson02;

import java.util.Scanner;

public class Attempt {
    public static void main(String[] args) {
        System.out.println("Угадайте цвет с 5 попыток");
        System.out.println("Для выхода из игры нажмите - exit");
        final int MAXX_ATTEMPT = 5;
        int attempt = 0;
        String color = "red";
        Scanner scanner = new Scanner(System.in);
        while (attempt<MAXX_ATTEMPT) {
            attempt++;
            System.out.println("Попытка " + attempt);
            String value = scanner.next();
            if (value.equals("exit")) {
                break;
            }
            if (!value.equals(color)) {
                continue;
            }
            System.out.println("Поздравляем, вы угадали цвет с " + attempt + " попытки");
            break;
        }

            System.out.println("Конец игры");
        scanner.close();
        }

    }

