package lesson05;

public class Lesson5 {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        test1(a, b);
        test2(a, b);
        test3(a, b);
        test4(a, b);
        test5(a, b);
        test6(a, b);
        test7(a, b);
        test8(a, b);
    }
    private static void test1(boolean a, boolean b) {
        //!A & !B=!(A | B)
        System.out.println(!a & !b);
        System.out.println(!(a | b));
    }
    private static void test2(boolean a, boolean b) {
        //!A & B = !(A | !B)
        System.out.println(!a & b);
        System.out.println(!(a | !b));
    }
    private static void test3(boolean a, boolean b) {
        //A & !B = !(!A | B)
        System.out.println(a & !b);
        System.out.println(!(!a | b));
    }
    private static void test4(boolean a, boolean b) {
        //A & B = !(!A | !B)
        System.out.println(a & b);
        System.out.println(!(!a | !b));
    }
    private static void test5(boolean a, boolean b) {
        //!A | !B = !(A & B)
        System.out.println(!a | !b);
        System.out.println(!(a & b));
    }
    private static void test6(boolean a, boolean b) {
        //!A | B = !(A & !B)
        System.out.println(!a | b);
        System.out.println(!(a & !b));
    }

    private static void test7(boolean a, boolean b) {
        //A | !B = !(!A & B)
        System.out.println(a | !b);
        System.out.println(!(!a & b));
    }

    private static void test8(boolean a, boolean b) {
        //A | B = !(!A & !B)
        System.out.println(a | b);
        System.out.println(!(!a & !b));
    }
}


