import java.util.Scanner;

public class Insertion_sort {

    public static void insertionSort(int[] arr, int n) {
        int j, key;
        for (int i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
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

        insertionSort(arr, n);

        System.out.print("Sorted Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

}
