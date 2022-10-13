package com.example.lib;

import java.util.Arrays;

public class Massive {
    public static void main(String[] args) {
        int[] massive = new int[]{16, -17, 22, 0, 1, 33, 5, 4, 7};
        System.out.println(Arrays.toString(massive));

        for (int i = 0; i < massive.length - 1; i++) {
            System.out.print(massive[i] + " ");

            for (int element : massive) {
                System.out.print(element + " ");
            }
        }
    }
}
