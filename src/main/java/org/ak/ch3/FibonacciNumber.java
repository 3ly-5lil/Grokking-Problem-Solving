package org.ak.ch3;

public class FibonacciNumber {
    class Solution {
        public int loop(int n) {
            if (n == 0) return 0;
            int prev = 1, prev2 = 0;

            for (int i = 1; i < n; i++) {
                int tmp = prev;
                prev += prev2;
                prev2 = tmp;
            }

            return prev;
        }

        public int recursion(int n) {
            if (n == 0) return 0;
            if (n == 1) return 1;
            return recursion(n - 1) + recursion(n - 2);
        }
    }
}
