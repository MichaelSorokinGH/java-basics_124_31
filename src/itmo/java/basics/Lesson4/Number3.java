package itmo.java.basics.Lesson4;
//"Напишите программу, чтобы проверить, появляется ли 3 как перый и последний элемент массива."
import java.util.Arrays;

public class Number3 {

    public static void search (int [] a) {
        System.out.println(Arrays.toString(a));
        boolean b = a[0] == 3 || a[a.length-1] == 3;
        System.out.println(b);
    }

    public static void main(String[] args) {
        int[] a = {3, -3, 7, 4, 5, 4, 3};
        search(a);
    }
}


