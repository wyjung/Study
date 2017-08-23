import java.lang.reflect.Array;

/**
 * Created by wyjung on 2017. 8. 23..
 */
public class Queue<T> {

    private T[] list;
    private int last;

    Queue(Class<T> c, int size) {
        list = (T[]) Array.newInstance(c, size);
        last = 0;
    }

    public void insert(T element) {
        if (last >= list.length) {
            throw new IndexOutOfBoundsException();
        }
        list[last] = element;
        last++;
    }

    public T remove() {

        if (last <= 0) {
            throw new IndexOutOfBoundsException();
        }

        T element = list[0];
        last--;
        System.arraycopy(list, 1, list, 0, last);

        return element;
    }

    public T peek(int index) {
        if (index >= last) {
            throw new IndexOutOfBoundsException();
        }

        return list[index];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < last; i++) {
            sb.append(list[i]).append("");
        }
        sb.append("]");
        return sb.toString();
    }
 }
