package Java5_1;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // 1.先输入数据
        HashMap<String, String> map = new HashMap<>(); // 保存输入信息
        Scanner scanner = new Scanner(System.in);
        String toFind = null;
        while (scanner.hasNextLine()){
            String s = scanner.nextLine();
            String[] strings = s.split(" ");
            if (strings.length == 2){
                String user = strings[0];
                String device = strings[1];
                map.put(user,device);
            }else{
                toFind = s;
                break;
            }
        }
        // 2.实现关联功能
        int res = relation(map,toFind);
        System.out.println(res);
    }

    private static int relation(Map<String, String> map, String toFind) {
        // 计算该 device 下的用户数量
        String device = map.get(toFind);
        Set<String> set = new HashSet<>();
        for(String dev : map.values()){
            if (dev.equals(device)){
                set.add(dev);
            }
        }
        return set.size()+1;
    }
}
