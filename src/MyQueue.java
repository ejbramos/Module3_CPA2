public class MyQueue<T> implements QueueInterface<T> {
    private T[] queue;
    private int max = 11;
    private int head = 0;
    private int tail = 0;

    public MyQueue(){
        queue = (T[]) new Object[max];
    }
    @Override
    public void push(T item) {
        if (!(tail == max)){
            queue[tail] = item;
            tail++;
            int tailLoop = tail % max;
        }
        else System.out.println("Queue Overflow");



    }

    @Override
    public T pop() {
        if (!(head == tail)){
        T pop = queue[head];
        head++;
        int headLoop = head % max;
        return pop;
        }
        else {System.out.println("Queue Underflow");
        return null;}
    }

    @Override
    public T front() {
        T front = queue[head];
        return front;
    }

    @Override
    public T back() {
        T back = queue[tail-1];
        return back;
    }
    @Override
    public int size() {
        int size = (tail - head + max) % max;
        return size;
    }

    @Override
    public boolean empty() {
        if (head == tail) return true;
        return false;
    }
}
