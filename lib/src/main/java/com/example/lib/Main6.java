package com.example.lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Main6 {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("tree");
        arrayList.add("four");
        arrayList.add("five");


        int index = arrayList.indexOf("two");
        arrayList.remove("two");
        System.out.println(arrayList);

        }
    }

