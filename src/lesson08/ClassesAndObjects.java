package lesson08;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        System.out.println("Меня зовут " + person1.name + ","+" мне " + person1.age + " лет");
        Person person2 = new Person();
        person2.name = "Владимир";
        person2.age = 42;
        System.out.println("Меня зовут " + person2.name + ","+" мне " + person2.age + " года");
    }
}
    class Person{
        String name;
        int age;
    }


