package lesson02;

import java.util.Scanner;
public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double a = getDuble();
        double b = getDuble();
        char operation = getOperation();
        double result = calc(a, b, operation);
        System.out.println("Результат: " + result);
    }
    public static double getDuble() {
        System.out.println("Введите число:");
        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Ошибка при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getDuble();
        }
        return num;
    }
    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка ввода. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
    public static double calc(double a, double b, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(a, b, getOperation());
        }        return result;
    }
}
/* Метод next() может читать ввод только до пробела.  Он не может прочитать два слова, разделенных пробелом.
Кроме того, next() после прочтения ввода курсор помещается в ту же строку.
Метод nextLine() читает ввод, включая пробелы между словами (то есть читает до конца строки \n ).
После считывания ввода помещает nextLine() курсор в следующую строку.*/