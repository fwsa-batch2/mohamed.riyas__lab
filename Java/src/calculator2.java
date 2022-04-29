import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args) {
        Scanner firstNum = new Scanner(System.in);
        System.out.println("Enter a number:");
        int firstInput = firstNum.nextInt();
        Scanner secondNum = new Scanner(System.in);
        System.out.println("Enter another number:");
        int secondInput = secondNum.nextInt();
        Scanner operator = new Scanner(System.in);
        System.out.println("Enter a operator:");
        String thirdInput = operator.nextLine();
        switch (thirdInput) {
            case "+":
                int addition = add(firstInput , secondInput);
                System.out.print(addition);
                break;
            case "-":
                int subtraction = sub(firstInput , secondInput);
                System.out.print(subtraction);
                break;
            case "*":
                int multiplication = mul(firstInput, secondInput);
                System.out.print(multiplication);
                break;
            case "/":
                int division = div(firstInput, secondInput);
                System.out.print(division);
                break;
            }
    }
    public static int add (int num1 ,int num2) {
        int add = num1 + num2;
        return add;
    }
    public static int sub(int num1, int num2) {
        int sub = num1 - num2;
        return sub;
    }
    public static int mul(int num1, int num2) {
        int mul = num1 * num2;
        return mul;
    }
    public static int div(int num1, int num2) {
        int div = num1 / num2;
        return div;
    }
}