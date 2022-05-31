package com.marje.Stream;

import java.util.*;

public class SortMapDemo {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("three", 3);
        map.put("one", 1);

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, (c1, c2) -> c2.getValue()-c1.getValue());
        System.out.println(entryList);

        map.entrySet().stream()
                .sorted((c1, c2) -> c2.getValue()-c1.getValue())
                .forEach(t -> System.out.println(t.getValue()));
    }

}
