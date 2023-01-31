import java.util.Scanner;

public class Incresing_number_pattern {
    static int k1 = 0;
    static int k2;

    static void printUpperNumber(int rowcount, int n) {
        // Base Condition
        if (rowcount == 0) {
            k2 = (n * (n + 1)) / 2 - n - 1;
            return;
        }

        // Processing logic
        System.out.print(k1 + " ");
        k1++;
        rowcount--;
        printUpperNumber(rowcount, n);

    }

    static void printLowerNumber(int rowcount) {
        // Base Condition
        if (rowcount == 0) {
            return;
        }

        // Processing logic
        System.out.print(k2 + " ");
        k2--;
        rowcount--;
        printLowerNumber(rowcount);

    }

    static void upperTriangle(int n, int i, int rowcount) {
        // Base Condition
        if (i == n) {
            return;
        }

        // Processing logic
        printUpperNumber(rowcount, n);
        System.out.println();
        i++;
        rowcount++;
        upperTriangle(n, i, rowcount);

    }

    static void lowerTriangle(int n, int i, int rowcount) {
        // Base Condition
        if (i == n) {
            return;
        }

        // Processing Logic
        printLowerNumber(rowcount);
        System.out.println();
        i++;
        rowcount--;
        lowerTriangle(n, i, rowcount);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        upperTriangle(n, 0, 1);
        lowerTriangle(n - 1, 0, n - 1);

        sc.close();
    }

}
