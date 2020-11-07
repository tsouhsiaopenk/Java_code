package Java4_1;

public class Test {


    public boolean checkPossibility(int[] nums) {
        if (nums.length <= 2) return true;
        int i;
        boolean flag = true;
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (flag) {
                    if (i > 0 && nums[i - 1] > nums[i + 1]) {
                        //前面的值大就让我下一个等于我当前的
                        nums[i + 1] = nums[i];
                    } else {
                        //前面的小就让后面这俩相等
                        nums[i] = nums[i + 1];
                    }
                    flag = false;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
