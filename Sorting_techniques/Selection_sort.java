import java.util.Scanner;

public class Selection_sort {

    public static void selectionSort(int[] arr, int n) {
        int temp, ind;
        for (int i = 0; i < n - 1; i++) {
            ind = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[ind] > arr[j]) {
                    ind = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[ind];
            arr[ind] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Elements Of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr, n);

        System.out.print("Sorted Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

}
