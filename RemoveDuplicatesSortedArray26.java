package org.example;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray26 {
    public static void main(String[] args) {
        RemoveDuplicatesSortedArray26 solution = new RemoveDuplicatesSortedArray26();

        int[] a = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = solution.removeDuplicates(a);
        System.out.println(k);

    }


    public int removeDuplicates(int[] nums) {

        int k = 1;
        int val = nums[0]; // store first

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[k] = nums[i];
                val = nums[i];
                k++;
            }

        }

        System.out.println(Arrays.toString(nums));
        return k;
    }
}
