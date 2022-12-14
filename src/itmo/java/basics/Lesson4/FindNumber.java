package itmo.java.basics.Lesson4;
//"Найдите первое уникальное число 3."
public class FindNumber {
    public static void find(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean number = true;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    number = false;
                    break;
                }
            }
            if (number) {
                System.out.println(array[i] + " ");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 4};
        find(array);
    }
}




