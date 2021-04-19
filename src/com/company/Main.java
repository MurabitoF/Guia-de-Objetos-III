package com.company;

import com.company.ejercicio1.Cilindro;
import com.company.ejercicio1.Circulo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //rama Franco
        ejercicio1();
    }

    public static void ejercicio1(){
        Cilindro cilindro1 = new Cilindro();

        System.out.println(cilindro1.calcularVolumen());
        System.out.println(cilindro1.calcularArea());
        System.out.println(cilindro1);

        Cilindro cilindro2 = new Cilindro(2.5,5.0);

        System.out.println(cilindro2.calcularVolumen());
        System.out.println(cilindro2.calcularArea());
        System.out.println(cilindro2);
    }
}
