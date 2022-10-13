package com.example.lib;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] temp = new int[]{16, -17, 22, 0, 21, 33, 5, 4, -7};


        double averageTemp;
        int sumOfTepm = 0;
        for (int i = 0; i < temp.length ; i++) {
            sumOfTepm += temp[i];
        }
        averageTemp = (double) sumOfTepm/temp.length;
        System.out.println(averageTemp);
    }
}
