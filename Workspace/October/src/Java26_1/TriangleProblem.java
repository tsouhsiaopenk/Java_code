package Java26_1;

public class TriangleProblem {
    public static void determine(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("请输入大于0的边长");
        } else if (a > 100 || b > 100 || c > 100) {
            throw new IllegalArgumentException("请输入小于101的边长");
        } else if (a + b > c && a + c > b && b + c > a) {// 判断是否三角形
            // 判断三角形类型
            if (a == b && b == c) {
                System.out.println("等边三角形");
            } else if (a == b || a == c || b == c) {
                System.out.println("等腰三角形");
            } else {
                System.out.println("普通三角形");
            }
        } else {
            System.out.println("非三角形");
        }
    }

    public static void main(String[] args) {
        determine(101,4,8);
    }
}
