package Java26_1;
import java.util.*;

class TestDemo {
    public static void main(String[] args) {
        // 找零钱最佳组合
        // R < 100 元（且为整数）
        // 50,10,5,1（N50,N10,N5,N1）
        Scanner scanner = new Scanner(System.in);
        System.out.println("以下为一个简单换算程序：");
        System.out.println("请输入商品价格及顾客付的钱数：");
        int money = scanner.nextInt();
        int giveMoney = scanner.nextInt();
        money = giveMoney - money;
        int N50 = money / 50;
        int N10 = money % 50 / 10;
        int N5 = money % 50 % 10 / 5;
        int N1 = money % 50 % 10 % 5;
        System.out.println("换算结果为：");
        System.out.println("N50：" + N50 + " N10:" + N10 + " N5:" + N5 + " N1:" + N1);
    }
}

