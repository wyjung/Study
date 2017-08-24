import java.util.LinkedList;

/**
 * Created by wyjung on 2017. 8. 23..
 */
public class SimpleLinkedList<T> {

    private Node<T> head;

    SimpleLinkedList() {
        head = null;
    }

    public void addFirst(T element) {

        if (head == null) {
            head = new Node<>(element, null);
        } else {
            head = new Node(element, head.next);
        }
    }

    public void addLast(T element) {

        if (head == null) {
            addFirst(element);
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = new Node(element, null);
        }
    }

    public int indexOf(T element) {

        Node currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.getItem().equals(element)) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }

        return -1;
    }

    public T get(int index) {

        Node currentNode = head;
        int i = 0;
        while (currentNode != null) {
            if (index == i) {
                return (T) currentNode.getItem();
            }
            currentNode = currentNode.next;
            i++;
        }

        return null;
    }

    public T remove(){

        if (head == null) {
            return null;
        }

        Node<T> removeTargetNode = head;
        head = removeTargetNode.next;
        removeTargetNode.next = null;

        return removeTargetNode.item;

    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        Node currentNode = head;
        while (currentNode != null) {
            sb.append("[").append(currentNode.getItem()).append("]");
            currentNode = currentNode.next;
        }

        return sb.toString();
    }

    private class Node<T> {
        private T item;
        private Node next;

        Node(T item, Node next) {
            this.item = item;
            next = null;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
