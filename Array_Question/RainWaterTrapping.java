package Array_Question;

import java.util.Scanner;

public class RainWaterTrapping {

    static int rainWaterTrapping(int[] height){
        int[] pre_max = new int[height.length];
        int[] suf_max = new int[height.length];
        int current,total = 0;

        // Prefix Max
        pre_max[0] = height[0];
        for(int i = 1; i < height.length; i++){
            if(height[i] > pre_max[i-1]){
                pre_max[i] = height[i];
            }
            else{
                pre_max[i] = pre_max[i-1];
            }
        }

        // suffix Max
        suf_max[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--){
            if(height[i] > suf_max[i+1]){
                suf_max[i] = height[i];
            }
            else{
                suf_max[i] = suf_max[i+1];
            }
        }

        for(int i = 0; i < height.length ; i++){
            current = height[i];
            int x = Math.min(pre_max[i],suf_max[i]);
            if(x > current){
                total += (x-current);
            }
        }

        return total;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.print("Enter the heights : ");
        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }

        int total = rainWaterTrapping(height);
        System.out.println("Total unit of water that can trap is : " + total);

        sc.close();
    }

}