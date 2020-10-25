package Java20_1;

import java.io.*;

// IO 复制文件
public class IOSDemo {
    public static void copyFile(String file) throws IOException {
        BufferedInputStream bufr = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bufo = new BufferedOutputStream(new FileOutputStream("c.txt"));
        int ch;
        while ((ch = bufr.read()) != -1) {
            bufo.write(ch);
        }
        bufo.close();
        bufr.close();
    }

    public static void main(String[] args) throws IOException {
        // File a = new File("c:\\unintall.log");
        copyFile("E:\\Desktop\\code\\Java_code\\Workspace\\October\\a.txt");
    }
}
