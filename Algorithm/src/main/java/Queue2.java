import java.util.ArrayList;
import java.util.List;

/**
 * Created by wyjung on 2017. 8. 23..
 */
public class Queue2<T> {

    private List<T> list;

    Queue2() {
        list = new ArrayList<>();
    }

    public void insert(T element) {
        list.add(element);
    }

    public T remove() {
        return list.remove(0);
    }

    public T get(int index) {
        return list.get(index);
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
