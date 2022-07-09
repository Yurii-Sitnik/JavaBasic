package lesson05;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬веди возраст");
        String age = scanner.nextLine();
        scanner.close();
        switch (age) {
            case "ноль":
                System.out.println("ты родилс€");
                break;
            case "семь":
                System.out.println("ты пошел в школу");
                break;
            case "семьнадцать":
                System.out.println("ты закончил школу");
                break;
            default:
                System.out.println("ни один из указанных случаев");
        }
    }
}
