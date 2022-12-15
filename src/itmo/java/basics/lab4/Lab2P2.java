package itmo.java.basics.lab4;
//"Напишите программу, которая считывает с клавиатуры длину массива (например, пользователь водит цифру 4), затем пользователь вводит 4 числа и на новой строке выводится массив из 4 элементов."

import java.util.Arrays;

import java.util.Scanner;

public class Lab2P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array lenght: ");
        int lenght = scanner.nextInt();
        int array[] = new int[lenght];
        System.out.println("Numbers of array: ");

        for (int i = 0; i < lenght; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(array));
    }
}

