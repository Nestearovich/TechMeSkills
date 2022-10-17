package com.example.lib;

import java.util.Arrays;
//3-х мерный массив
public class Massive5 {
    public static void main(String[] args) {
        int[][][] numbers = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }
        };
        for (int[][] numbers2D : numbers) {
            for (int[] numbers1D : numbers2D) {
                for (int number : numbers1D) {
                    System.out.print(number + "\t");
                }
                System.out.println();
            }
        }
        System.out.println(Arrays.deepToString(numbers));

        for(int number2D = 0;number2D<numbers.length;number2D++){
            for(int numbers1D = 0;numbers1D<numbers[number2D].length;numbers1D++){
                for(int number = 0;number<numbers[number2D][numbers1D].length;number++){
                    System.out.print(numbers[number2D][numbers1D][number] + "\t");
                }
                System.out.println();
            }
        }
    }
}
