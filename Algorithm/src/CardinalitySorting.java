/**
 * Created by wyjung on 2017. 7. 5..
 */
public class CardinalitySorting {

    public static void main(String[] args) {

        //int[] nums = {31, 15, 7, 3, 2};
        int[] nums = {1,2,3,4,5};

        int[][] values = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            values[i][0] = nums[i];
            values[i][1] = getOneCount(nums[i]);
        }

        quickSort(values, 0, values.length -1 );

        for (int i = 0; i < values.length ; i++) {
            System.out.println(values[i][0]);
        }
    }

    // 배열이 길지 않아서 쓸데 없는 스왑이랑 반복이 더 많음
    // 그냥 버블로 해도 비슷했을 듯?
    public static void quickSort(int[][] list, int left, int right) {

        int pivot = right;
        int i = left;
        int j = right ;

        if (left < right) {
            while (i < j) {
                while(i < j && list[i][1] <= list[pivot][1]) i++;
                while (list[j][1] > list[pivot][1]) j--;

                swap(list, i, j);

            }

            swap(list, i, pivot);

            quickSort(list, left, i - 1);
            quickSort(list,  i + 1, right);
        }
    }

    public static void swap(int[][] list, int i, int j) {
        int[] temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    static int getOneCount(int num) {

        int count = 0;
        String binary = Integer.toBinaryString(num);
        String[] temp = binary.split("");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].equals("1")) {
                count++;
            }
        }
        return count;
    }

}
