public class Animal {
    String name;
    int age;
    public Animal() {
        System.out.println("Привет от кота, мяу");
    }
    public Animal(String name) {
        this.name = name;
        System.out.println("Привет от собаки, гав");
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Привет от дельфина, ф-рр");
    }
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Barsik");
        Animal animal3 = new Animal("Dolly", 8);
    }
}


