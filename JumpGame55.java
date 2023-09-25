package org.example;

public class JumpGame55 {
    public static void main(String[] args) {
        JumpGame55 solution = new JumpGame55();

        int[] a = new int[]{2, 3, 1, 1, 4};

        System.out.println(solution.canJump(a) ? "OK" : "NOK"); // true

        int[] b = new int[]{3, 2, 1, 0, 4};
        System.out.println(solution.canJump(b) ? "NOK" : "OK"); // false

        int[] c = new int[]{2, 5, 0, 0};
        System.out.println(solution.canJump(c) ? "OK" : "NOK"); // true

        int[] d = new int[]{2, 1, 0, 0, 4};
        System.out.println(solution.canJump(d) ? "NOK" : "OK"); // false

        int[] e = new int[]{0, 1};
        System.out.println(solution.canJump(e) ? "NOK" : "OK"); // false

        int[] f = new int[]{0};
        System.out.println(solution.canJump(f) ? "OK" : "NOK"); // true

        int[] g = new int[]{2, 0};
        System.out.println(solution.canJump(g) ? "OK" : "NOK"); // true

        int[] h = new int[]{2, 0, 1, 0, 4, 0, 0, 0, 1, 0, 0, 1};
        System.out.println(solution.canJump(h) ? "NOK" : "OK"); // false

        int[] j = new int[]{2, 0, 0};
        System.out.println(solution.canJump(j) ? "OK" : "NOK"); // true

    }


    public boolean canJump(int[] nums) {
        if (nums.length == 1)
            return true;

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) { // we reached our destination
                return true;
            }

            if (nums[i] > nums.length - i) {
                return true;
            }

            //find consecutive zeros
            if (nums[i] == 0) {

                int currentZeroIndex = i;
                boolean keepGoing = true;
                while (keepGoing) {
                    currentZeroIndex++;
                    keepGoing = (currentZeroIndex < nums.length) && nums[currentZeroIndex] == 0;
                }

                int consecutiveZeroCount = currentZeroIndex - i;

                boolean canJump = false;
                boolean finalBatch = (i + consecutiveZeroCount) == nums.length;
                for (int j = i - 1, k = 0; j >= 0; j--, k++) {
                    if (finalBatch) {
                        if (nums[j] >= consecutiveZeroCount + k) { // greater than equals (final index will be count)
                            canJump = true;
                        }
                    } else {
                        if (nums[j] > consecutiveZeroCount + k) { // greater thab
                            canJump = true;
                        }
                    }


                }
                if (!canJump)
                    return false;

            }
        }

        return false;
    }
}
