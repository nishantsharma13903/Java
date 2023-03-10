package Array_Question;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove_duplicate_sorted_array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of Array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int p=0;
        ArrayList<Integer> res_arr = new ArrayList<Integer>();

        for(int i=0;i<arr.length; i++){
            if(arr[i] != arr[p]){
                res_arr.add(arr[p]);
                p = i;
            }
        }
        res_arr.add(arr[arr.length -1]);
        System.out.println(res_arr);

        sc.close();
    }

}
