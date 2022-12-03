package itmo.java.basics.Lesson3;

public class Car {
    private String color;
    private String name;
    private Integer weight;

    public Car(String color, String name, Integer weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void kharacteristics() {
        System.out.println("Цвет - " + color);
        System.out.println("Название - " + name);
        System.out.println("Вес - " + weight);
    }

    public static void main(String[] args) {
        Car car1 = new Car("White");
        Car car2 = new Car("White", 500);
        car1.kharacteristics();
        car2.kharacteristics();
    }
}
