package lesson03;

public class StringFormat {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 8;
        System.out.printf("This number %1$s \n",a);
        System.out.printf("This numbers %1$s and %2$s \n", a, b);
        System.out.printf("%1$+022.10f",Math.PI);
    }
}
