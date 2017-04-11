package chap5;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by wyjung on 2017. 4. 6..
 */
public class DoubleLinkedList<T> {

    private Node head, tail;
    private int size = 0;

    public void addFirst(T item) {
        Node newNode = new Node(item, null, head);
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void addLast(T item) {

        if (size == 0) {
            addFirst(item);
            return;
        }

        Node newNode = new Node(item, tail, null);
        tail.next = newNode;
        tail = newNode;

        size++;
    }

    public void add(T item, int index) {
        if(index == 0) {
            this.addFirst(item);
        } else if(index == size) {
            this.addLast(item);
        } else{
            Node node = find(index);
            Node prev = node.prev;
            Node newNode = new Node(item, prev, node);
            node.prev = newNode;
            prev.next = newNode;
            size++;

        }

    }

    public T removeFirst() {

        if(size == 0) {
            return null;
        } else if (size == 1) {
            Node node = head;
            head = tail = null;
            size--;
            return node.getItem();
        }

        Node headedNode = head;
        Node next = headedNode.next;
        next.prev = null;
        head = headedNode.next;
        size--;

        headedNode.prev = headedNode.next = null;

        return headedNode.getItem();
    }

    public T removeLast() {
        if(size == 0) {
            return null;
        } else if(size == 1) {

            return removeFirst();
        }

        Node lastedNode = tail;
        Node prev = lastedNode.prev;
        tail = prev;
        tail.next = null;
        size--;

        lastedNode.prev = lastedNode.next = null;

        return lastedNode.getItem();

    }

    public T remove(int index) {

        if (size > 0) {

            if (index == 0) {
                return removeFirst();
            } else if (index == size - 1) {
                return removeLast();
            } else {

                Node removeNode = find(index);
                T item = removeNode.getItem();

                removeNode.prev.next = removeNode.next;
                removeNode.next.prev = removeNode.prev;

                removeNode.prev = null;
                removeNode.next = null;
                removeNode.item = null;

                return item;
            }
        }
        return null;
    }

    public Node find(int index) {

        if (index >= size) {
            return null;
        }

        if (index < size/2) {
            Node current = head;
            for(int i=0; i<index; i++) {
                current = current.next;
            }

            return current;

        } else {
            Node current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }

            return current;
        }
    }

    public int indexOf(T item){
        if(size > 0){
            Node cur = head;
            int pos = 0;
            while(cur.next != null){
                if(cur.item.equals(item)){
                    return pos;
                }
                cur = cur.next;
                pos++;
            }
            if(cur.item.equals(item)) return pos;
        }

        return -1;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        Node currentNode = head;
        while (currentNode.next != null) {
            sb.append(currentNode.item).append(",");
            currentNode = currentNode.next;
        }
        sb.append(currentNode.item);
        return sb.toString();
    }

    public String reverse() {
        StringBuilder sb = new StringBuilder();
        Node currentNode = tail;

        while (currentNode.prev != null) {
            sb.append(currentNode.item).append(",");
            currentNode = currentNode.prev;
        }

        sb.append(currentNode.item);
        return sb.toString();
    }

    public static void main(String[] args) {
        DoubleLinkedList<String> doubleLinkedList = new DoubleLinkedList<>();
        doubleLinkedList.addFirst("C");
        doubleLinkedList.addFirst("B");
        doubleLinkedList.addFirst("A");

        doubleLinkedList.addLast("D");
        doubleLinkedList.addLast("e");
        doubleLinkedList.addLast("f");

        doubleLinkedList.add("AA", 1);
        doubleLinkedList.add("BB", 3);
        doubleLinkedList.add("ff", 8);
        doubleLinkedList.add("a", 0);
        doubleLinkedList.add("random", 6);


        System.out.println(doubleLinkedList.toString());

        doubleLinkedList.removeFirst();
        doubleLinkedList.removeFirst();
        doubleLinkedList.removeFirst();

        doubleLinkedList.removeLast();
        doubleLinkedList.removeLast();
        doubleLinkedList.removeLast();

        doubleLinkedList.remove(0);
        doubleLinkedList.remove(1);
        doubleLinkedList.remove(1);

        System.out.println(doubleLinkedList.indexOf("BB"));
        System.out.println(doubleLinkedList.indexOf("D"));
        System.out.println(doubleLinkedList.indexOf("gta"));

        System.out.println(doubleLinkedList.toString());

    }


    class Node {
        private T item;
        private Node prev;
        private Node next;

        public Node(T item, Node prev, Node next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
