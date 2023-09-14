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
        int[] unique = new int[nums.length];

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 == nums.length) { //not the last one
                unique[k] = nums[i];
                k++;
            } else {
                if (nums[i] != nums[i + 1]) {
                    unique[k] = nums[i];
                    k++;
                }
            }

            nums[i] = 0;
        }

        for (int i = 0; i < unique.length; i++) {
            nums[i] = unique[i];
        }

        System.out.println(Arrays.toString(nums));
        return k;
    }
}
