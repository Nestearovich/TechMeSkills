package com.example.lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main8 {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Dasha");
        arrayList.add("Masha");
        arrayList.add("Sasha");
        arrayList.add("Dante");
        arrayList.add("Vergel");

        Collections.sort(arrayList, Comparator.<String>naturalOrder());
        System.out.print(arrayList);

        System.out.println();
        Collections.sort(arrayList,Comparator.<String>reverseOrder());
        System.out.print(arrayList);
    }
}
