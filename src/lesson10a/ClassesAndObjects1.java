package lesson10a;

public class ClassesAndObjects1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Имя");
        person1.setAge(15);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge());
    }
}
class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Ты ввел пустое имя");
        } else {
            name = userName;
        }
    }
    public String getName() {
        return name;
    }
    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Возраст должен быть положительным");
        } else {
            age = userAge;
        }
    }
    public int getAge() {
        return age;
    }
    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + " мне " + age + " лет");
        }
    }
}


