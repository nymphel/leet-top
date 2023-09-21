package org.example;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray80 {
    public static void main(String[] args) {
        RemoveDuplicatesSortedArray80 solution = new RemoveDuplicatesSortedArray80();

        int[] a = new int[]{0,0,1,1,1,1,2,2,2,2,3,3}; // -> [0,0,1,1,2,3,3,_,_] 7
        int k = solution.removeDuplicates(a);
        System.out.println(k);

        int[] b = new int[]{1,1,1,2,2,3};
        int kb = solution.removeDuplicates(b); // -> [1,1,2,2,3] 5
        System.out.println(kb);

    }


    public int removeDuplicates(int[] nums) {

        int k = 1;
        int val = nums[0]; // store first
        boolean duplicatedOnce = false;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != val || (nums[i] == nums[i-1] && !duplicatedOnce)) {

                if(nums[i] != val) {
                    duplicatedOnce = false;
                }

                if(nums[i] == nums[i-1] && !duplicatedOnce) {
                    duplicatedOnce = true;
                }

                nums[k] = nums[i];
                val = nums[i];
                k++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return k;
    }
}
