package com.marje.MapAndReduce;

public class Employee {

    private Integer id;

    private String name;

    private String grade;

    private Integer salary;


    public Employee(Integer id, String name, String grade, Integer salary) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getGrade() {
        return grade;
    }


    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

}
