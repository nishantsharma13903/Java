package Array_Question;

import java.util.Scanner;

class Second_Max_Array{

    static int findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE, sec_max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++){
            if(max < arr[i]){
                sec_max = max;
                max = arr[i];
            }
            else if(max != arr[i] && sec_max < arr[i]){
                sec_max = arr[i];
            }
        }

        return sec_max;
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

        int sec_max = findSecondMax(arr);

        if(sec_max == Integer.MIN_VALUE){
            System.out.println("Second element not present in array.");
        }
        else{
            System.out.println("Second Maximum Element in Array is: " + sec_max);
        }

        sc.close();
    }

}
