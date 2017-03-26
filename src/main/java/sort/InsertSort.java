package sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by wyjung on 2017-03-26.
 */
public class InsertSort {

    @Test
    public void test() {
        int[] list = {9, 33, 5, 1, 10, 4};
        int[] result = {1, 4, 5, 9, 10, 33};

        assertArrayEquals(insertSort(list), result);
    }

    public int[] insertSort(int[] list) {

        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j] < list[j - 1]) {
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
            }
        }

        for (int num : list) {
            System.out.print(num + ", ");
        }

        return list;
    }
}
