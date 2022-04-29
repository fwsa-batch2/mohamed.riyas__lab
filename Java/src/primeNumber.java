public class primeNumber {
    public static void main(String[] args) {
        int num1 = 11;
        if (num1 == 1) {
            System.out.println("1 is prime number");
        }
        else if (num1 < 1 ) {
            System.out.println("Please enter a positive number");
        }
        else {
            for (int i = 2; i < num1; i++) {
                if (num1 % i == 0) {
                    System.out.println("It is not a prime number");
                    break;
                }
                else if (num1 % i == 1) {
                    System.out.println("it is prime number");
                    break;
                }
            }
        }
    }
}