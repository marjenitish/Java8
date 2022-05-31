package com.marje.Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Linux");
        list.add("Windows");
        list.add("Mac");
        list.add("Macbook");

        for(String name : list){
            System.out.println(name);
        }

        list.stream().forEach(name -> System.out.println(name));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        map.forEach((key, value) -> System.out.println(key+"-"+value));
        map.entrySet().stream().forEach(object -> System.out.println(object));

        Consumer<Object> consumer = obj -> System.out.println(obj);
        consumer.accept("Hello_World !!");
        map.entrySet().stream().forEach(consumer);


        list.stream().filter(t -> t.startsWith("M")).forEach(t-> System.out.println(t));

    }
}
