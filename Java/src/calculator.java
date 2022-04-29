public class calculator {
    public static void main(String[] args) {
        int firstNum = 20;
        int secondNum = 20;
        String operator = "divide";
        switch (operator) {
            case "add":
                int addition = add(firstNum , secondNum);
                System.out.print(addition);
                break;
            case "subtract":
                int subtraction = sub(firstNum , secondNum);
                System.out.print(subtraction);
                break;
            case "multiply":
                int multiplication = mul(firstNum, secondNum);
                System.out.print(multiplication);
                break;
            case "divide":
                int division = div(firstNum, secondNum);
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
