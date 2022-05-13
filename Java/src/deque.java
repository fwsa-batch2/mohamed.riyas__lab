import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        // Creating deque using arraydeque class
        Deque<Integer> numbers = new ArrayDeque<>();
        //    adding numbers
        numbers.offerFirst(7);
        numbers.offerFirst(1);
        numbers.offerLast(2);
        numbers.offerLast(8);
        System.out.println(numbers);
//        get the first element
        System.out.println("First element is"+" "+numbers.getFirst());
//        get the last element
        System.out.println("Last element is"+" "+numbers.getLast());
    }
}
