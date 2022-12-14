package itmo.java.basics.lab4;
//"Сортировка слиянием."

import java.util.Arrays;

public class Lab2P5 {
    public static void main(String[] args) {
        int[] ints = {24, 67, 43, 12, 78, 76, 36, 15, 91, 10};
        int[] array = bubbleSortedArrays(ints);
        System.out.println(Arrays.toString(array));
    }

    private static int[] bubbleSortedArrays(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int aj = array[j];
                    int ai = array[i];
                    array[j] = ai;
                    array[i] = aj;
                }
            }
        }
        return array;
    }

    public static int[] mergeSort(int[] array) {
        System.out.println(Arrays.toString(array));

        if (array.length < 2) {
            return array;
        }

        int mid = array.length / 2;

        int[] left = new int[mid];

        int[] right;

        if (array.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }

        for (int j = 0; j < right.length; j++) {
            right[j] = array[mid + j];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return mergeParts(left, right);


    }

    public static int[] mergeParts(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] > right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer++] = result[rightPointer++];
            }
        }

        return result;
    }
}
