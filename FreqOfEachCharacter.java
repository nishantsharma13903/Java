import java.util.HashMap;
import java.util.Scanner;

public class FreqOfEachCharacter {

    public static HashMap<Character, Integer> charFrequency(String str, int i) {
        if (i == 0) {
            HashMap<Character, Integer> hashmap = new HashMap<>();
            return hashmap;
        }

        // Processing Logic
        i--;
        HashMap<Character, Integer> res = charFrequency(str, i);
        Character ch = str.charAt(i);
        if (res.get(ch) == null) {
            res.put(ch, 1);
        } else {
            int count = res.get(ch);
            count++;
            res.put(ch, count);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        HashMap<Character, Integer> hashmap = new HashMap<>();

        hashmap = charFrequency(str, str.length());

        System.out.println(hashmap);

        sc.close();
    }

}
