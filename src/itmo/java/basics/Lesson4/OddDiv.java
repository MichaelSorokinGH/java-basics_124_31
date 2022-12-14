package itmo.java.basics.Lesson4;
//"Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3 и на 5."
public class OddDiv {
    public static void main(String[] args) {

        System.out.println("Делится на 3: ");
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i +", ");
            }
        }
        System.out.println("Делится на 5: ");
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i +", ");
            }
        }
        System.out.println("Делится на 3 и на 5: ");
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i +", ");
            }
        }
    }
}
