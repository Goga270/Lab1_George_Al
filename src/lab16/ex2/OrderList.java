package lab16.ex2;

import java.util.NoSuchElementException;

public class OrderList<T> {
    private Node<T> front;
    private int size;

    public OrderList() {
        front = null;
        size = 0;
    }

    public void add(T elem) {
        if (isEmpty())
            front = new Node<T>(elem);
        else {
            Node<T> temp = front;
            front = new Node<T>(null, elem, temp);
            front.next.prev = front;
        }
        size++;
    }

    public void remove(T elem) {
        if (isEmpty())
            throw new NoSuchElementException("Элемент " + elem.toString() + " не найден");

        if (front.data.equals(elem)) {
            front = front.next;
            return;
        }

        Node<T> current = front;
        while (current != null && !current.data.equals(elem))
            current = current.next;

        if (current == null)
            throw new NoSuchElementException("Элемент " + elem.toString() + " не найден");

        if (current.next != null)
            current.next.prev = current.prev;

        current.prev.next = current.next;
        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Node getNext(Node current){
        return current.next;
    }

    public Node getFront(){
        return front;
    }

    public static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this(null, data, null);
        }

        Node(Node<T> prev, T data, Node<T> next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public T getData(){
            return data;
        }
    }
}
