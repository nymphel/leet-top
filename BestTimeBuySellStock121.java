package org.example;

public class BestTimeBuySellStock121 {

    public static void main(String[] args) {
        int[] nums1 = {7,1,5,3,6,4}; // 6-1=5
        int[] nums2 = {7,6,4,3,1}; //0
        int[] nums3 = {7,3,15,4,3,1,8,9}; //12
        System.out.println(new BestTimeBuySellStock121().maxProfit(nums1));
        System.out.println(new BestTimeBuySellStock121().maxProfit(nums2));
        System.out.println(new BestTimeBuySellStock121().maxProfit(nums3));
    }

    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int profit;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            }

            profit = prices[i] - min;
            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }


        return maxProfit;
    }
}
