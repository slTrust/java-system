package com.work;


import java.io.*;
import java.util.Scanner;

public class Work02 {
    public static void main(String[] args) throws IOException {

        while (true){
            // 获取输入
            String input = getInput();
            // 新开线程，写入文件
            new MyFileIoThread( input ).start();

        }
    }

    public static String getInput(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        return str;
    }
}

class MyFileIoThread extends Thread{
    public static int count = 1;
    private String content;

    public MyFileIoThread(String content) {
        this.content = content;
        MyFileIoThread.count++;
        System.out.println(MyFileIoThread.count);
    }

    @Override
    public void run() {
        FileOutputStream output = null;
        try {
            String fileName = MyFileIoThread.count + ".txt";
            output = new FileOutputStream("./d15thread/src/main/resources/" + fileName);
            OutputStreamWriter writer = new OutputStreamWriter(output,"UTF-8");
            PrintWriter printWriter = new PrintWriter(writer);

            // 模拟写入文件慢的操作
            Thread.sleep(500);
            System.out.println(" file: " + fileName + " 写入成功");

            printWriter.write(content);
            printWriter.close();
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

