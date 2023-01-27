import java.util.Scanner;

public class IsArraySorted_Increasing {

    public static boolean checkSorted(int[] arr, int len, int prev, int n, boolean b) {
        if (n < len) {
            if (prev <= arr[n]) {
                prev = arr[n];
            } else {
                b = false;
            }
            n++;

            boolean res = checkSorted(arr, len, prev, n, b);
            if (!res) {
                b = false;
            }
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int prev = arr[0];
        int n = 1;
        boolean b = checkSorted(arr, size, prev, n, true);
        if (b) {
            System.out.print("Array Sorted");
        } else {
            System.out.print("Array Not Sorted");
        }
        sc.close();
    }

}
