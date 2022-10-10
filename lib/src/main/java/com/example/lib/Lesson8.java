package com.example.lib;

import java.io.FileNotFoundException;

public class Lesson8 {
public static void main(String[] args){
  //  throwUnChekedException();
    try {
        throwChekedException();
    }catch (FileNotFoundException e){
        System.out.println(e.getMessage());
    }

}
static void throwUnChekedException() throws NullPointerException {
    throw new NullPointerException("runtime");
}
static void throwChekedException() throws FileNotFoundException {
    throw new FileNotFoundException("compiletime");
}
}
