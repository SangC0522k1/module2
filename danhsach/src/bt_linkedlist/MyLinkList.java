package bt_linkedlist;

import javax.xml.soap.Node;

public class MyLinkList<E> {
    private Node head;
    private int numnodes;
    private boolean flag;

    public static class Node {
        private Node next;
        private final Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public MyLinkList(Object data) {
        head = new Node(data);
    }
    public void add(int index, E element) {

    }
}
