import java.util.Scanner;

public class RotateByK {

    static int[] reverseArray(int[] arr,int m, int n){
        int p=m,q=n,temp;
        while(p<q){
            temp = arr[p];
            arr[p] = arr[q];
            arr[q] = temp;
            p++;
            q--;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of Array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k Value: ");
        int k = sc.nextInt();

        arr = reverseArray(arr,0, n-k-1);
        arr = reverseArray(arr,n-k, n-1);
        arr = reverseArray(arr,0, n-1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

}
