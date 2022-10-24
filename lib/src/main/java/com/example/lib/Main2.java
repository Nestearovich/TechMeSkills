package com.example.lib;

import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Consumer;

public class Main2 {

    static Consumer<String> printUpperCase = str -> {
        System.out.print(str.toUpperCase() + " ");
    };


    public static void main(String[] args){
        ArrayList<Person> person = new ArrayList<Person>();

        person.add(new Person("Sasha"));
        person.add(new Person("Dima"));
        person.add(new Person("Marko"));
        person.add(new Person("Jon"));
        person.add(new Person("Name"));
        person.add(new Person("Nero"));

     //   for(Person person : person);{
       //     System.out.print(person.getName());
        //}
        person.stream().map(Person::getName).forEach(System.out::println);
        person.stream().map(Person::getName).forEach(printUpperCase);
    }
}


class Person{
    private String name;

    Person(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }
}
