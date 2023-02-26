public class testQueue {
    public static void main(String[] args){
        MyQueue queue = new MyQueue();

        for(int i = 0; i < 11; i++){
            queue.push(10*i);
        }
        for(int i = 0; i < 10; i++){
            queue.pop();
        }
        System.out.println(queue.empty());
    }

}
