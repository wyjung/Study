import com.sun.deploy.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by wyjung on 2017. 7. 16..
 */
public class CountPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();

        List<String> texts = new ArrayList<>();
        for (int i = 0; i < line; i++) {
            texts.add(scanner.next());
        }

        for (String text : texts) {

            int count = 0;
            for (int length = 2; length <= text.length(); length++) {
                for (int idx = 0; idx < text.length(); idx++) {
                    if (idx + length > text.length()) break;

                    if (isPalindrome(text.substring(idx, idx + length)))  count++;
                }
            }
            System.out.println(count);
        }
    }


    public static boolean isPalindrome(String s) {

        List<String> reverse = Arrays.asList(s.split(""));
        Collections.reverse(reverse);
        if (s.equals(StringUtils.join(reverse, ""))) {
            //System.out.println(">>> " + s);
            return true;
        }
        return false;
    }
}
