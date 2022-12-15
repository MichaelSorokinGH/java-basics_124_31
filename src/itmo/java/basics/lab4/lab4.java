package itmo.java.basics.lab4;

import java.util.Scanner;

//"Напишите программу, котора принимает три целых числа и возвращает тру, если второе число больше первого, а третье больше второго."
public class lab4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int number3 = scanner.nextInt();

        if (number2 > number1 && number3 > number2) {
            System.out.println("Результат: true");
        } else {
            System.err.println("False");
        }
    }
}

