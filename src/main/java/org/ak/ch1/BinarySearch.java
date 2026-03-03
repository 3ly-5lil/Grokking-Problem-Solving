package org.ak.ch1;

import org.junit.jupiter.api.Test;

public class BinarySearch {

        @Test
        void test() {
            int[] nums = {-1,0,3,5,9,12};
            int target = 2;
            int result = new Solution().search(nums, target);
            System.out.println(result);
        }

        class Solution {
            public int search(int[] nums, int target) {

                int sIndex = 0;
                int eIndex = nums.length - 1;

                while (sIndex <= eIndex) {
                    int mIndex = (sIndex + eIndex) / 2;

                    if (nums[mIndex] == target) {
                        return mIndex;
                    }

                    if (nums[mIndex] < target) {
                        sIndex = mIndex + 1;
                    } else {
                        eIndex = mIndex - 1;
                    }
                }

                return -1;
            }
        }

}
