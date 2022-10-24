package com.example.lib;

import java.util.Optional;

import jdk.tools.jlink.internal.TaskHelper;

public class Main4 {
    public static void main(String[] args){
        Optional<Integer>optInt = Optional.empty();
        if(optInt.isPresent()){
            System.out.println(optInt.get());
        }else {
            System.out.println("no value");
        }
    }
}
