package com.example.lib;

import java.util.HashMap;
import java.util.TreeMap;

public class Main5 {
    public static void main(String[] args){
        TreeMap hashMap = new TreeMap();
        hashMap.put("A","C");
        hashMap.put("D","A");
        hashMap.put("B","D");
        hashMap.put("C","B");


        System.out.println(hashMap);
    }
}
