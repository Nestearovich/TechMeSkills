package com.example.lib;

import java.util.HashMap;

public class Main4 {
    public static void main(String[] args){
        HashMap hashMap = new HashMap();
        hashMap.put("Planet","Saturn");
        hashMap.put("Earth","Country");
        hashMap.put("Animal","cat");
        hashMap.put("Earth","Ocean");

        hashMap.remove("Animal");
        System.out.println(hashMap.values());
    }
}
