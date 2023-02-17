// This is a program which remove the redundant space from left and right of the given string.

import java.util.Scanner;

public class TrimSpaces {

    static String trim(String str) {
        String trim_str = "";
        int i, j;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                break;
            }
        }

        for (j = str.length() - 1; j >= 0; j--) {
            if (str.charAt(j) != ' ') {
                break;
            }
        }

        for (int k = i; k <= j; k++) {
            trim_str += str.charAt(k);
        }

        return trim_str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String res_str = trim(str);
        System.out.println("Trimmed String is: " + res_str);
        sc.close();
    }

}
