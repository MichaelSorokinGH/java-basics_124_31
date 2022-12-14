package itmo.java.basics.Lesson4;
//"Напишите программу, что бы вычислить сумму двух целых чисел и вернуть тру, если сумма равна третьему числу."

import java.util.Scanner;

public class IntSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int number3 = scanner.nextInt();

        if (number1 + number2 == number3) {
            System.out.println("Результат: true");
        } else {
            System.err.println("False");
        }
    }
}


