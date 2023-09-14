package org.example;

import java.util.Arrays;

public class MergeSortedArray88 {
    public static void main(String[] args) {

        MergeSortedArray88 solution = new MergeSortedArray88();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[i - n];
        }

        Arrays.sort(nums1);

    }
}