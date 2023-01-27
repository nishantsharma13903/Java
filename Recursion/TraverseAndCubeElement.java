import java.util.ArrayList;
import java.util.Scanner;

public class TraverseAndCubeElement {

    public static ArrayList<Integer> cubeList(int[] arr, int i) {
        // Base condition
        if (i == -1) {
            ArrayList<Integer> list = new ArrayList<>();
            return list;
        }
        ;

        // Processing logic
        int cube = (int) Math.pow(arr[i], 3);
        i--;
        ArrayList<Integer> list = cubeList(arr, i);
        list.add(cube);

        return list;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the size of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> new_list = cubeList(arr, arr.length - 1);

        System.out.println(new_list);

        sc.close();

    }

}
