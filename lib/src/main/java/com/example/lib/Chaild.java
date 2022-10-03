package com.example.lib;

public class Chaild extends Parent {
    protected int age = 12;

    @Override
    void speak() {
        super.speak();
        System.out.println("i speak loudly");
    }

    public static void main(String[] args) {
        Parent chaild = new Chaild();
        Parent parent = new Parent();
        chaild.eye_color = " green";
        System.out.println("eye color of the chaild: "+ chaild.eye_color);
        System.out.println("eye color of the Parent" + parent.eye_color);
        chaild.speak();
       // parent.speak();

    }


    void  phoneNumber(int number){

    }

    void phoneNumber(int number,String mobile_operator){

    }

}


    class Parent{
       protected String eye_color = " blue";

        void speak() {
            System.out.println("i speack quatly");
        }
    }


    class  Vncle {
    public static void main(String[] args){
     Parent parent = new Parent();
     Chaild chaild = new Chaild();
     System.out.println(parent.eye_color);
     System.out.println(chaild.age);
    }
    }
