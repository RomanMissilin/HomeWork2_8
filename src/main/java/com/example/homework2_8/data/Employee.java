package com.example.homework2_8.data;

import java.util.Objects;

public class Employee {

    private final String firsName;
    private final String lassName;

    public Employee(String firsName, String lassName) {
        this.firsName = firsName;
        this.lassName = lassName;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLassName() {
        return lassName;
    }

    public String getFullName() {
        return firsName + " " + lassName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firsName, employee.firsName) && Objects.equals(lassName, employee.lassName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firsName, lassName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firsName='" + firsName + '\'' +
                ", lassName='" + lassName + '\'' +
                '}';
    }
}