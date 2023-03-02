import java.util.Scanner;

public class Is_Array_Sorted {

    static boolean isArraySorted(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            if (arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
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

        boolean b = isArraySorted(arr);

        if(b){
            System.out.println("Sorted Array");
        }
        else{
            System.out.println("Unsorted Array");
        }

        sc.close();
    }

}
