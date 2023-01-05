public class CheckPowerOfTwo {

    static boolean checkNumber(int n, int i) {

        int num = (int) Math.pow(2, i);
        if (n == num) {
            return true;
        }
        if (n < num) {
            return false;
        }
        i++;
        return checkNumber(n, i);
    }

    public static void main(String[] args) {
        int n = 102;
        System.out.println(checkNumber(n, 1));
    }

}
