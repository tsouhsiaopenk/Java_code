package Java16;

public class Test {
    private static int cc = 0;
    public static void main(String[] args) {
       foo(5);
        System.out.println(cc);

    }

    private static void foo(int c) {
        for (int i = c; i > 0; i--) {
            cc++;
            foo(i-1);
        }
    }
}
