package lab11.ex1;

import lab11.ex2.AbstractQueue;

public class ArrayQueueModule extends AbstractQueue {
    private Object[] q;

    private static ArrayQueueModule instance;

    public ArrayQueueModule(){
        q = new Object[CAPACITY];
        head=tail=0;
    }

    public static ArrayQueueModule getInstance(){
        if(instance == null)
            instance = new ArrayQueueModule();
        return instance;
    }


    @Override
    public Object dequeue() {
        if(isEmpty())
            throw new IndexOutOfBoundsException("Queue is empty!");
        Object r = q[head++];
        if(head == q.length)
            head = 0;
        if(Math.abs(head-tail)<q.length/2)
            resize(q.length/2);
        return r;

    }

    @Override
    public Object element() {
        if(isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!");
        return q[head];
    }

    @Override
    public void enqueue(Object o) {
        q[tail++] = o;
        if(tail == q.length)
            tail = 0;
        if(tail==head)
            resize(q.length*2);

    }

    @Override
    public boolean isEmpty() {
        return head==tail;
    }

    @Override
    public boolean clear() {
        boolean r = !isEmpty();
        head = tail = 0;
        resize(CAPACITY);
        return r;
    }

    private void resize(int Size){
        Object[] nq = new Object[Size];
        System.arraycopy(q,head,nq,0,Math.abs(head-tail));
        tail = Math.abs(head-tail);
        head = 0;
        q = nq;
    }
}
