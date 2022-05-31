package com.marje.MapFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDatabase {

    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(101, "Ram", "ram@gmail.com", Arrays.asList("23234", "12344")),
                new Customer(102, "Hari", "hari@gmail.com", Arrays.asList("13234", "62344")),
                new Customer(103, "Shyam", "shyam@gmail.com", Arrays.asList("63234", "72344")),
                new Customer(104, "Sita", "sita@gmail.com", Arrays.asList("93234", "82344"))

        ).collect(Collectors.toList());
    }
}
