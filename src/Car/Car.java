package Car;

public class Car {
    private int age;
    private double speed;
    private int weight;
    private String color;

    public int getAge() {
        return age;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSpeed(double speed){
        this.speed=speed;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setColor(String color){
        this.color=color;
    }

    public Car() {
      //  Конструктор по умолчанию

    }

    public Car(int age) {
        this.age = age;

    }

    public Car(int age, double speed) {
        this.age = age;
        this.speed = speed;

    }

    public Car(int age, double speed, int weight) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
          }

    public Car(int age, double speed, int weight, String color) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
           }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}