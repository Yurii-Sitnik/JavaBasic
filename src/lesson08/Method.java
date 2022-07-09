package lesson08;

public class Method {

    public static void main(String[] args) {
        int a = 5;
        addition(a);
    }

    static void addition(int a) {
        a = a++;
        System.out.println(a);
    }
}