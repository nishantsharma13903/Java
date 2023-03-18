package Array_Question;

import java.util.Scanner;

public class Missing_element {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of Array: ");
        int[] arr = new int[n];
        int sum=0,total=0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        for(int i = 0; i<=n ; i++){
            total = total + i;
        }

        System.out.println("Missing Number is: " + (total - sum));


        sc.close();
    }

}
