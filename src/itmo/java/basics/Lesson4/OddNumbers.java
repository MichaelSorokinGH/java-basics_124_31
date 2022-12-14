package itmo.java.basics.Lesson4;
//"Напишите программу, которая выводит на консоль нечётные чмсла от 1 до 99".
public class OddNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

