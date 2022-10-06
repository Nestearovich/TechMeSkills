package com.example.lib;

public class Lesson7 {//внешний класс

    private String privaterVar = "Hello";
    String publicVar = "hello";
    static String staticVar = "helloy";

    public static void main(String[] args) {
        Lesson7 lesson7 = new Lesson7();
        lesson7.callInterClass();

    }


    void callInterClass() {
        InterClass interClass = new InterClass();
        interClass.callOuterClassVariable();
        System.out.println(interClass.interAge + " call age");
    }

    class InterClass {//внутренний класс

        int interAge = 18;

        void callOuterClassVariable() {
            System.out.println(privaterVar);
            System.out.println(publicVar);
            System.out.println(staticVar);
            callInterClass();
        }
    }

    static class NestedClass{
        int nestedAge = 18;
        void callOuterClassVariable() {
            //System.out.println(privateVar);
           // System.out.println(publicVar);
            System.out.println(staticVar);
        }
    }

}

