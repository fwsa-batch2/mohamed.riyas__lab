public class wrapperClass {
    public static void main(String[] args) {
        autoBoxing();
        boxing();
        unBoxing();
    }
    public static void autoBoxing() {
        int num1 = 10;
        Integer obj = num1;
        System.out.println(obj);
    }
    public static void boxing() {
        char letter = 'R';
        Character objOfLetter = Character.valueOf(letter);
        System.out.println(objOfLetter);
    }
    public static void unBoxing() {
        Integer num1 = 20;
        int riyas = num1.intValue();
        System.out.println(riyas);
    }
}