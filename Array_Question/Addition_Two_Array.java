import java.util.Scanner;

public class Addition_Two_Array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr1 = {1,2,3,4,6};
        int[] arr2 = {5,6,7,8};
        int max_len = (arr1.length > arr2.length) ? arr1.length : arr2.length ;
        int carry = 0,p=arr1.length-1,q=arr2.length-1,sum=0;
        int[] res_arr = new int[max_len];

        for(int i=max_len-1;i>=0;i--){
            if(p>=0 && q>=0){
                sum = arr1[p] + arr2[q] + carry;
            }
            else if(p<0){
                sum = arr2[q] + carry;
            }
            else if(q<0){
                sum = arr1[p] + carry;
            }
            System.out.println(sum);
            res_arr[i] = sum%10;
            carry = sum / 10;
            p--;
            q--;
        }
        System.out.print(carry + " ");
        for(int i=0;i<res_arr.length;i++){
            System.out.print(res_arr[i] + " ");
        }

        sc.close();
    }

}
