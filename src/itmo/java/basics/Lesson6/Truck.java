package itmo.java.basics.Lesson6;

import java.util.Scanner;

public class Truck extends Car {
    int sumOfWheels;
    int maxWeight;

    public void newWheels() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Новое количество колёс: ");
        sumOfWheels = scanner.nextInt();
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Количество колёс: " + sumOfWheels);
        System.out.println("Максимальный вес: " + maxWeight);
    }

    public Truck(int w, String m, char c, float s, int sumOfWheels, int maxWeight) {
        super(w, m, c, s);
        this.sumOfWheels = sumOfWheels;
        this.maxWeight = maxWeight;
    }
}

