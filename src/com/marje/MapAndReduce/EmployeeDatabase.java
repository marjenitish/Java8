package com.marje.MapAndReduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {

    public static List<Employee> getEmployees(){
        return Stream.of(
                new Employee(101, "Ram", "A", 10000),
                new Employee(102, "Shyam", "B", 20000),
                new Employee(103, "Hari", "A", 30000),
                new Employee(103, "Sita", "A", 40000)
        ).collect(Collectors.toList());
    }
}
