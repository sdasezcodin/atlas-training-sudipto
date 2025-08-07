package com.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private String department;
    private List<Employee> team;

    public Manager(String name, String department) {
        this.name = name;
        this.department = department;
        this.team = new ArrayList<>();
    }

    public void addEmp(Employee emp) {
        team.add(emp);
    }

    public void removeEmp(Employee emp) {
        team.remove(emp);
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name + " - " + department);
        for (Employee e : team) {
            e.showDetails();
        }
    }
}

