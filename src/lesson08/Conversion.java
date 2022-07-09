package lesson08;

import java.util.Scanner;

import static lesson08.Arithmetics.scanner;
public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("����� ���������� � ����� ������ �����");
        System.out.println();
        System.out.println("�������� ������, ������� �� ������ ��������: ������� (1), ���� (2), ����� (3)");
        int currency = scanner.nextInt();
        switch (currency) {
            case 1:
                System.out.println("�� ������� ������");
                USD();
                break;
            case 2:
                System.out.println("�� ������� ����");
                EUR();
                break;
            case 3:
                System.out.println("�� ������� �����");
                RUB();
                break;
            default:
                System.out.println("������ �� ����������");
        }
    }
    static void USD() {
        System.out.println("���� �� ������: ������ ������ - ������� 1, ������� ������ - ������� ����� �����");
        int BuySell = scanner.nextInt();
        if (BuySell == 1) {
            System.out.println("������� ���� �������");
            double ChangeRates = scanner.nextDouble();
            System.out.println("������� ����� ��� ������");
            double AmountOfMoney = scanner.nextDouble();
            System.out.println("����� ����� �������� ����� ���������� " + AmountOfMoney / ChangeRates);
        } else {
            System.out.println("������� ���� �������");
            double ChangeRates = scanner.nextDouble();
            System.out.println("������� ����� ��� ������");
            double AmountOfMoney = scanner.nextDouble();
            System.out.println("����� ����� �������� ����� ���������� " + AmountOfMoney * ChangeRates);
        }
    }
    static void EUR() {
        System.out.println("���� �� ������: ������ ���� - ������� 1, ������� ���� - ������� ����� �����");
        int BuySell = scanner.nextInt();
        if (BuySell == 1) {
            System.out.println("������� ���� ����");
            double ChangeRates = scanner.nextDouble();
            System.out.println("������� ����� ��� ������");
            double AmountOfMoney = scanner.nextDouble();
            System.out.println("����� ����� �������� ����� ���������� " + AmountOfMoney / ChangeRates);
        } else {
            System.out.println("������� ���� ����");
            double ChangeRates = scanner.nextDouble();
            System.out.println("������� ����� ��� ������");
            double AmountOfMoney = scanner.nextDouble();
            System.out.println("����� ����� �������� ����� ���������� " + AmountOfMoney * ChangeRates);
        }
    }
    static void RUB() {
        System.out.println("���� �� ������: ������ ����� - ������� 1, ������� ����� - ������� ����� �����");
        int BuySell = scanner.nextInt();
        if (BuySell == 1) {
            System.out.println("����� ������ ������");
        } else {
            System.out.println("������ �� ������!!!");
        }
    }
}

