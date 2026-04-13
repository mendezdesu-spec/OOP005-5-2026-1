package test;

import inheritance.*;
import java.util.Date;

public class InheritanceTest {
    public static void main(String[] args) {
        
        // Empleados
        Employee employee1 = new Employee(3000, "Alex", 'M', 32, "Facatativa");
        Employee employee2 = new Employee(3450, "Alicia", 'F', 41, "Madrid");
        
        System.out.println(employee1);
        System.out.println(employee2);

        // Clientes
        Cliente cliente1 = new Cliente(new Date(), true, "HBG", 'M', 46, "Bogota");
        Cliente cliente2 = new Cliente(new Date(), false, "Carla", 'F', 43, "Cota");

        System.out.println(cliente1);
        System.out.println(cliente2);

        // Persona normal
        Person persona1 = new Person("Fabio", 'M', 25, "Madrid");
        imprimir(persona1);

        // Uso de métodos
        System.out.println("Detalles cliente: " + cliente1.obtenerDetalles());
        System.out.println("Detalles empleado: " + employee1.obtenerDetalles());

        // Polimorfismo
        Person persona2 = new Employee(4567, "Carlos", 'M', 37, "Bogota");
        System.out.println(persona2.obtenerDetalles());

        // Downcasting
        Employee empleado = (Employee) persona2;
        System.out.println("Downcasting: " + empleado.obtenerDetalles());

        // Upcasting
        Person persona3 = empleado;
        System.out.println("Upcasting: " + persona3.obtenerDetalles());
    }

    public static void imprimir(Person persona) {
        System.out.println("Imprimir: " + persona.obtenerDetalles());
    }
}
