package edu.elenasoft.composite;

public class IndividualEmployee implements Employee{

    private  String nombre;
    private  int salario;

    
    public IndividualEmployee(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public int Salary() {
        return salario;
    }

    @Override
    public void showDetails() {
        System.out.println("Empleado: " + nombre + ", Salario: " + salario + "KB");
    }

}
