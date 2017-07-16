import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by wyjung on 2017. 7. 16..
 */
public class TaskOrdering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();

        List<String> result = new ArrayList<>();

        for (int i = 0; i < line; i++) {
            int taskCount = scanner.nextInt();
            int depCount = scanner.nextInt();

            List<String> dep = new ArrayList<>();
            for (int j = 0; j < depCount; j++) {
                dep.add(scanner.next());
            }

            result.add(order(taskCount, dep));
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    public static String order(int taskCount, List<String> dep) {

        char a = 'A';
        LinkedList<String> taskList = new LinkedList<>();
        for (int i = 0; i < taskCount; i++) {
            taskList.add(String.valueOf((char)(a + i)));
        }

        for (int i = 0; i < dep.size(); i++) {
            String[] depStr = dep.get(i).split("");
            taskList.remove(taskList.indexOf(depStr[depStr.length - 1]));
            taskList.add(taskList.indexOf(depStr[0]) + 1, depStr[depStr.length - 1]);
        }

        return StringUtils.join(taskList, "");
    }
}
