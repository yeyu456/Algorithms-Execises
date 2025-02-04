package com.algorithms.search.bitonic;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Test with brute force search Implement
 * 暴力搜索测试
 */
public class BitonicBruteForceSearch {

    @Test
    public void bruteForceSearch() {
        int len = BitonicSearchTestSuite.NUM.length;
        int searchIndex = BitonicSearch.bruteForceSearch(Arrays.copyOf(BitonicSearchTestSuite.NUM, len),
                BitonicSearchTestSuite.SEARCH_NUM);
        Assert.assertNotEquals(searchIndex, -1);
    }
}
