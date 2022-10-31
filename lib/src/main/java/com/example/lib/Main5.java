package com.example.lib;

public class Main5 {
    public static void main(String[] args){
        ThreadClass threadClass = new ThreadClass();
        threadClass.setDaemon(true);
        threadClass.start();

    }
}

class ThreadClass extends Thread{
    @Override
    public void run() {
        System.out.print("i'am a demon" + Thread.currentThread().isDaemon());
    }
}