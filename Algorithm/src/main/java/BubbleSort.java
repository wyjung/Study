import java.util.Scanner;

/**
 * Created by wyjung on 2017. 8. 21..
 */
public class BubbleSort {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = scan.nextInt();
        }

        sort(array);

        // output
        /*Array is sorted in 3 swaps.
                First Element: 1
        Last Element: 3*/

        System.out.println("First Element: " + array[0]);
        System.out.println("Last Element: " + array[array.length - 1]);
        /*for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }*/

    }

    public static void sort(int[] array) {
        int swap = 0;

        for (int end = array.length; end > 0; end--) {
            for (int i = 0; i < end - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swap++;
                }
            }
        }
        System.out.println("Array is sorted in " + swap + " swaps");
    }

    public static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}
