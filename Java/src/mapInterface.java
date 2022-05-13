import java.util.HashMap;
import java.util.Map;

public class mapInterface {
    public static void main(String[] args) {
        Map<Integer,String> Map1 = new HashMap<>();
        Map1.put(7,"Riyas");
        Map1.put(4,"Mustaq");
        Map1.put(8,"Shaheen");
        Map1.put(1,"Shahul");
//        printing the elements
        System.out.println(Map1);
//        checking the values
        System.out.println(Map1.containsValue("Riyas"));
//        accessing the elements
        System.out.println(Map1.entrySet());
//        creating another object to check equality
        Map<Integer,String> Map2 = new HashMap<>();
        Map2.put(7,"Riyas");
        Map2.put(4,"Mustaq");
        Map2.put(8,"Shaheen");
        Map2.put(1,"Sulaiman");
//        Checking equality between Map1 and Map2
        System.out.println(Map1.equals(Map2));
//        Retrieving one element
        System.out.println(Map1.get(8));
//        retrieving the size of the element
        System.out.println(Map1.size());
//        generating hash code
        int code = Map2.hashCode();
        System.out.println(code);
    }
}
