package com.work;


public class Work01 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();
        t.setName("main thread");

        MyThread t2 = new MyThread("aaa");
        MyThread2 t3 = new MyThread2("bbb");

        t2.start();
        t3.start();

        for (int i = 1; i <= 100; i++) {
            System.out.println(t.getName() + " running " + i);
            Thread.sleep(50);
        }
    }
}

class MyThread extends Thread{
    private Thread t;
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 65; i < 65+26; i++) {
                char a = (char) i;
                System.out.println(name+ " running " + a);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        t = new Thread (this, name);
        t.start ();
    }
}

class MyThread2 implements Runnable{
    private Thread t;
    private String name;

    public MyThread2(String name) {
        this.name = name;
    }

    public void run() {
        try {
            for (int i = 97; i < 97 + 26; i++) {
                char a = (char) i;
                System.out.println(name+ " running " + a);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void start(){
        t = new Thread (this, name);
        t.start ();
    }
}
