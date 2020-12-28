package Java16;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Solution {
    // 求使得优势最大A数组排列
    public static int[] func(int[] A, int[] B) {
        // 特殊情况处理
        if (A == null || B == null) {
            return null;
        }
        if (A.length != B.length) {
            return null;
        }
        // 正常情况下处理逻辑
        int[] AA = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            // 拿到B中的数字，去A中找比他大的数字中最小的那个数字(为B中每一个找)
            int tmp = B[i];
            // 标记最小的那个数字的下标
            int minOfMaxLList = Integer.MIN_VALUE;
            for (int j = 0; j < A.length; j++) {
                if (minOfMaxLList == Integer.MIN_VALUE) {
                    if (tmp < A[j]) {
                        minOfMaxLList = j;
                    }
                } else {
                    if (A[minOfMaxLList] > tmp && A[j] > tmp && A[j] < A[minOfMaxLList]) {
                        minOfMaxLList = j;
                    }
                }
            }
            AA[i] = A[minOfMaxLList];
        }
        return AA;
    }

    public static void main(String[] args) {
        int[] A = {2, 7, 11, 15};
        int[] B = {1, 10, 4, 11};
        int[] ints = func(A, B);
        System.out.println(Arrays.toString(ints));
    }
}
