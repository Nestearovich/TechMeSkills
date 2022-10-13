package com.example.lib;

import static sun.swing.MenuItemLayoutHelper.max;

import java.util.Arrays;

public class Massive2 {
    public static void main(String[] args) {
        int[] mas = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
        int minValue;
        int maxValue;
        Arrays.sort(mas);
        minValue = mas[0];
        maxValue = mas[mas.length-1];
        System.out.println(" minValue " + minValue + " maxValue " + maxValue);
    }
}
