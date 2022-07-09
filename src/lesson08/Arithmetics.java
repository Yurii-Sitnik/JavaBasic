package lesson08;
import java.util.Scanner;

public class Arithmetics {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите операнд 1");
        int a = scanner.nextInt();
        System.out.println("Введите операнд 2");
        int b = scanner.nextInt();
        System.out.println("Введите операцию");
        char operation = scanner.next().charAt(0);
        switch (operation) {
            case '+':
                add(a, b);
                break;
            case '-':
                sub(a, b);
                break;
            case '*':
                mul(a, b);
                break;
            case '/':
                div(a, b);
                break;
            default:
                System.out.println("Операция не распознана");
        }
    }
    static void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }
    static void sub(int a, int b) {
        int c = a - b;
        System.out.println(c);
    }
    static void mul(int a, int b) {
        int c = a * b;
        System.out.println(c);
    }
    static void div(int a, int b) {
        if (b == 0)
            System.out.println("На ноль делить нельзя");
        else {
            double c = (double) a / b;
            System.out.println(c);
        }
    }
}

