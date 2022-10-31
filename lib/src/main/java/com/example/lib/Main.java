package com.example.lib;
// race condition
public class Main {
    public static void main(String[] args){
        ThreadClass1 threadClass1 = new ThreadClass1();
        Thread thread1 = new Thread(threadClass1);
        thread1.start();
        Thread thread2=new Thread(threadClass1);
        thread2.start();
    }
}

class ThreadClass1 implements Runnable {
    private int count;

    public void run(){
        for(int i = 0;i<10;i++){
            count++;
            System.out.print(count + " ");
        }
    }
}