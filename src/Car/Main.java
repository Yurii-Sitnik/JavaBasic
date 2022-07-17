package Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(5);
        Car car2 = new Car(5, 110.3);
        Car car3 = new Car(6, 120.6, 1800);
        Car car4 = new Car(7, 230.2, 1500, "Красный");
        car4.setAge(10);
        car4.setSpeed(126);
        car4.setWeight(5000);
        car4.setColor("yellow");

        System.out.println(car4);


    }
}
