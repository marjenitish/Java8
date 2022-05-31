package com.marje.Optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

    public static Customer getCustomerByEmailId(String email){
        return CustomerDatabase.getAll().stream()
                .filter(c -> c.getEmail().equals(email))
                .findAny()
                .orElse(new Customer());
    }

    public static void main(String[] args) {
        Customer customer = new Customer(101, "Ram", null, Arrays.asList("123","234"));

        // Empty
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        // Of => Will do a NullCheck => If null will throw NullPointer Exception
        Optional<String> emailOptional = Optional.of(customer.getName());
        System.out.println(emailOptional);

        // OfNullable => Will do a Null check => If null => will return empty object
        Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
        if(emailOptional2.isPresent() ) {
            System.out.println(emailOptional2.get());
        }

        // Return default for ofNullable result
        System.out.println(emailOptional2.orElse("default@email.com"));

        // orElseThrow
        //System.out.println(emailOptional2.orElseThrow(() -> new IllegalArgumentException("Email not Present")));

        System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(() -> "default email ..."));

        System.out.println(getCustomerByEmailId("pqr"));

    }
}
