package com.example.lib;
// переопределение логики кот будет выполнятся на другом потоке
public class Main2 {
    public static void main(String[] args){
        ThreadClass3 threadClass3 =new ThreadClass3(){
            @Override
            public void run() {
                System.out.println("run in Thread in anonym class");
            }
        };
        threadClass3.start();
    }
}

class ThreadClass3 extends Thread{
    public void  run(){
        System.out.println("i'm running in Thread");
    }
}

class  ThreadClass4 implements Runnable{
    public void run(){
        System.out.println("I'm running in Runnable");
    }

}
