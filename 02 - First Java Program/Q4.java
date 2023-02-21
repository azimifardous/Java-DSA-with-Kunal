import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = sc.nextInt();
        System.out.print("Enter an operator: ");
        String operator = sc.next();

        int result = 0;
        if (operator.equals("+")) result = firstNum + secondNum;
        if (operator.equals("-")) result = firstNum - secondNum;
        if (operator.equals("*")) result = firstNum * secondNum;
        if (operator.equals("/")) result = firstNum / secondNum;

        System.out.println("The result is: " + result);

    }
}
