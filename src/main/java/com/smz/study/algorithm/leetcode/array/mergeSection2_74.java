package com.smz.study.algorithm.leetcode.array;

import com.smz.study.algorithm.template.InitCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: 司马钊
 * @Date: Created in 2022/3/20 3:44 下午
 * @Description: 功能:
 */
public class mergeSection2_74 {
    public static void main(String[] args) {
        int[][] enter = {{1,3},{2,6},{8,10},{15,18}};
        InitCollection.printArray3(merge(enter));
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {     // 升序最快O(nlogn),n为元素的数量，即区间的数量
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });
        List<int[]> merged = new ArrayList<int[]>();
        for (int i = 0; i < intervals.length; ++i) {
            int L = intervals[i][0], R = intervals[i][1];
            if (merged.size() == 0 || merged.get(merged.size() - 1)[1] < L) {
                merged.add(new int[]{L, R});
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], R);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

}
