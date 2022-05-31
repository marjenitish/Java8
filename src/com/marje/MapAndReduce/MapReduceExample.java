package com.marje.MapAndReduce;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,7,18,1,5,9);

        int sum = 0;
        for(int no: numbers){
            sum+=no;
        }
        System.out.println("Sum: "+sum);


        int sum1 = numbers.stream().mapToInt(i -> i).sum();
        System.out.println(sum1);

        int reduceSum = numbers.stream().reduce(0, (a,b) -> a+b);
        System.out.println(reduceSum);

        Optional<Integer> reduceSumWithMethodReference = numbers.stream().reduce(Integer::sum);
        System.out.println(reduceSumWithMethodReference.get());

        int multipleResult = numbers.stream().reduce(1, (a,b) -> a*b);
        System.out.println("Multiple Result: "+ multipleResult);

        // Get Max Value
        int maxValue = numbers.stream().reduce(0, (a,b) -> b>a?b:a);
        System.out.println("Max Value: "+maxValue);


        List<Employee> employeeList = EmployeeDatabase.getEmployees();

        Double average = employeeList.stream().filter(e -> e.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToInt(i -> i)
                .average().getAsDouble();
        System.out.println("Average Salary for Grade A Employees "+ average);

        int totalSalary = employeeList.stream().filter(e -> e.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToInt(i->i)
                .sum();
        System.out.println("Total salary for grade A Employees: "+ totalSalary);





    }
}
