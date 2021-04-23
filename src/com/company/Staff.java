package com.company;

public class Staff extends Persona{
    private double salario;
    private String turno;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Staff(double salario, String turno, long dni, String nombre, String apellido, String email, String direccion) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    @Override
    public String toString()
    {
        return "\nSalario: " + this.salario + "\nTurno: " + this.turno;
    }

}
