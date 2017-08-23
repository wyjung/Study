import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by wyjung on 2017. 8. 21..
 */
public class FullCountingSort2 {

    private final static int MAX_COUNT = 100;

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(in.readLine());

        int[] countSum = new int[count > MAX_COUNT ? MAX_COUNT : count];

        int[] index = new int[count];
        String[] str = new String[count];

        int countHalf = count / 2;
        int n = 0;
        String s = "";

        for (int i = 0; i < count; i++) {

            String[] temp = in.readLine().split(" ");
            n = Integer.parseInt(temp[0]);
            s = temp[1];

            if (i < countHalf) {
                s = "-";
            }

            index[i] = n;
            str[i] = s;
            countSum[n]++;
        }

        for (int i = 1; i < countSum.length; i++) {
            countSum[i] = countSum[i - 1] + countSum[i];
        }

        String[] result = new String[count];

        for (int i = count - 1; i >= 0; i--) {
            n = index[i];
            result[countSum[n] - 1] = str[i];
            countSum[n]--;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]).append(" ");
        }

        System.out.println(sb.toString());

    }
}
