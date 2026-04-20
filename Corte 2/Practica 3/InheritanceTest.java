/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritancetest;

import java.util.Date;

public class InheritanceTest {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee(3000, "Alex", 'M', 32, "Facatativa");
        Employee employee2 = new Employee(3450, "Alicia", 'F', 41, "Madrid");
        
        System.out.println(employee1);
        System.out.println(employee2);

        Cliente cliente1 = new Cliente(new Date(), true, "HBG", 'M', 46, "Bogota");
        Cliente cliente2 = new Cliente(new Date(), false, "Carla", 'F', 43, "Cota");

        System.out.println(cliente1);
        System.out.println(cliente2);

        Person persona1 = new Person("Fabio", 'M', 25, "Madrid");
        imprimir(persona1);

        System.out.println("Detalles cliente: " + cliente1.obtenerDetalles());
        System.out.println("Detalles empleado: " + employee1.obtenerDetalles());

        Person persona2 = new Employee(4567, "Carlos", 'M', 37, "Bogota");
        System.out.println(persona2.obtenerDetalles());

        Employee empleado = (Employee) persona2;
        System.out.println("Downcasting: " + empleado.obtenerDetalles());

        Person persona3 = empleado;
        System.out.println("Upcasting: " + persona3.obtenerDetalles());
    }

    public static void imprimir(Person persona) {
        System.out.println("Imprimir: " + persona.obtenerDetalles());
    }
}