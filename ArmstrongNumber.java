import java.util.Scanner;

public class ArmstrongNumber {

    public static int power(int a, int b, int num) {
        // Base Condition
        if (b == 1) {
            return a;
        }

        // Processing logic
        a = a * num;
        b--;
        int res = power(a, b, num);

        // return to previous function.
        return res;
    }

    public static int countDigit(int n, int count) {
        // Base condition
        if (n == 0) {
            return count;
        }

        // Processing logic
        n = n / 10;
        count++;
        int res = countDigit(n, count);

        return res;
    }

    public static boolean checkArmstrong(int n, int num, int sum, int digitcount) {
        // Base Condition
        if (n == 0) {
            if (num == sum) {
                return true;
            } else {
                return false;
            }
        }

        // Processing logic
        int rem = n % 10;
        sum = sum + power(rem, digitcount, rem);
        n = n / 10;
        boolean b = checkArmstrong(n, num, sum, digitcount);
        return b;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        int num = n;
        int sum = 0;

        int digitcount = countDigit(n, 0);
        boolean b = checkArmstrong(n, num, sum, digitcount);

        if (b) {
            System.out.println("Number is Armstrong.");
        } else {
            System.out.println("Not Armstrong Number.");
        }

        sc.close();
    }

}
