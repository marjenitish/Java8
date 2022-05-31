package com.marje.ConsumerPredicateSupplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateDemo{

    public static void main(String[] args) {
        Predicate<Integer> predicate = t -> t%2 == 0;
        System.out.println(predicate.test(7));

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        //list.stream().filter(predicate).forEach(t -> System.out.println("Printing: "+ t));
        list.stream().filter(t -> t%2 == 0).forEach(t -> System.out.println("Printing: "+ t));
    }

}

/** Traditional Way
 * public static void main(String[] args) {
 *         Predicate<Integer> predicate = new PredicateDemo();
 *         System.out.println(predicate.test(7));
 *     }
 *
 *     @Override
 *     public boolean test(Integer integer) {
 *         return integer % 2 == 0;
 *     }
 */

