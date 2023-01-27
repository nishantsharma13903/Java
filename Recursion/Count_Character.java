import java.util.Scanner;

public class SearchAndFrequencyOfCharacter {

    public static int freqOfChar(String str, Character c, int i, int count) {
        // Base condition
        if (i == -1) {
            return count;
        }

        // Processing Logic
        if (str.charAt(i) == c) {
            count++;
        }
        i--;
        return freqOfChar(str, c, i, count);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String str = sc.nextLine();
        Character c;
        System.out.print("Enter Character: ");
        c = sc.next().charAt(0);

        int count = freqOfChar(str, c, str.length() - 1, 0);

        System.out.println("Total Count: " + count);

        sc.close();

    }

}
