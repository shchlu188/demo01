package buffer;

import java.io.*;

/**
 * 字符缓冲流
 */
public class BUfferRWStream {
    // 字符缓存输入流
    public static  void bufferReaderDemo(String filePath){
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            int len = 0;
            char[] chars = new char[1024];
            while((len = bufferedReader.read(chars)) != -1){
                System.out.println(chars);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    // 字符缓存输出流
    public static void bufferWriterDemo(String filePath,String msg,int count){
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            for (int i = 0; i < count; i++) {
                bufferedWriter.write(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        bufferWriterDemo("io/c.txt","你好",21);
        bufferReaderDemo("io/c.txt");
    }
}

