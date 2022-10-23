package com.example.lib;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args){
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
        arrayDeque.add("ios developer");
        arrayDeque.addFirst("android developer");
        arrayDeque.addLast("python developer");
        arrayDeque.push("flutter developer");


        System.out.println(arrayDeque);


        ArrayList arrayList = new ArrayList();
        arrayList.addAll(arrayDeque);
        System.out.println(arrayList.get(2));
    }
}
