package com.marje.ConsumerPredicateSupplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<Integer> consumer = t -> System.out.println("Printing : "+ t);
        consumer.accept(5);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().forEach(t -> System.out.println("Printing :"+t));
    }
}

/** Traditional Way
 * public class ConsumerDemo implements Consumer<Integer> {
 *
 *     @Override
 *     public void accept(Integer integer) {
 *         System.out.println("Printing : "+ integer);
 *     }
 *
 *     public static void main(String[] args) {
 *         new ConsumerDemo().accept(5);
 *     }
 * }
 */

