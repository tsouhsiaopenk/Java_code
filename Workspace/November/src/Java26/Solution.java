package Java26;

public class Solution {
    static int fun(int a){
        a ^= (1<<5)-1;
        return a;
    }
    public static void main(String[] args) {
        System.out.println(fun(21));
    }
}
