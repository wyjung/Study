import java.util.ArrayList;
import java.util.List;

/**
 * Created by wyjung on 2017. 8. 23..
 */
public class Stack2<T> {

    private List<T> list;

    Stack2() {
        list = new ArrayList<>();
    }

    public void push(T element) {
        list.add(element);
    }

    public T pop() {
        return list.remove(list.size() - 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (T element : list) {
            sb.append(element).append(" ");
        }
        sb.append("]");

        return sb.toString();
    }

}
