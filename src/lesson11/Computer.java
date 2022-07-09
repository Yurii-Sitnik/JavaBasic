package lesson11;

public class Computer {

    public static void main(String[] args) {
        String[] Computers = new String[5];
        Computers[0] = "Компьютер Елены";
        Computers[1] = "Компьютер Сергея";
        Computers[2] = "Компьютер Дениса";
        Computers[3] = "Компьютер Юрия";
        Computers[4] = "Компьютер Николая";

        for (int i = 0; i < Computers.length; i++) {
            System.out.println(Computers[i]);
        }
    }
}


