package com.marje.ConsumerPredicateSupplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo{

    public static void main(String[] args) {
        Supplier supplier = () -> "Hello World";
        System.out.println(supplier.get());

        List<String> list = Arrays.asList("A","B","C");
        System.out.println(list.stream().findAny().orElseGet(supplier));

        List<String> newList = Arrays.asList();
        System.out.println(newList.stream().findAny().orElseGet(() -> "String Not Found"));
    }
}

/** Traditional way
 * public class SupplierDemo implements Supplier<String> {
 *     @Override
 *     public String get() {
 *         return "Hello World!!";
 *     }
 *
 *     public static void main(String[] args) {
 *         Supplier<String> supplier = new SupplierDemo();
 *         System.out.println(supplier.get());
 *     }
 * }
 * */
