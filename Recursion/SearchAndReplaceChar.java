import java.util.Scanner;

public class SearchAndReplaceChar {

    public static String replaceChar(String str, Character c1, Character c2, String rep_str, int i, int len) {
        // Base condition
        if (i == len) {
            return rep_str;
        }

        // Processing Logic
        if (str.charAt(i) == c1) {
            rep_str = rep_str + c2;
        } else {
            rep_str = rep_str + str.charAt(i);
        }
        i++;
        String res = replaceChar(str, c1, c2, rep_str, i, len);

        return res;
    }

    public static void main(String[] args) {
        Character c1, c2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        System.out.print("Enter char to be replace from string: ");
        c1 = sc.next().charAt(0);

        System.out.print("Enter new char: ");
        c2 = sc.next().charAt(0);

        String new_str = replaceChar(str, c1, c2, "", 0, str.length());
        System.out.println(new_str);

        sc.close();
    }

}
