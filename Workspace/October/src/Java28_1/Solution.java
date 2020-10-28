package Java28_1;

public class Solution {
    public static int middle(int[] arr,int toFind){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int mid = (left+right) / 2;
            if (arr[mid] == toFind){
                return mid;
            }else if (arr[mid] < toFind){ // 去右边找
                left = mid + 1;
            }else { // 去左边找
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int middle2(int[] arr,int toFind){
        return helper(arr,0,arr.length-1,toFind);
    }

    public static int helper(int[] arr,int left,int right,int toFind){
        // 递归退出条件
        if (left > right){
            return -1;
        }
        int mid = (left+right) / 2;
        if (arr[mid] == toFind){
            return mid;
        }else if (arr[mid] < toFind){
            left = mid + 1;
            return helper(arr,left,right,toFind);
        }else {
            right = mid - 1;
            return helper(arr,left,right,toFind);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int res = middle2(arr,3);
        System.out.println(res);
    }
}
