package lesson08;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "�����";
        person1.age = 50;
        System.out.println("���� ����� " + person1.name + ","+" ��� " + person1.age + " ���");
        Person person2 = new Person();
        person2.name = "��������";
        person2.age = 42;
        System.out.println("���� ����� " + person2.name + ","+" ��� " + person2.age + " ����");
    }
}
    class Person{
        String name;
        int age;
    }


