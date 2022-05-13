import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
        Queue<Integer> number = new PriorityQueue<>();
        number.offer(2);
        number.offer(4);
        number.offer(3);
        System.out.println(number.peek());
        System.out.println(number);
    }
}
