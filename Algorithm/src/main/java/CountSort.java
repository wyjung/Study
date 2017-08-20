import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by wyjung on 2017-08-20.
 */
public class CountSort {

    private final static int MAX_COUNT = 100;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int resultSize = MAX_COUNT;

        if (count < MAX_COUNT) {
            resultSize = count;
        }
        // 배열 요소의 카운트를 구함
        int[] numList = new int[count];
        int[] countSumList = new int[resultSize];

        for (int i = 0; i < count; i++) {
            int num = scan.nextInt();
            numList[i] = num;
            countSumList[num]++;
        }

        // 카운트를 누적합으로 변경
        for (int i = 1; i < countSumList.length; i++) {
            countSumList[i] = countSumList[i - 1] + countSumList[i];
        }

        // 정렬
        int[] result = new int[count];
        for (int i = numList.length - 1; i >= 0; i--) {
            int num = numList[i];
            result[countSumList[num] - 1] = num;
            countSumList[num]--;
        }

        for (int i = 0; i < MAX_COUNT; i++) {
            System.out.printf("%d ", result[i]);
        }
    }
}
