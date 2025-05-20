package edu.elenasoft.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{

    private String nombre;
    private  List<Employee> employees   ;

    public Manager(String nombre) {
        this.nombre = nombre;
        this.employees = new ArrayList<>();
    }

    public void add(Employee employee) {
        this.employees.add(employee);
    }

    @Override
    public int Salary() {
        int totalSalary = 0;
        for (Employee employee : employees){
            totalSalary = totalSalary + employee.Salary();
        }

        return totalSalary;
    }

    @Override
    public void showDetails() {
        for (Employee employee : employees){
            employee.showDetails();
        }
    
        System.out.println("Gerente: " + nombre + ", Salario Total: " + Salary() + "$");
    }

}
