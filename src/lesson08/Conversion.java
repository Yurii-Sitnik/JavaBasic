package lesson08;

import java.util.Scanner;

import static lesson08.Arithmetics.scanner;
public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в пункт обмена валют");
        System.out.println();
        System.out.println("Выберите валюту, которую вы хотите поменять: доллары (1), евро (2), рубли (3)");
        int currency = scanner.nextInt();
        switch (currency) {
            case 1:
                System.out.println("Вы выбрали доллар");
                USD();
                break;
            case 2:
                System.out.println("Вы выбрали евро");
                EUR();
                break;
            case 3:
                System.out.println("Вы выбрали рубль");
                RUB();
                break;
            default:
                System.out.println("Валюта не распознана");
        }
    }
    static void USD() {
        System.out.println("Если вы хотите: купить доллар - нажмите 1, продать доллар - нажмите любое число");
        int BuySell = scanner.nextInt();
        if (BuySell == 1) {
            System.out.println("Введите курс доллара");
            double ChangeRates = scanner.nextDouble();
            System.out.println("Введите сумму для обмена");
            double AmountOfMoney = scanner.nextDouble();
            System.out.println("Сумма Ваших наличных денег составляет " + AmountOfMoney / ChangeRates);
        } else {
            System.out.println("Введите курс доллара");
            double ChangeRates = scanner.nextDouble();
            System.out.println("Введите сумму для обмена");
            double AmountOfMoney = scanner.nextDouble();
            System.out.println("Сумма Ваших наличных денег составляет " + AmountOfMoney * ChangeRates);
        }
    }
    static void EUR() {
        System.out.println("Если вы хотите: купить евро - нажмите 1, продать евро - нажмите любое число");
        int BuySell = scanner.nextInt();
        if (BuySell == 1) {
            System.out.println("Введите курс евро");
            double ChangeRates = scanner.nextDouble();
            System.out.println("Введите сумму для обмена");
            double AmountOfMoney = scanner.nextDouble();
            System.out.println("Сумма Ваших наличных денег составляет " + AmountOfMoney / ChangeRates);
        } else {
            System.out.println("Введите курс евро");
            double ChangeRates = scanner.nextDouble();
            System.out.println("Введите сумму для обмена");
            double AmountOfMoney = scanner.nextDouble();
            System.out.println("Сумма Ваших наличных денег составляет " + AmountOfMoney * ChangeRates);
        }
    }
    static void RUB() {
        System.out.println("Если вы хотите: купить рубль - нажмите 1, продать рубль - нажмите любое число");
        int BuySell = scanner.nextInt();
        if (BuySell == 1) {
            System.out.println("Пункт обмена закрыт");
        } else {
            System.out.println("Дерево не меняем!!!");
        }
    }
}

