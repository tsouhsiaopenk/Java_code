package Java24;

import java.util.concurrent.TimeUnit;

public class Solution {
    public static void main(String[] args) {
        Phone3 phone1 = new Phone3();
        Phone3 phone2 = new Phone3();
        int cnt = 100;
        while (cnt-- > 0) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    phone1.sendSms();
                }
            }).start();
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new Thread(new Runnable() {
                @Override
                public void run() {
                    phone2.call();
                }
            }).start();
        }
    }
}
