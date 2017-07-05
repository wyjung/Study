import java.util.Arrays;
import java.util.List;

/**
 * Created by wyjung on 2017. 7. 5..
 */
public class MinimumMoves {

    public static void main(String[] args) {

        String[] a = new String[]{"1234", "4321"};
        String[] b = new String[]{"2345", "3214"};

        System.out.println(moves(a, b));
    }

    public static int moves(String[] a, String[] m) {
        int sum = 0;


        for (int i = 0; i < a.length; i++) {

            List<String> andreaArray = Arrays.asList(a[i].split(""));
            List<String> mariaArray = Arrays.asList(m[i].split(""));

            for (int j = 0; j < andreaArray.size(); j++) {
                sum += Math.abs(Integer.parseInt(andreaArray.get(j)) - Integer.parseInt(mariaArray.get(j)));
            }
        }
        return sum;

    }
}
