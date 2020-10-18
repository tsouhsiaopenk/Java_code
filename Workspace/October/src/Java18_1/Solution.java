package Java18_1;

public class Solution {
    // 从小到大的排序
    public static void BubbleSort(int[] arr) {
        for (int bound = 0; bound < arr.length; bound++) {
            // [0.bound)已排序区间
            // [bound,arr.length) 待排序区间
            for (int cur = arr.length - 1; cur > bound ; cur--) {
                if (arr[cur] < arr[cur - 1]) {
                    int tmp = arr[cur];
                    arr[cur] = arr[cur - 1];
                    arr[cur - 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        for (int item : arr) {
            System.out.print(item);
        }
        BubbleSort(arr);
        System.out.println();
        for (int value : arr) {
            System.out.print(value);
        }
    }
}
