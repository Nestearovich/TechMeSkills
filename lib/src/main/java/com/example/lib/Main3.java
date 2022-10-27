package com.example.lib;

public class Main3 {
    public static void main(String[] args){
    Thread thread = new Thread(){
        @Override
        public void run() {
            System.out.println("i'm rinning in thread");
        }
    };
    thread.start();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {

        }
    };
    Thread thread1 = new Thread(runnable);
    thread1.start();
    }
}

