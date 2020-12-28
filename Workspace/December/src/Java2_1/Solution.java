package Java2_1;

import java.util.Scanner;

public class Solution {
    public static void test(int a1, int a2, int a3) {
        if (a1 == 1) {
            printf("有食物供应，可以播放电影!\n");
            return;
        } else if (a1 == 2) {
            if (a2 == 1) {
                printf("有食物供应，可以播放电影!\n");
                return;
            } else {
                printf("有食物供应!\n");
                return;
            }
        } else {
            if (a2 == 1) {
                printf("有食物供应!\n");
                return;
            } else {
                if (a3 == 2) {
                    printf("有食物供应!\n");
                    return;
                }
            }
        }
    }

    private static void printf(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1, a2, a3;
        boolean temp = true;
        int x;
        while (temp) {
            printf("请选择航线：(1-欧美 2-国外非欧美 3-国内)");
            a1 = scanner.nextInt();
            printf("请选择舱位：(1-商务仓 2-经济仓)");
            a2 = scanner.nextInt();
            printf("请选择飞行时间：(1-2小时以内 2-超过2小时)");
            a3 = scanner.nextInt();
            test(a1, a2, a3);
            printf("是否继续测试?('是'=1，'否'=0)\n");
            x = scanner.nextInt();
            if (x == 0) temp = false;
        }
    }
}
