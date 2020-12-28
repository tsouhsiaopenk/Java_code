package Java2_1;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class Main {
    public static void DoWork(int x, int y, int z) {
        int k = 0, j = 0;
        if ((x > 3) && (z < 10)) {
            k = x * y - 1;
            j = (int) Math.sqrt(k);
        }
        if ((x == 4) || (y > 5))
            j = x * y + 10;
        j = j % 3;
        System.out.println(k + " " + j);
    }

    public static void main(String[] args) {
        int x,y,z;
        Scanner scanner = new Scanner(System.in);
        while (true){
            x = scanner.nextInt();
            y = scanner.nextInt();
            z = scanner.nextInt();
           DoWork(x,y,z);
        }
    }
}
