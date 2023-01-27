import java.util.ArrayList;
import java.util.Scanner;

public class Naive_string_matching_recursion_stackdown {

    public static ArrayList<Integer> getOccurence(String text, String pattern, int n, int m, int i) {
        // Base condition
        if (i == (n - m + 1)) {
            ArrayList<Integer> findIndex = new ArrayList<>();
            return findIndex;
        }

        // Logic
        ArrayList<Integer> res_list = getOccurence(text, pattern, n, m, ++i);
        int p = --i, q = 0;
        while (text.charAt(p) == pattern.charAt(q)) {
            p++;
            q++;
            if (q == m) {
                res_list.add(i);
                break;
            }
        }

        return res_list;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text : ");
        String text = sc.nextLine();
        System.out.print("Enter the pattern you want to find in text: ");
        String pattern = sc.nextLine();
        int m, n;
        n = text.length();
        m = pattern.length();
        ArrayList<Integer> occurence = new ArrayList<>();

        if (pattern != "") {
            occurence = getOccurence(text, pattern, n, m, 0);
        }

        if (occurence.isEmpty()) {
            System.out.println("'" + pattern + "' not found in '" + text + "'");
        } else {
            System.out.print("'" + pattern + "' found at index : ");
            for (int val : occurence) {
                System.out.print(val + " ");
            }
        }

        sc.close();

    }

}
