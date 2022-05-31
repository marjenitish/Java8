package com.marje.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);

        // Collections.sort(list);
        // Collections.reverse(list);
        // System.out.println(list);

        // Ascending
        list.stream().sorted().forEach(t -> System.out.println(t));

        // Descending
        list.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.println(t));


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Ram", 10000));
        employeeList.add(new Employee(2, "Shyam", 40000));
        employeeList.add(new Employee(3, "Sita", 50000));
        employeeList.add(new Employee(4, "Hari", 80000));
        employeeList.add(new Employee(5, "John", 90000));

//        employeeList.stream().sorted((e1, e2) -> {
//            return (e2.getSalary() - e1.getSalary());
//        }).forEach(employee -> System.out.println(employee.getName()));

        employeeList.stream().sorted((e1, e2) -> (e2.getSalary() - e1.getSalary()))
                .forEach(employee -> System.out.println(employee.getName()));

    }
}
