package com.example.lib;

public class GetterAndSetter {
    public static void main(String[] args){
        Shop shop = new Shop();
        shop.setAge(10);
    }
}

class Shop {
    private int age = 0;


    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
            sellAlcohol();
        } else {
            System.out.println("you are child " + getAge());
        }
    }
        public int getAge() {
        return age;
        }

        void sellAlcohol () {
            if (age != 0) {
                System.out.println("vodka sold" + getAge());
            }
        }
    }

