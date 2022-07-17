public class Polimorfizm {
    class A {
        void music() {
            System.out.println("Rok");
        }

        void music(int a) {
            System.out.println("Disco");
        }
//статический полиморфизм

        class B extends A {
            @Override
            void music() {
                System.out.println("Jaz");
            }
//Классический полиморфизм
        }
    }
}



