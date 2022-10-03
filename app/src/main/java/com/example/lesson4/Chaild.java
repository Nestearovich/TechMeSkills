package com.example.lesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Chaild extends Parent {

    public static void main(String[] args) {
        Parent chaild = new Chaild();
        Parent parent = new Parent();
        chaild.eye_color = "green";
        System.out.println("eye color of the chaild: "+ chaild.eye_color);
        System.out.println("eye color of the Parent" + chaild.eye_color);
    }
}


class Parent{
    String eye_color = "blue";
}