package sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by wyjung on 2017-03-26.
 */
public class BubbleSort {

    @Test
    public void test () {
        int[] list = {9, 33, 5, 1, 10, 4};
        int[] result = {1, 4, 5, 9, 10, 33};

        assertArrayEquals(bubbleSort(list), result);
    }

    public int[] bubbleSort (int[] list) {

        for (int i = list.length; i > 0; i--) {
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j + 1];
                    list[j + 1] = list[j];
                    list[j] = temp;
                }
            }
        }
        for (int num : list) {
            System.out.print(num + ", ");
        }
        return list;
    }
}
