import java.util.Scanner;

public class Pattern_FullTriangle {

    public static void displayLine(int n) {
        // Base condition
        if (n == 0) {
            return;
        }

        // Processing logic
        System.out.print("* ");
        displayLine(n - 1);
    }

    public static void displaySpace(int n) {
        // Base condition
        if (n == 0) {
            return;
        }

        // Processing logic
        System.out.print("  ");
        displaySpace(n - 1);
    }

    public static void displayTriangle(int n, int num) {
        // Base Condition
        if (num > n) {
            return;
        }

        // Processing Logic
        displaySpace(n - num);
        displayLine(2 * num - 1);
        System.out.println(" ");
        num++;
        displayTriangle(n, num);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows of triangle: ");
        int n = sc.nextInt();
        displayTriangle(n, 1);
        sc.close();
    }
}