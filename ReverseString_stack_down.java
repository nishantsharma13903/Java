import java.util.Scanner;

public class ReverseString_stack_down {

    public static String reverseString(String str, String rev, int i, int len) {

        // bAse condition
        if (i == len - 1) {
            return rev;
        }

        // Processing Logic
        i++;
        rev = reverseString(str, rev, i, len);
        rev = rev + str.charAt(i);

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String which is to be reversed: ");
        String str = sc.nextLine();

        String rev_str = reverseString(str, "", -1, str.length());

        System.out.println(rev_str);

        sc.close();
    }

}
