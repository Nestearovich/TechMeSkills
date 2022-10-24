package com.example.lib;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//урок 12
public class Main {
    public static void main(String[] args){
        Stream<String> streamGenerate = Stream.generate(() -> "world").limit(10);
        System.out.println(streamGenerate.collect(Collectors.toList()));


        IntStream primitiveStream = IntStream.range(1,10);
        System.out.println(Arrays.toString(primitiveStream.toArray()));

        Stream streamFilter = Stream.of("apple","banana","kiwi").filter(
                element ->element.contains("b")
        );
        System.out.println(streamFilter.findFirst());

        Stream skippedStream = Stream.of("apple","banana","kiwi").skip(2);
        System.out.println(skippedStream.collect(Collectors.toList()));


        Stream streamFilter3 = Stream.of("apple","banana","kiwi").distinct();
        System.out.println(streamFilter3.collect(Collectors.toList()));

       // Stream streamMap = Stream.of("apple","banana","kiwi","apple");
       // String mappedString = streamMap.map(Object::toString).collect(Collectors.joining(","));
       // System.out.println(mappedString);

        //Stream streamMap2 = Stream.of("apple","banana","kiwi","apple");
       // String mappedString2 = streamMap2.map(element-> element + "mapped").collect(Collectors.joining(" "));
       // System.out.println(mappedString2);

       // Stream streamMap3 = Stream.of("apple","banana","kiwi","apple");
       // String mappedString3 = streamMap3.map(String::toUpperCase).collect(Collectors.joining(" "));
       // System.out.println(mappedString3);
    }
}