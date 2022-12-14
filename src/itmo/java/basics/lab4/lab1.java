package itmo.java.basics.lab4;
//"Напишите программу, которая выводит на консоль нечётные чмсла от 1 до 99".
public class lab1 {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                    System.out.println(i);
            }
        }
    }
}

