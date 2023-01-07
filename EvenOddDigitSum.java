public class EvenOddDigitSum {

    public static int digitCount(int n, int count) {
        if (n == 0) {
            return count;
        }

        n = n / 10;
        count++;
        int res = digitCount(n, count);
        return res;
    }

    public static int[] OddEvenSumArray(int[] arr, int n, int dc) {
        if (n == 0) {
            return arr;
        }
        // Processing logic
        int rem = n % 10;
        n = n / 10;
        dc--;
        int[] res_arr = OddEvenSumArray(arr, n, dc);
        if ((dc) % 2 == 1) {
            arr[0] += rem;
        } else {
            arr[1] += rem;
        }

        return res_arr;
    }

    public static void main(String[] args) {
        int n = 67510;

        int dc = digitCount(n, 0);

        int[] a = { 0, 0 };

        int[] arr = OddEvenSumArray(a, n, dc + 1);

        System.out.println("Odd place sum: " + arr[0]);
        System.out.println("Even place sum: " + arr[1]);

    }

}
