import java.util.Scanner;

public class IntegerReverse_return {

    public static int reverseReturn(int n, int rev) {

        if (n == 0) {
            return rev;
        }

        rev = rev * 10 + n % 10;
        n = n / 10;
        int res = reverseReturn(n, rev);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number Which is to reversed: ");
        int n = sc.nextInt();
        int res = reverseReturn(n, 0);
        System.out.print("Reverse Number: " + res);
        sc.close();
    }
}
