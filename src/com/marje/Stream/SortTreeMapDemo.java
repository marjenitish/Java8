package com.marje.Stream;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortTreeMapDemo {

    public static void main(String[] args) {
        Map<Employee, Integer> employeeMap = new TreeMap<>((c1, c2) -> c1.getSalary() - c2.getSalary());
        employeeMap.put(new Employee(1, "Ram", 10000), 60);
        employeeMap.put(new Employee(1, "Hari", 30000), 50);
        employeeMap.put(new Employee(1, "Shyam", 20000), 10);
        employeeMap.put(new Employee(1, "John", 40000), 40);

        //employeeMap.entrySet().forEach(e -> System.out.println(e.getValue()));

        // Sort By Salary using MapKey
        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("***********************************");
        // Sort By Salary Reverse using MapKey
        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("***********************************");
        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey((e1, e2) -> e2.getSalary()-e1.getSalary())).collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("***********************************");


        // Comparing by value
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("***********************************");

        // Comparing by Value -> Reverse
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByValue((n1, n2) -> n2 - n1)).collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("***********************************");

    }
}
