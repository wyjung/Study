import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wyjung on 2017. 8. 23..
 */
public class Stack<T> {
    private T[] list;
    private int top;

    Stack(Class<T> c, int size) {
        list = (T[]) Array.newInstance(c, size);
        top = 0;
    }

    public void push(T element) {
        if (top >= list.length) {
            throw new IndexOutOfBoundsException();
        }

        list[top] = element;
        top++;
    }

    public T peek(int index) {

        if (index >= list.length) {
            throw new IndexOutOfBoundsException();
        }

        return list[index];
    }

    public T pop() {
        if (top <= 0) {
            return null;
        }
        return list[--top];
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < top; i++) {
            sb.append(list[i]).append(" ");
        }
        sb.append("]");
        return sb.toString();
    }

}


