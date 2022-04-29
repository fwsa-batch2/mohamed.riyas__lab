public class perfectnumber {
    public static void main(String[] args) {
        int perfectNumber = 14;
        int num1 = 0;
        for (int i = 1; i < perfectNumber; i++) {
            int calculate =  perfectNumber % i ;
            boolean equate = calculate == 0 ;
            if (equate == true) {
                num1 = num1 + i;
            }
        }
        if (num1 == perfectNumber) {
            System.out.print("The given number is perfect number");
        }
        else {
            System.out.print("the given number is not a perfect number");
        }
    }
}
