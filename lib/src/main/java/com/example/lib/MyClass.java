package com.example.lib;

public class MyClass {

    public static void main(String[] args) {
        try{
            getWrongValue(null);
        }catch (NullPointerException e){
            System.out.println("caught nullPointer exception");
        }catch (ArithmeticException  e){
            System.out.println("caught arithmetic exception");
        }catch (IndexOutOfBoundsException e){
            System.out.println("caught index exception ");
        }finally {
            System.out.println(" do if success or exception thrown");
        }
    }


    static void getWrongValue(Integer value){
        System.out.println(value.toString());
    }
}