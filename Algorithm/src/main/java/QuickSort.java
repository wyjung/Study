/**
 * Created by wyjung on 2017. 8. 21..
 */
public class QuickSort {

    public static void main(String[] args) {

        int[] test = new int[]{9, 2, 3, 1, 7, 4, 0, 8};
        sort(test, 0, test.length - 1);

        for (int i = 0; i < test.length; i++) {
            System.out.printf("%d ", test[i]);
        }
    }

    public static void sort(int[] array, int l, int r) {
        int pivot = array[(l + r) / 2];
        int left = l;
        int right = r;

        while (left <= right) {
            while(array[left] < pivot) left++;
            while(array[right] > pivot) right--;

            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }

        if (l < right) sort(array, l, right);
        if (r > left) sort(array, left, r);

    }

    public static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }

}
