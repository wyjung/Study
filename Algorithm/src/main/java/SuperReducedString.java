import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wyjung on 2017. 8. 8..
 */
public class SuperReducedString {

    /*aaabccddd → abccddd
      abccddd → abddd
      abddd → abd*/

    /*baab → bb
      bb → Empty String
      Thus, we print Empty String.*/

    static String super_reduced_string(String s){
        // Complete this function
        String regx = "(.)\\1";
        String result = "";

        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            s = s.replaceAll(regx, "");
            matcher = pattern.matcher(s);
        }

        if (s.equals("")) {
            s = "Empty String";
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
