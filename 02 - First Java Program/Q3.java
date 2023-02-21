import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        /* Write a program to input
        principal, time, and rate (P, T, R) from the user and find Simple Interest. */
        Scanner sc = new Scanner(System.in);
        double principle = sc.nextDouble(), rate = sc.nextDouble();
        int time = sc.nextInt();

        double SI = principle * time * rate;
        System.out.println("Simple interest is: " + SI);
    }
}
