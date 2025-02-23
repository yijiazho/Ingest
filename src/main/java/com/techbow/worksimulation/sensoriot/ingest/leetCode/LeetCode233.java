package com.techbow.worksimulation.sensoriot.ingest.leetCode;

import java.util.concurrent.atomic.AtomicInteger;
////////
public class LeetCode233 {
    public int countDigitOne(int n) {
        int ones = 0;
        for (long m = 1; m <= n; m *= 10)
            ones += (n/m + 8) / 10 * m + (n/m % 10 == 1 ? n%m + 1 : 0);
        return ones;
    }
}
