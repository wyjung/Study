/**
 * Created by wyjung on 2017. 8. 24..
 */
public class DoubleLinkedList<T> {

    private Node<T> head;

    DoubleLinkedList() {
        head = null;
    }


    public void addFirst(T item) {

        if (isEmpty()) {
            head = new Node<>(item, null, null);
        } else {
            head.prev = new Node<>(item, null, head);
            head = head.prev;
        }
    }

    public void addLast(T item) {

        if (isEmpty()) {
            addFirst(item);
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(item, currentNode, null);
        }

    }

    public T removeFirst() {

        if (head != null) {
            T item = head.getItem();

            head = head.next;
            head.prev = null;

            return item;
        }

        return null;
    }

    public T removeLast() {


        if (head != null) {
            Node<T> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            T item =  currentNode.getItem();
            currentNode.prev.next = null;
            currentNode.prev = null;

            return item;
        }


        return null;
    }

    public boolean isEmpty()
    {
        if (head == null) {
            return true;
        }

        return false;
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


    class Node<T> {
        private T item;
        private Node next;
        private Node prev;

        Node(T item, Node prev, Node next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
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

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }

}
