package lab11.ex1;

public class ArrayQueue {
    private ArrayQueueModule queue;

    public ArrayQueue(){
        this.queue = ArrayQueueModule.getInstance();
    }

    public Object dequeue(){
        return queue.dequeue();
    }

    public Object element(){
        return queue.element();
    }

    public void enqueue(Object o){
        queue.enqueue(o);
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public boolean clear(){
        return queue.clear();
    }
}
