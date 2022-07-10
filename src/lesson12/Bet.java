package lesson12;
import java.util.Scanner;

class Bet {
    private int value;
    private double risk;

    public Bet(int value, double risk) {
        this.value = value;
        this.risk = risk;
    }

    public double getRisk() {
        return risk;
    }

    public void setRisk(double risk) {
        this.risk = risk;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {

        System.out.println("Enter the bet value and risk separated by a space");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] bet = string.split(" ");
        int value = Integer.parseInt(bet[0]);
        double risk = Double.parseDouble(bet[1]);

        Bet bet1 = new Bet(value, risk);
        bet1.setValue(value);
        bet1.setRisk(risk);

        int valueToReturn = bet1.getValue();
        double riskToReturn = bet1.getRisk();

        System.out.println("Value " + valueToReturn);
        System.out.println("Risk " + riskToReturn);
    }
}