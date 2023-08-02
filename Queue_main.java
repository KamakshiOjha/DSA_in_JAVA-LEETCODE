public class Queue_main {
    public static void main(String[] args) {
        Queue q = new Queue(7);
        q.enqueue(4);
        q.enqueue(5);
        q.printQueue();
        q.dequeue();
        System.out.println("after dequeue");
        q.printQueue();
    }
}