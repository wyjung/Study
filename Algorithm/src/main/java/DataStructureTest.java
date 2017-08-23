import java.util.*;
import java.util.Queue;

/**
 * Created by wyjung on 2017. 8. 23..
 */
public class DataStructureTest {


    public static void main(String[] args) {

        SimpleLinkedList<String> linkedList = new SimpleLinkedList();
        linkedList.addLast("A");
        linkedList.addLast("B");
        linkedList.addLast("C");

        System.out.println(linkedList.toString());

        linkedList.remove();
        System.out.println(linkedList.toString());
        /*Stack<Integer> stack = new Stack(Integer.class, 5);

        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.toString());

        System.out.println(stack.peek(4));
        System.out.println(stack.toString());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.toString());

        stack.push(7);
        System.out.println(stack.toString());*/

        /*Queue<Integer> queue = new Queue<>(Integer.class, 5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        System.out.println(queue.toString());

        System.out.println(queue.peek(3));

        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        System.out.println(queue.toString());*/

        /*Stack2<Integer> stack2 = new Stack2<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        System.out.println(stack2.toString());

        stack2.pop();
        stack2.pop();
        stack2.pop();
        System.out.println(stack2.toString());*/

        /*Queue2<Integer> queue2 = new Queue2<>();
        queue2.insert(1);
        queue2.insert(2);
        queue2.insert(3);
        queue2.insert(4);
        queue2.insert(5);
        queue2.insert(6);
        System.out.println(queue2.toString());

        System.out.println(queue2.get(2));
        queue2.remove();
        queue2.remove();

        System.out.println(queue2.toString());*/

    }



}
