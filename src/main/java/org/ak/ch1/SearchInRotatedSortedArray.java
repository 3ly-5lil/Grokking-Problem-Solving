package org.ak.ch1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInRotatedSortedArray {
    @Test
    void test() {
        int[] nums = {5, 1, 3};
        int target = 3;

        int actual = new Solution().search(nums, target);
        int expected = 2;
        assertEquals(expected, actual);
    }

    class Solution {
        public int search(int[] nums, int target) {
            int l = 0, r = nums.length - 1;

            while (l <= r) {
                int m = l + (r - l) / 2;

                if (nums[m] == target)
                    return m;

                if (nums[m] >= nums[l]) {
                    if (target >= nums[l] && target < nums[m]) {
                        r = m - 1;
                    } else {
                        l = m + 1;
                    }
                } else {
                    if (target <= nums[r] && target > nums[m]) {
                        l = m + 1;
                    } else {
                        r = m - 1;
                    }
                }

            }
            return -1;
        }
    }
}
