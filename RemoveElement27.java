package org.example;

import java.util.Arrays;

public class RemoveElement27 {

    public static void main(String[] args) {
        RemoveElement27 solution = new RemoveElement27();

        int[] a = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int k = solution.removeElement(a, 2);
        System.out.println(k);

    }


    public int removeElement(int[] nums, int val) {

        int[] removed = new int[nums.length];

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                removed[k] = nums[i];
                k++;
            }
        }

        if(k > 0) {
            for (int i = k - 1; i < k; i++) {
                nums[i] = 0;
            }
        }

        for (int i = 0; i < removed.length; i++) {
            nums[i] = removed[i];
        }

        System.out.println(Arrays.toString(nums));

        return k;
    }
}
