import java.util.*;

public class setInterface {
    public static void main(String[] args) {
        Set<Integer> num1 = new HashSet<>();
        num1.addAll(Arrays.asList(new Integer[] {1,2,3,4}));

        Set<Integer> num2 = new HashSet<>();
        num2.addAll(Arrays.asList(new Integer[]{2,3,6,7,8}));

//      Finding union of two sets
        Set<Integer> union = new LinkedHashSet<>(num1);
        union.addAll(num2);
        System.out.println("Union of two sets num1 and num2 : "+ union);

//      Finding intersection of two sets
        Set<Integer> intersection = new HashSet<>(num1);
        intersection.retainAll(num2);
        System.out.println("Intersection of two sets num1 and num2 : "+ intersection);

//      Finding difference between two sets
        Set<Integer> difference = new HashSet<>(num2);
        difference.removeAll(num1);
        System.out.println("Difference between two sets : " + difference);
        linkedHashSet();
    }
     static void linkedHashSet() {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
//        adding values and checking the null and duplicates.
        linkedHashSet.add(2);
        linkedHashSet.add(4);
        linkedHashSet.add(6);
        linkedHashSet.add(4);
        linkedHashSet.add(null);
        System.out.println("Printing LinkedHashSet "+linkedHashSet);
//        iterating the LinkedHashSet
         Iterator<Integer> iterate = linkedHashSet.iterator();
         while (iterate.hasNext()) {
             System.out.println(iterate.next());
         }
    }
}
