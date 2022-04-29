public class reverse {
    public static void main(String[] args) {
        int num1 = 5753;
        int num2 = 0;
        while (num1 != 0) {
            int remainNumber = num1 % 10;
            num2 = ( num2 * 10 ) + remainNumber;
            num1 = num1 / 10;
        }
        System.out.print(num2);
    }
}
