package Java18_2;

public class Solution {
    // 堆排序
    public static void heapSort(int[] arr) {
        // 1,用传进来的数组建立一个大堆
        createHeap(arr);
        // 循环 arr.length -1 次，最后一次是他本身，不用交换
        for (int i = 0; i < arr.length - 1; i++) {
            // 2，将最后一个元素第一个元素进行交换
            // 数组最后一个有序，不用再参与排序，即第一个和最后一个下标始终向前一个位置
            int heapSize = arr.length - i;
            // 交换元素使得后面的元素有序
            swap(arr,0,heapSize - 1);
            // 交换完成使堆中元素减少
            heapSize--;
            // 将剩余部分重新向下调整使保持堆结构
            shiftDown(arr,heapSize,0);
        }
    }

    // 向下调整
    private static void shiftDown(int[] arr, int size, int index) {
        // 将需要调整的位置初始化为parent
        int parent = index;
        // 父亲节点和左孩子节点的下标具有这样的关系
        int child = parent * 2 + 1;
        while (child < size){
            // 使得 child 一定是左右孩子
            if (child + 1 < size && arr[child + 1] > arr[child]){
                child = child + 1;
            }
            // 然后用最大的那个child 和 parent比较
            if (parent < child){
                swap(arr,parent,child);
            }else{
                continue;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    private static void createHeap(int[] arr) {
        // 从后往前对每一个元素进行向下调整
        for (int index = (arr.length - 1 - 1) / 2; index >= 0 ; index--) {
            shiftDown(arr,arr.length,index);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,4,3,2,6,5};
        for (int value : arr) {
            System.out.print(value);
        }
        System.out.println();
        heapSort(arr);
        for (int value : arr) {
            System.out.print(value);
        }
    }
}
