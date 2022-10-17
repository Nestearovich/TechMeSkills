package com.example.lib;

import java.util.Arrays;
import java.util.Random;

public class Randoms {
    public static void main(String[] args){
        int[] massive = new int[10];

        Random random = new Random();
        for(int element = 0; element< massive.length;element++){
            massive[element] = random.nextInt( 10);
            System.out.println(Arrays.toString(massive));
        }

    }
}
