import java.util.ArrayList;
import java.util.Scanner;

public class Naive_string_matching_recursion {

    public static ArrayList<Integer> getOccurence(String text, String pattern, int n, int m, int i,
            ArrayList<Integer> findIndex) {
        // base condition
        if (i == (n - m + 1)) {
            return findIndex;
        }

        // Logic
        int p = i, q = 0;
        while (text.charAt(p) == pattern.charAt(q)) {
            p++;
            q++;
            if (q == m) {
                findIndex.add(i);
                break;
            }
        }
        return getOccurence(text, pattern, n, m, ++i, findIndex);

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
        ArrayList<Integer> findIndex = new ArrayList<>();

        if (pattern != "") {
            occurence = getOccurence(text, pattern, n, m, 0, findIndex);
        }

        if (!occurence.isEmpty()) {
            System.out.print(pattern + " Found at index: ");
            for (int val : occurence) {
                System.out.print(val + "  ");
            }
        } else {
            System.out.println(pattern + " not found in " + text);
        }

        sc.close();
    }

}
