package itmo.java.basics.Lesson4;
//"Напишите программу, что бы проверить, что массив содержит 1 или 3."
public class IncludeNumbers {
    public static void main(String[] args) {
        int[] ints = new int[]{2, 1, 6, 5, 7, 8, 10, 9};
        System.out.println(IncludeNumbers(ints));

    }
    public static String IncludeNumbers (int[] array) {
        for (int i = 0; i < 7; i++) {
            if (array[i] == 1 || array[i] == 3) {
                return "Include 1 or 3";
            }
        }
            return "Non include 1 or 3";
        }
    }


