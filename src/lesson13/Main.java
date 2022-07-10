package lesson13;

import lesson13.model.Bet;
import lesson13.storage.DataBase;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("������� �������� ������ � ���� ����� ������");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] bet = string.split(" ");
        int value = Integer.parseInt(bet[0]);
        double risk = Double.parseDouble(bet[1]);

        Bet user1Bet = new Bet(value, risk);
        DataBase.bets[0]=user1Bet;

        user1Bet.setValue(value);
        user1Bet.setRisk(risk);

        int valueToReturn = user1Bet.getValue();
        double riskToReturn = user1Bet.getRisk();

        System.out.println("������ " + valueToReturn);
        System.out.println("���� " + riskToReturn);
        System.out.println("������� bets storage");
        System.out.println(Arrays.toString(DataBase.bets));
    }
}

