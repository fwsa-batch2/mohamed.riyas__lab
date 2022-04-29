public class fibonacci {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int rangeOfNumbers = 7;
        for (int i = 1; i <= rangeOfNumbers; i++) {
            System.out.print(num1 + ", ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        } 
	}
}
