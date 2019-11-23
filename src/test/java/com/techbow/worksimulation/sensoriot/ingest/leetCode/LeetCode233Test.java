package com.techbow.worksimulation.sensoriot.ingest.leetCode;

import org.junit.Before;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

class LeetCode233Test {
    private LeetCode233 lc233 = new LeetCode233();

    @Before
    public void init(){
        //lc233= new LeetCode233();
    }

    @Test
    public void testcountDigitOne(){

        int testCase1 = 10;
        //mokito
        when(lc233.countDigitOne(anyInt())).thenReturn(233);
        //
        int res = lc233.countDigitOne(testCase1);

        int expectation = 2;
        assertEquals(res, expectation);
    }
}