package com.example.lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main7 {
    public static void main(String[] args){
        ArrayList<Person> arrayList = new ArrayList<Person>();
        arrayList.add(new Person("Sasha",23));
        arrayList.add(new Person("Masha",24));
        arrayList.add(new Person("Lera",21));
        arrayList.add(new Person("Olga",25));
        arrayList.add(new Person("Vergel",140));

        System.out.println(arrayList);

        Collections.sort(arrayList, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return Integer.valueOf(person.getAge()).compareTo(Integer.valueOf(t1.getAge()));
            }
        });

        for(Person person:arrayList){
            System.out.println(person.getAge());
        }
    }
}
class Person{

    private String name;
    public int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;

    }

}
