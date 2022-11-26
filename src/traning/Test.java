package traning;

public class Test {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        a = ++a + b++ + a++;   //7+4+7=18
        //int c = a--;

        System.out.printf( "a= " + a + " b= " + b);

    }
}
