package Java11_1;

public class Solution {

    public static boolean isPerfectSquare(int n){
        int a = (int)(Math.sqrt(n) + 0.5);  //四舍五入求整
        return a * a == n;
    }
    public static boolean isLegal(int n){
        int add100 = n + 100;
        int addAgain168 = add100 + 168;
        if (isPerfectSquare(add100) && isPerfectSquare(addAgain168)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            if (isLegal(i)){
                System.out.println(i);
            }
        }
    }
}
