import java.util.Arrays;
import java.util.List;

public class average {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(4,4,4,4);
        int tempVar = 0;
        for (int i = 0; i < myList.size(); i++) {
            tempVar = tempVar + myList.get(i);
        }
        int average = tempVar / myList.size();
        System.out.print(average);
    }
}