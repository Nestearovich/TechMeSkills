package com.example.lib;
//synchronized
public class Main3 {
    public static void main(String[] args){

    }
}

class ThreadClass2 implements Runnable{
    private int count;

    synchronized void changeValue(){
        for(int i = 0;i<10;i++){
            count ++;
            System.out.print(count + " ");
        }
    }

    @Override
    public void run() {
        changeValue();
//        for(int i = 0;i<10;i++){
//            changeValue();
//        }
    }
}
