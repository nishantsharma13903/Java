import java.util.Scanner;

public class Binary_Search_Recursion {

    public static int binarySearch(int[] arr, int beg, int end, int item) {

        if (beg <= end) {
            int mid = (end + beg) / 2;
            if (item == arr[mid]) {
                return mid;
            }
            if (item < arr[mid]) {
                end = mid - 1;
                return binarySearch(arr, beg, end, item);
            }
            if (item > arr[mid]) {
                beg = mid + 1;
                return binarySearch(arr, beg, end, item);
            }
        }
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

        int ind = binarySearch(arr, 0, (n - 1), item);

        if (ind == -1) {
            System.out.println(item + " is not found in array.");
        } else {
            System.out.println(item + " found at index: " + ind);
        }

        sc.close();
    }

}
