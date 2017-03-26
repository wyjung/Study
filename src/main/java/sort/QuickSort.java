package sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by wyjung on 2017-03-26.
 */
public class QuickSort {

    @Test
    public void test() {
        //int[] list = {9, 33, 5, 1, 10, 4};
        //int[] result = {1, 4, 5, 9, 10, 33};

        int[] list = {-30, -10, 1, 11, 0, 33, -300, 9, 8, 7};
        int[] result = {-300, -30, -10, 0, 1, 7, 8, 9, 11, 33};

        quickSort(list, 0, list.length - 1);

        for (int num : list) {
            System.out.print(num + ", ");
        }
        assertArrayEquals(list, result);
    }

    public void quickSort(int[] list, int left, int right) {

        int pivot = right;
        int i = left;
        int j = right ;

        if (left < right) {
            while (i < j) {
                while(i < j && list[i] <= list[pivot]) i++;
                while (list[j] > list[pivot]) j--;

                swap(list, i, j);
            }

            swap(list, i, pivot);

            quickSort(list, left, i - 1);
            quickSort(list, i + 1, right);

        }

    }

    public void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
