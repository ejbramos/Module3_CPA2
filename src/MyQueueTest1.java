import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest1 {

    @Test
    void push() {
        MyQueue queue = new MyQueue();
        Queue<Object> queue2 = new LinkedList<Object>();

        for(int i = 0; i < 9; i++){
            queue.push(i);
            queue2.offer(i);
        }
        assertEquals(queue2.poll(),queue.pop());
    }

    @Test
    void pop() {
        MyQueue queue = new MyQueue();
        Queue<Object> queue2 = new LinkedList<Object>();

        for(int i = 0; i < 9; i++){
            queue.push(i);
            queue2.offer(i);
        }
        assertEquals(queue2.poll(),queue.pop());
    }

    @Test
    void front() {
        MyQueue queue = new MyQueue();
        Queue<Object> queue2 = new LinkedList<Object>();

        for(int i = 0; i < 9; i++){
            queue.push(i);
            queue2.offer(i);
        }
        assertEquals(queue2.poll(),queue.front());;
    }

    @Test
    void back() {
        MyQueue queue = new MyQueue();
        Queue<Object> queue2 = new LinkedList<Object>();

        for(int i = 0; i < 9; i++){
            queue.push(i);
            queue2.offer(i);
        }
        for(int i = 0; i<8; i++){
            queue2.poll();
        }
        assertEquals(queue2.poll(),queue.back());
    }

    @Test
    void size() {
        MyQueue queue = new MyQueue();
        Queue<Object> queue2 = new LinkedList<Object>();

        for(int i = 0; i < 9; i++){
            queue.push(i);
            queue2.offer(i);
        }
        assertEquals(queue2.size(),queue.size());
        for(int i = 0; i < 9; i++){
            queue.pop();
            queue2.poll();
        }
        assertEquals(queue2.size(),queue.size());
    }

    @Test
    void empty() {
        MyQueue queue = new MyQueue();
        Queue<Object> queue2 = new LinkedList<Object>();

        assertEquals(queue2.isEmpty(),queue.empty());
        for(int i = 0; i < 9; i++){
            queue.push("Amazing");
            queue2.offer("Amazing");
        }
        assertEquals(queue2.isEmpty(),queue.empty());
    }
}