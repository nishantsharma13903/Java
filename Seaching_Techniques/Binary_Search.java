import java.util.Scanner;

public class Binary_Search {

    // Iteration Method
    public static int binarySearch(int[] arr, int len, int item) {
        int beg = 0, end = len - 1;
        int mid = (beg + end) / 2;

        while (beg <= end) {
            if (item == arr[mid]) {
                return mid;
            }
            if (item > arr[mid]) {
                beg = mid + 1;
            }
            if (item < arr[mid]) {
                end = mid - 1;
            }

            // Calculate mid index
            mid = (beg + end) / 2;
        }
        // binarySearch function return -1 when beg becomes greater than end.
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array in sorted(ascending) order: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter item to be search in array: ");
        int item = sc.nextInt();

        int ind = binarySearch(arr, n, item);

        if (ind == -1) {
            System.out.println(item + " is not found in array.");
        } else {
            System.out.println(item + " found at index: " + ind);
        }

        sc.close();
    }

}
