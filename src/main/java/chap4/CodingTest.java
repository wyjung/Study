package chap4;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wyjung on 2017. 3. 21..
 */
public class CodingTest {

    public static void mergeSort(int[] numbers, int left, int right) {
        int mid;

        if (left < right) {
            mid = (left + right) / 2;

            mergeSort(numbers, left, mid);
            mergeSort(numbers, mid + 1, right);

            merge(numbers, left, mid, right);
        }
    }

    private static void merge(int[] numbers, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (numbers[i] < numbers[j]) {
                temp[k] = numbers[i];
                i++;
            } else {
                temp[k] = numbers[j];
                j++;
            }
            k++;
        }

        if (i > mid) {
            for (int l = j; l <= right; l++) {
                temp[k] = numbers[l];
                k++;
            }
        } else {
            for (int l = i; l <= mid; l++) {
                temp[k] = numbers[l];
                k++;
            }
        }

        k = 0;
        for (int l = left; l <= right; l++) {
            numbers[l] = temp[k];
            k++;
        }

    }

    public static void quickSort(int[] numbers, int left, int right) {
        int i, j, pivot;

        if (left < right) {
            i = left;
            j = right;
            pivot = numbers[left];

            while (i < j) {
                while (numbers[j] > pivot) j--;
                while (i < j && numbers[i] <= pivot) i++;

                swap(numbers, i, j);
            }

            numbers[left] = numbers[i];
            numbers[i] = pivot;

            quickSort(numbers, left, i - 1);
            quickSort(numbers, i + 1, right);
        }
    }

    public static void insertionSort(int[] numbers) {
        for (int i = 1, loop = numbers.length; i < loop; i++) {
            int unsorted = numbers[i];
            for (int j = i - 1; j >=0; j--) {
                if (unsorted < numbers[j]) {
                    numbers[j+1] = numbers[j];
                    numbers[j] = unsorted;
                }

            }
        }
    }

    public static void bubbleSort(int[] numbers) {
        for (int i = 0, loop = numbers.length - 1; i < loop; i++) {
            for (int j = 0, compare = loop - i; j < compare; j++) {
                if (numbers[j] > numbers[j+1]) {
                    swap(numbers, j, j+1);
                }
            }
        }
    }

    public static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void main(String[] args) {
       int[] numbers = {-30, -10, 1, 11, 0, 33, -300, 9, 8, 7};
//        bubbleSort(numbers);
//        insertionSort(numbers);

//        quickSort(numbers, 0, numbers.length - 1);

        mergeSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));
    }
}
