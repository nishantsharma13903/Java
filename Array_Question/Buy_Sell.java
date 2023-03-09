package Array_Question;

import java.util.Scanner;

public class Buy_Sell {

    static int buySell(int[] prices){
        int[] pre_min = new int[prices.length];
        int[] profit = new int[prices.length];
        int max_profit;
        pre_min[0] = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < pre_min[i-1]){
                pre_min[i] = prices[i];
            }
            else{
                pre_min[i] = pre_min[i-1];
            }
        }

        max_profit = profit[0];
        for(int i=0; i<prices.length ; i++){
            profit[i] = prices[i] - pre_min[i];
            if(profit[i] > max_profit){
                max_profit = profit[i];
            }
        }
        return max_profit;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.print("Enter the elements of array : ");
        for(int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
        }
        int max_profit = buySell(prices);
        System.out.println("Maximum Profit is : " + max_profit);

        sc.close();
    }

}
