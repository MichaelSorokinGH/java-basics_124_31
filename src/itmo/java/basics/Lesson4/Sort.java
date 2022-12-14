package itmo.java.basics.Lesson4;
//"Программа, проверяющая отсортирован ли массив по возрастанию."
import java.util.Scanner;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        System.out.println("Введите 5 целых чисел");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();

        int[] numbers = {number1, number2, number3, number4, number5};

        for (int i = 0; i < numbers.length; i++) {
            if (i + 1 == numbers.length) {
                System.out.println("OK");

            } else if (numbers[i] > numbers[i + 1]) {
                System.out.println("Please, try again");
                break;
            }
        }
    }
}


