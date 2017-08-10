import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by wyjung on 2017. 8. 9..
 */
public class BigSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        // your code goes here
        List<String> sorted = Arrays.asList(unsorted);

        //success but some case fail with timeout
        /*sorted.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (Double.parseDouble(o1) < Double.parseDouble(o2)) {
                    return -1;
                }
                return 0;
            }
        });*/

        // success without timeout
        sorted.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                } else {
                    for (int i = 0; i < o1.length(); i++) {
                        if (o1.charAt(i) != o2.charAt(i)) {
                            return o1.charAt(i) - o2.charAt(i);
                        }
                    }
                }
                return 0;
            }
        });



        System.out.println(sorted);
    }
}
