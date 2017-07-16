import com.sun.deploy.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by wyjung on 2017. 7. 15..
 */
public class TextEncryption {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int line = scanner.nextInt();

        List<String> text = new ArrayList<>();
        for (int i = 0; i < line; i++) {
            text.add(scanner.next());
        }

        for (int i = 0; i < text.size(); i++) {
            System.out.println(encrypt(text.get(0)));
        }

    }

    public static String encrypt(String text) {

        List<Text> textList = new ArrayList<>();

        int index = 0;
        for (String s : text.split("")) {
            textList.add(new Text(index, s));
            index++;
        }

        textList.sort(new Comparator<Text>() {
            @Override
            public int compare(Text o1, Text o2) {

                if (o1.getIndex() % 2 == 0 || o1.getIndex() == 0) {

                    if (o1.getIndex() % 2 == 0 && o2.getIndex() % 2 == 0) {
                        if (o1.getIndex() < o2.getIndex()) {
                            return  -1;
                        } else {
                            return 0;
                        }
                    } else {
                        return -1;
                    }
                }
                return 0;
            }
        });

        return StringUtils.join(textList.stream().map(Text::getText).collect(Collectors.toList()), "");
    }

    public static class Text {
        private int index;
        private String text;

        public Text() {
        }

        public Text(int index, String text) {
            this.index = index;
            this.text = text;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }


    }

}
