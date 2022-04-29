public class factorial {
    public static void main(String[] args) {
		int num1 = 5;
		int num2 = 1;
		
		for (int i = 1; i <= num1 ; i++) {
			num2 = num2 * i; 
		}
		System.out.println("The factorial of number 5 is"+" "+ num2);
	}
}
