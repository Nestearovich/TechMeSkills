package com.example.lib;

public class Main {
    public static void main(String[] args){
    Shop shop = new Shop();
    try {
        shop.setAge(19);
    }catch (ChildeException e){
        System.out.println(e.getMessage());
    }finally {
        System.out.println(shop.getAge());
    }
    }
}

class Shop{
    private int age;
    public  int getAge() {
        return age;
    }

    public void setAge(int age) throws ChildeException{
        if(age<18){
            throw new ChildeException(" you are child");
        }else {
            this.age = age;
            System.out.println("alcohol sold");
        }
    }
}

class ChildeException extends Exception {

    private String message;

    ChildeException(String message) {
        this.message = message;
        setMessage(message);
    }
    public String getMessage(){
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
