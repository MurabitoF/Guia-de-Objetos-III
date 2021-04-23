package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Ejercicio 2
        Estudiante estudiante1 = new Estudiante(2019, 3000, "Economia", 40582639, "Jose", "Perez", "josep@email.com", "San Martin 2654");
        Estudiante estudiante2 = new Estudiante(2017, 5000, "Sociología", 39684139, "Ana", "Schartz", "anas@email.com", "Belgrano 1536");
        Estudiante estudiante3 = new Estudiante(2019, 3200, "Ingenieria", 40172359, "Sofia", "Lamar", "sofiL@email.com", "San Luis 3054");
        Estudiante estudiante4 = new Estudiante(2015, 7000, "Filosofia", 38732156, "Roberto", "Aniz", "robaniz@email.com", "Santa Fe 2874");
        Staff staff1 = new Staff(26000, "Mañana", 32685974, "Jose Luis", "Rodriguez", "joseluis@email.com", "Rivadavia 1523");
        Staff staff2 = new Staff(28000, "Noche", 28451369, "Maria", "Martinez", "mariaM@email.com", "Cordoba 2523");
        Staff staff3 = new Staff(27000, "Mañana", 29452836, "Jorgina", "Tarman", "jTarman@email.com", "Alberti 2023");
        Staff staff4 = new Staff(25000, "Noche", 30142759, "Tomas", "Yonir", "tYonir@email.com", "Gascon 1863");

        Persona[] personas = new Persona[8];
        personas[0] = estudiante1;
        personas[1] = estudiante2;
        personas[2] = estudiante3;
        personas[3] = estudiante4;
        personas[4] = staff1;
        personas[5] = staff2;
        personas[6] = staff3;
        personas[7] = staff4;

        int totalE = 0;
        int totalS = 0;

       for (Persona persona : personas)
       {
           if(persona!= null)
           {
               if (persona instanceof Estudiante) totalE++;
               if (persona instanceof Staff) totalS++;
           }
       }
        System.out.println("En la intitución hay " + totalE + " estudiantes y " + totalS + " miembros del staff");

       double totalIngreso = 0.0;

       for (Persona persona : personas)
       {
           if (persona != null)
           {
               if (persona instanceof Estudiante) totalIngreso += ((Estudiante)persona).getCuotaMensual();
           }
       }
        System.out.println("La institución tiene un ingreso anual de " + totalIngreso);

       //Ejercicio 3
    }
}



