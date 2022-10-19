package com.example.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
//set тип коллекции
public class Main3 {
    public static void main(String[] args){
        SortedSet set = new TreeSet();
        set.add("banana");
        set.add("apple");
        set.add("orange");
        set.add("banana");
        System.out.println(set);
    }
}
