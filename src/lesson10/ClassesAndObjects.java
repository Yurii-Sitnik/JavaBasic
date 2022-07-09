package lesson10;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Роман",20);
        person1.name = "Роман";
        //person1.age = 50;
        String s1 = "Вова";
        Person person2 = new Person();
        person2.setNameAndAge(s1,30);
        person2.name = "Вова";
        //person2.age = 25;
        person1.speak();
        person2.speak();
    }
}
class Person {
    String name;
    int age;

    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++){ ;
        System.out.println("Меня зовут " + name + " мне " + age + " лет");}
    }
}
