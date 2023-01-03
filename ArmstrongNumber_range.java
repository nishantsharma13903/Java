package AS_Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber_range {

    public static ArrayList<Integer> armstrongList(int start, int end, ArrayList<Integer> list) {
        // Base condition
        if (start == end) {
            return list;
        }

        // Processing logic
        int dc = countDigit(start, 0);
        boolean b = checkArmstrong(start, start, 0, dc);
        if (b) {
            list.add(start);
        }
        start++;
        ArrayList<Integer> res_li = armstrongList(start, end, list);

        return res_li;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 1, end;
        System.out.print("Enter End Point: ");
        end = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<Integer>();

        System.out.println("Possible Armstrong Numbers between " + start + " and " + end + " are:  "
                + armstrongList(start, end, li));

        sc.close();
    }
}
