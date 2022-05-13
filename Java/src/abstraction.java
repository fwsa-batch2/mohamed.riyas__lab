import java.util.Scanner;

abstract class abstractCalculator {
   abstract void add(int a, int b);
   abstract void sub(int a, int b);
   abstract void mul(int a, int b);
   abstract void div(int a, int b);
}
class add extends abstractCalculator {
    public void add(int a, int b) {
        int c= a+b;
        System.out.println("The answer is"+" "+c);
    }
    public void sub(int a, int b) {
        int c = a-b;
        System.out.println("The answer is"+" "+c);
    }
    public void mul(int a, int b) {
        int c = a*b;
        System.out.println("The answer is"+" "+c);
    }
    public void div(int a, int b) {
        int c = a/b;
        System.out.println("The answer is"+" "+c);
    }
}
public class abstraction {
    public static void main(String[] args) {
        add myObj = new add();
        Scanner firstNum = new Scanner(System.in);
        System.out.println("Enter a number:");
        int firstInput = firstNum.nextInt();
        Scanner secondNum = new Scanner(System.in);
        System.out.println("Enter another number");
        int secondInput = secondNum.nextInt();
        Scanner operator = new Scanner(System.in);
        System.out.println("Enter operator");
        String inputOperator = operator.nextLine();

        switch (inputOperator) {
            case "+" :
                myObj.add(firstInput,secondInput);
                break;
            case "-" :
                myObj.sub(firstInput,secondInput);
                break;
            case "*" :
                myObj.mul(firstInput,secondInput);
                break;
            case "/" :
                myObj.div(firstInput,secondInput);
                break;
        }
    }
}
