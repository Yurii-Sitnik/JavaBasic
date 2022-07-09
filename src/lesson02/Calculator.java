package lesson02;

import java.util.Scanner;
public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double a = getDuble();
        double b = getDuble();
        char operation = getOperation();
        double result = calc(a, b, operation);
        System.out.println("���������: " + result);
    }
    public static double getDuble() {
        System.out.println("������� �����:");
        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("������ ��� ����� �����. ���������� ��� ���.");
            scanner.next();
            num = getDuble();
        }
        return num;
    }
    public static char getOperation() {
        System.out.println("������� ��������:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("������ �����. ���������� ��� ���.");
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
                System.out.println("�������� �� ����������. ��������� ����.");
                result = calc(a, b, getOperation());
        }        return result;
    }
}
/* ����� next() ����� ������ ���� ������ �� �������.  �� �� ����� ��������� ��� �����, ����������� ��������.
����� ����, next() ����� ��������� ����� ������ ���������� � �� �� ������.
����� nextLine() ������ ����, ������� ������� ����� ������� (�� ���� ������ �� ����� ������ \n ).
����� ���������� ����� �������� nextLine() ������ � ��������� ������.*/