package com.example.lib;

public class Main5 {
    public static void main(String[] args) {
        ThreadClass6 threadClass6 = new ThreadClass6();
        threadClass6.start();


        long start = System.currentTimeMillis();
        System.out.println("called in thread " + Thread.currentThread().getName() + " " + start);
    }

}

class ThreadClass6 extends Thread {


    @Override
    public void run() {
        try {
            sleep(2000);
            long start = System.currentTimeMillis();// берет милисикунды
            Thread thread = Thread.currentThread();// берет поток
            System.out.println("I'm run this cade in:" + thread.getName() + " " + start);
        } catch (Exception e) {
            System.out.println("noy");
        }

    }
}
