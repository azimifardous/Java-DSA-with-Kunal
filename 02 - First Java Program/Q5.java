import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // Take 2 numbers as input and print the largest number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = sc.nextInt();

        if (firstNum > secondNum) System.out.println("The largest number is: " + firstNum);
        else if (firstNum < secondNum) System.out.println("The largest number is: " + secondNum);
        else System.out.println("The numbers are equal");
    }
}
