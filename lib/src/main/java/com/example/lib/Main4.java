package com.example.lib;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter you number: ");
        if(scanner.hasNextInt()){
            int enteredValue = scanner.nextInt();
            System.out.println("your value is " + enteredValue);
        }else {
            System.out.println("your inout value is wrong ");
        }

        int enteredValue = scanner.nextInt();
        System.out.println(" your value is: " + enteredValue);
    }
}
