// Find the pair sum (which is equal to given number )in a array.

import java.util.Scanner;
import java.util.HashMap;

public class PairSum {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Size of Array: ");
            int n = sc.nextInt();
            System.out.print("Enter the elements of Array: ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the sum: ");
            int k = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
            int i;
            for(i = 0;i < arr.length; i++){
                int m = k - arr[i];
                if(map.get(m) == null){
                    map.put(arr[i], i);
                }
                else{
                    int ind = map.get(m);
                    System.out.println(i + " , " + ind);
                }
            }
            if(map.size() == arr.length){
                System.out.println("No Pair Is Present");
            }
            sc.close();
        }

    }

}
