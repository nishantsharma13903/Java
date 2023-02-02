import java.util.Scanner;

public class Linear_Search {

    public static int linearSearch(int[] arr, int len, int item) {
        for (int i = 0; i < len; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the item to be searched: ");
        int item = sc.nextInt();

        int ind = linearSearch(arr, n, item);

        if (ind == -1) {
            System.out.println("Element Not found in array");
        } else {
            System.out.println("Element found at index : " + ind);
        }
        sc.close();
    }

}
