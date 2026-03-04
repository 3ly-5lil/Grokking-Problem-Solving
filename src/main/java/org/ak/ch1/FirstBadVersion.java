package org.ak.ch1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstBadVersion {
    @Test
    void test() {
        VersionControl.bad = 1702766719;
        int firstBad = new Solution().firstBadVersion(2126753390);

        assertEquals(VersionControl.bad, firstBad);
    }

    class VersionControl {
        public static int bad = -99999;

        boolean isBadVersion(int n) {
            return n >= bad;
        }
    }

    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int s = 0, e = n;

            while (s < e) {
                int m = (e - s) / 2 + s;


                if (isBadVersion(m)) {
                    e = m;
                } else {
                    s = m + 1;
                }
            }
            return s;
        }
    }
}
