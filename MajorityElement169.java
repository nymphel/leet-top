package org.example;

import java.util.Arrays;

public class MajorityElement169 {

    public static void main(String[] args) {
        int[] nums1 = {2,2,1,1,1,2,2}; //2
        int[] nums2 = {3,2,3}; //3
        System.out.println(new MajorityElement169().majorityElement(nums1));
        System.out.println(new MajorityElement169().majorityElement(nums2));
    }

    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        int currentNum = nums[0];
        int currentNumOccurrence = 1;
        int majorityNum = currentNum;
        int majorityOccurrence = 1;
        for (int i = 1; i < nums.length; i++) {
            if(currentNum == nums[i]) {
                currentNumOccurrence++;
            } else {
                currentNum = nums[i];
                currentNumOccurrence = 1;
            }

            if(currentNumOccurrence > majorityOccurrence) {
                majorityOccurrence = currentNumOccurrence;
                majorityNum = currentNum;
            }
        }

        return majorityNum;
    }
}
