package lesson08;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� 1");
        int a = scanner.nextInt();
        System.out.println("������� ����� 2");
        int b = scanner.nextInt();
        System.out.println("������� ����� 3");
        int c = scanner.nextInt();
        calculate(a, b, c);
    }
    static void calculate(int a, int b, int c) {
        double sum = (double)(a + b + c)/3;
        System.out.println("������� �������������� 3-� ����� = " + sum);
        }
    }

