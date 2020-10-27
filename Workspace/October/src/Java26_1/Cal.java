package Java26_1;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        int area,floor;
        System.out.println("请输入房屋面积和楼层:");
        Scanner scanner = new Scanner(System.in);
        area = scanner.nextInt();
        floor = scanner.nextInt();
        if((area != 75 && area != 95 && area != 125 && area != 165 && area != 185) || floor > 7 || floor < 1){
            System.out.println("请输入正确的房屋面积和楼层!");
        }else{
            switch(floor){
                case 2:
                    System.out.printf("%d\n",area * 3500);
                    break;
                case 1:
                case 5:
                case 6:
                    System.out.printf("%d\n",area * 35 * 98);
                    break;
                case 3:
                case 4:
                    System.out.printf("%d\n",area * 35 * 103);
                    break;
                case 7:
                    System.out.printf("%d\n",area * 35 * 97);
                    break;
            }
        }
    }
}
