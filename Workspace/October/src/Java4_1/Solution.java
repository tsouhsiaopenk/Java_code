package Java4_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // 数组排队员工个数
//        int n = scanner.nextInt();
//        // 建立数组存放员工信息，并接受输入的数据
//        int[][] arr = new int[n][3];
//        for (int i = 0; i < n; i++) {
//            // 按行读取
//            String tmp = scanner.nextLine();
//            String[] strings = tmp.split(",");
//            for (int j = 0; j < 3; j++) {
//                arr[i][j] = Integer.parseInt(strings[j]);
//            }
//        }
        int[][] arr = {
                {1,175,0},
                {2,171,0},
                {3,172,1},
                {4,172,1},
                {5,174,0},
                {6,171,1},
                {7,168,0},
        };
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 先比较性别
                if (o1[2] == o2[2]) {
                    // 同性别看身高,身高小的在前边
                    if (o1[1] > o2[1]) {
                        return 1;
                    } else if (o1[1] < o2[1]) {
                        return -1;
                    } else {
                        // 相同身高看编号，编号唯一，谁编号小，谁在前边
                        return o1[0] > o2[0] ? 1 : -1;
                    }
                } else { // 不同性别女生排在前边 女生0 男生1
                    return o1[2] > o2[2] ? 1 : -1;
                }
            }
        });

        for (int i = 0; i < 7; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(arr[i][0]);
        }
    }
}
