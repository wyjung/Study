package chap5;

/**
 * Created by wyjung on 2017. 4. 6..
 */
public class SimpleLinkedList<T> {

    private Node head;

    public void addFirst(T item) {

        Node newNode;

        if (head == null) {
            newNode = new Node(item, null);
        } else {
            newNode = new Node(item, head);
        }

        head = newNode;
    }

    public void addLast(T item) {

        Node newNode = new Node(item, null);

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    public void add (T item, int index) {

        if (index < 1) {
            addFirst(item);
        } else {
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }

            Node newNode = new Node(item, currentNode.next);
            currentNode.next = newNode;
        }
    }

    public int indexOf (T item) {

        Node currentNode = head;
        int index = 0;
        while (currentNode.next != null) {
            if (currentNode.getItem().equals(index)) {
                break;
            }
            currentNode = currentNode.next;
            index++;
        }
        return index;
    }

    public T get(int index) {

        if (index < 1) {
            return (T) head.getItem();
        }


        return null;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("[");
        Node currentNode = head;
        while (currentNode.next != null) {
            sb.append(currentNode.getItem()).append(", ");
            currentNode = currentNode.next;
        }

        return sb.append(currentNode.getItem()).append("]").toString();
    }

    public static void main(String[] args) {

        SimpleLinkedList<String> linkedList = new SimpleLinkedList<>();
        linkedList.addFirst("5");
        linkedList.addFirst("4");
        linkedList.addFirst("3");
        linkedList.addFirst("2");
        linkedList.addFirst("1");

        linkedList.addLast("6");
        linkedList.addLast("7");
        linkedList.addLast("8");
        linkedList.addLast("9");
        linkedList.addLast("10");

        linkedList.add("A", 2);
        linkedList.add("X", 0);


        System.out.println(linkedList.toString());
    }

    public class Node<T> {
        private T item;
        private Node next;

        public Node (T item, Node next) {
            this.item = item;
            this.next = next;
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
