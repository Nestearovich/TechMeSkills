package com.example.lib;

public class Work {
    public static void main(String[]args){

        Parent parent = new Parent();
        Mum mum = new Mum();
        checkType(mum);

        Work work =new Work();
        System.out.println(work.getName(""));
    }

    String getName(String name){
        if(name.isEmpty()) {
            return "name can't be empty";
        }else {
            return name;
        }
    }


    static void checkType(Object object){
        if (object instanceof Parent){
            ((Mum) object).sleep();
        }else {
            System.out.println("not parent");
        }
    }
}

class Parent{
    void walk(){
        System.out.println("parent");
    }
}

class Dad extends Parent{

    void walk() {
        System.out.println("dad walk");
    }
}
class Mum extends Parent {
    void walk() {
        System.out.println("mum walk");
    }

    void sleep() {
        System.out.println("mum sleep");
    }
}
