import java.util.Scanner;

class Find_span{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of Array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int span = findSpan(arr);

        System.out.println("Span of array is: " + span);

        sc.close();
    }

    private static int findSpan(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for(int i = 0;i<arr.length; i ++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }

        }
        return (max - min);
    }

}
