import java.util.Scanner;

public class Sort_Zero_One {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        System.out.print("Enter 0 and 1 element of Array:");
        int[] arr = new int[n];
        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }
        int p = 0,q = arr.length-1,temp;

        while(p<q){
            if(arr[p] == 0){
                p++;
            }
            else{
                if(arr[q] == 0){
                    temp = arr[p];
                    arr[p] = arr[q];
                    arr[q] = temp; 
                }
                q--;
            }
        }

        System.out.print("Sorted Array is : ");
        for(int i = 0; i<arr.length;i++ ){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

}
