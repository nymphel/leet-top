package org.example;

import java.util.Arrays;

public class RotateArray189 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        new RotateArray189().rotate(nums, 3);
        System.out.println(Arrays.toString(nums));

        int[] numsA = {-1,-100,3,99};
        new RotateArray189().rotate(numsA, 2);
        System.out.println(Arrays.toString(numsA));

        int[] numsB = {-1};
        new RotateArray189().rotate(numsB, 2);
        System.out.println(Arrays.toString(numsB));

        int[] numsC = {1, 2};
        new RotateArray189().rotate(numsC, 3);
        System.out.println(Arrays.toString(numsC));

        int[] numsD = {1,2,3,4,5,6};
        new RotateArray189().rotate(numsD, 11);
        System.out.println(Arrays.toString(numsD));

        int[] numsE = {1,2,3};
        new RotateArray189().rotate(numsE, 4);
        System.out.println(Arrays.toString(numsE));

        /*  [5, 6, 7, 1, 2, 3, 4]
            [3, 99, -1, -100]
            [-1]
            [2, 1]
            [2, 3, 4, 5, 6, 1]
            [3, 1, 2] */

    }

    public void rotate(int[] nums, int k) {
        if(k > nums.length)
            k = k % nums.length;

        int[] part = new int[k];

        for (int i = 0; i < k; i++) {
            part[i] = nums[nums.length-k+i]; //5,6,7
        }

        for (int i = nums.length-1; i >= k; i--) {
            nums[i] = nums[i-k]; // shift -,-,-,1,2,3,4
        }

        for(int i = 0; i < part.length; i++) {
            nums[i] = part[i]; // fill first part 5,6,7,1,2,3,4
        }
    }
}
