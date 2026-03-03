package org.ak.ch1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInsert {
    @Test
    void test() {
        int[] nums = {
                1, 3, 5, 6
        };
        int target = 2;
        assertEquals(new Solution().searchInsert(nums, target), 1);
    }

    class Solution {
        public int searchInsert(int[] nums, int target) {
            int s = 0;
            int e = nums.length - 1;

            while (s <= e) {
                int m = (s + e) / 2;

                if (nums[m] == target) {
                    return m;
                }

                if (nums[m] > target) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
            return s;
        }
    }
}
