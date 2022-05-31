package com.marje.MapFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {
        List<Customer> customerList = CustomerDatabase.getAll();

        // Convert List<Customer> to List<String>
        // From list of customer mapping to another list of string
        // This is data transformation. One to One Mapping as one customer has one email
        // For transformation; go for Map()

        List<String> emailList = customerList.stream().map(c -> c.getEmail()).collect(Collectors.toList());
        System.out.println(emailList);

        // Now for Phone number,  we need to flatten the map.
        // One to Many Mapping. One customer has many phone numbers
        List<String> phoneList = customerList.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phoneList);
        List<String> phoneListModified = customerList.stream().flatMap(customer -> customer.getPhoneNumbers().stream()
                .map(c -> "C-"+c)).collect(Collectors.toList());
        System.out.println(phoneListModified);

    }
}
