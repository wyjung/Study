import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by wyjung on 2017-08-20.
 */
public class FullCountingSort {

    private final static int MAX_COUNT = 100;

    public static void main(String[] args) throws IOException {
        //Scanner scanner = new Scanner(System.in);
        //int count = scanner.nextInt();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(in.readLine());
        List<Element> elementList = new ArrayList();
        int[] countSumList = new int[ count > 100 ? MAX_COUNT : count];

        for (int i = 0; i < count; i++) {
            //int idx = scanner.nextInt();
           // String str = scanner.next();

            String[] tmp = in.readLine().split(" ");
            int idx = Integer.parseInt(tmp[0]);
            String str = tmp[1];

            if (i < count/2) str = "-";
            elementList.add(new Element(idx, str));
            countSumList[idx]++;
        }

        for (int i = 1; i < countSumList.length; i++) {
            countSumList[i] = countSumList[i - 1] + countSumList[i];
        }

        String[] result = new String[count];
        for (int i = elementList.size() - 1; i >= 0; i--) {
            int num = elementList.get(i).getIndex();
            result[countSumList[num] - 1] = elementList.get(i).getStr();
            countSumList[num]--;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%s ", result[i]);
        }

    }

    static class Element {
        private int index;
        private String str;

        Element() {

        }

        Element(int index, String str) {
            this.index = index;
            this.str = str;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }
    }
}
