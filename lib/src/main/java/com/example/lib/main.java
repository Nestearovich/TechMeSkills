package com.example.lib;
// первый способ создания потоков
public class main {
    public static void main(String[] args){
//        ThreadClass1 threadClass1 = new ThreadClass1();
//        threadClass1.start();
//
//        ThreadClass2 threadClass2 = new ThreadClass2();
//
//        Thread thread1 = new Thread(threadClass2);
//        thread1.start();


    }
}

class ThreadClass1 extends Thread{
    public void  run(){
        System.out.println("i'm running in Thread");
    }
}

class  ThreadClass2 implements Runnable{
    public void run(){
        System.out.println("I'm running in Runnable");
    }

}