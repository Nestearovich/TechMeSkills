package com.example.lib;

import java.util.HashSet;

public class Main4 {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<Student>();
        hashSet.add(new Student("Olya"));
        hashSet.add(new Student("Olya"));
        hashSet.add(new Student("Dante"));
        hashSet.add(new Student("Vergel"));


        System.out.println(hashSet.size());
    }
}
class Student{
    private String name;

    Student(String name) {
        this.name = name;

    }

}
