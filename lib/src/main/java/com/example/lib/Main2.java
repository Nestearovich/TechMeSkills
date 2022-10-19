package com.example.lib;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args){
        List list = new LinkedList<String>();
        list.add("hello");
        List arrList = new ArrayList<String>();
        list.add("bye");


        System.out.println(list);
        System.out.println(arrList);
    }
}
