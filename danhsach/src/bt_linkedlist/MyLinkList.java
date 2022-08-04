package bt_linkedlist;

import javax.xml.soap.Node;

public class MyLinkList<E> {
    private Node head;
    private int numnodes =0;

    private Object data;
    public MyLinkList() {

    }

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
    public void add(int index, E elements) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(elements);
        temp.next.next = holder;
        numnodes++;
    }
    public void addFirst(E elements) {
        Node temp = head;
        head = new Node(elements);
        head.next = temp;
        numnodes++;

    }
    public void addLast(E elemens) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next= new Node(elemens);
        numnodes++;
    }
    public E remove(int index) {
        if (index < 0 ||index > numnodes ) {
            throw new IllegalArgumentException("Error index" + index);
        }
        Node temp = head;
        Object data;
        if (index == 0) {
            data = temp.data;
            head = head.next;
        }else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data =temp.next.data;
            temp.next = temp.next.next;
            numnodes++;
        }
        return (E) data;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index ; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int size() {
        return numnodes;
    }
    public boolean remove(E element) {
        if (head.data.equals(element)) {
            remove(0);
        }else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    return true;
                }
            }
        }
        return false;
    }

    public MyLinkList<E> clone() {
        if (numnodes == 0) {
            throw new NullPointerException("linklist này null");
        }
       MyLinkList<E>returnlinklist = new MyLinkList<>() ;
            Node temp = head;
            returnlinklist.addFirst((E) temp.data) ;
            temp = temp.next;
            while (temp != null) {
                returnlinklist.addFirst((E) temp.data);
                temp = temp.next;
            }
            return returnlinklist;
    }

    public boolean contains(E element) {
        Node temp = head;
        while (temp.next != null) {
           if (temp.data.equals(element)) {
               return true;
           }
           temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element) {
      Node temp = head;
      for (int i = 0; i < numnodes; i ++) {
          if (temp.getData().equals(element)) {
              return i;
          }
          temp = temp.next;
      }
      return -1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
