package com.example.lib;

public class Main3 {
    public static void main(String[] args) {

     //   Operationable operationable = new Operationable() {//анонимный класс
       //     @Override
        //    public int calculate(int x, int y) {
          //      return x+y;
            //}
        //}; до лямбд
        Operationable operationable;//predicate
        operationable = (x,y)-> x+y;

       int result = operationable.calculate(10,10);
      System.out.println(result);

        Operationable2<Integer> operationable2;
        operationable2 = (x,y) -> x > y;

        boolean result2 = operationable2.calculate2(10,20);
        System.out.println(result2);

        Operationable3<Integer,String> operationable3;
        operationable3 = (x, y) -> {
           return   x + y + " good";
        };
        String result3 = operationable3.calculate3(10,20);
        System.out.println(result3);

        Operationable4<Integer> operationable4;
        operationable4 = (a,b) -> System.out.println(a+b);

        operationable4.calculate4(10,20);

    }
}

interface  Operationable{
    int calculate (int x,int y);
}
//predicate
interface Operationable2<T>{
boolean calculate2(T t, T t1);
}
//FUNCTION
interface  Operationable3<T,R>{
   R calculate3 (T t,T t1);
}
//consumer
interface  Operationable4<T>{
    void calculate4 (T T,T t1);
}
