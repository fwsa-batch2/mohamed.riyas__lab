public class multiplicationTable {
    public static void main(String[] args) {
        int num1 = 2;
        int num2;
        for (int i = 1; i <= 10; i++ ) {
            num2 = i * num1;
            System.out.println(i + "*" + num1 + "=" + num2);
        }
    }
}
