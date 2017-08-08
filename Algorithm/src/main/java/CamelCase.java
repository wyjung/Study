import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by wyjung on 2017. 8. 8..
 */
public class CamelCase {

    /* help ( stackoverflow)
     System.out.println(Arrays.toString("a;b;c;d".split("(?<=;)")));
     System.out.println(Arrays.toString("a;b;c;d".split("(?=;)")));
     System.out.println(Arrays.toString("a;b;c;d".split("((?<=;)|(?=;))")));

     [a;, b;, c;, d]
     [a, ;b, ;c, ;d]
     [a, ;, b, ;, c, ;, d]
    */

    // intput saveChangesInTheEditor
    // split save / Changes / In / The / Editor
    // output 5
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        /*Arrays.asList(s.split("(?=([A-Z]))")).forEach(str -> {
            System.out.println(str);
        });*/

        String[] result = s.split("(?=([A-Z]))");
        System.out.println(result.length);
    }

}
