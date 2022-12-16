package itmo.java.basics.lab6;

import java.util.Scanner;

public class MainAge {
    int age;
    Scanner scanner = new Scanner(System.in);

    public void Info() {
        System.out.println("Введите возраст пользователя: ");
        this.age = scanner.nextInt();
        System.out.println("Возраст пользователя: " + age);
    }
}
