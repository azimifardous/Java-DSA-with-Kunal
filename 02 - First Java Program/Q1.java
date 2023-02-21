import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Write a program to print whether a number is even or odd, also take input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Let's check this given number whether it's even or odd
        if (num % 2 == 0) System.out.println("The number is even.");
        else System.out.println("The number is odd.");
    }
}
