package lesson09;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.seyHello();
        person1.name = "�����";
        person1.age = 50;
        Person person2 = new Person();
        person2.name = "��������";
        person2.age = 42;
        person2.speak();
        person2.seyHello();
    }
}
class Person {
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("���� ����� " + name + ", ��� " + age + " ����");
        }
    }
    void seyHello() {
        System.out.println("������ !");
    }
    }



