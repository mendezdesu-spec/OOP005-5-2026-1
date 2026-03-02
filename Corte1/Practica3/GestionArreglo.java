package practica3;

import java.util.Scanner;

public class GestionArreglo {

    private int[] datos;
    private Scanner scanner;

    public GestionArreglo(int size) {
        datos = new int[size];
        scanner = new Scanner(System.in);
    }

    // Ingresar datos
    public void ingresarDatos() {
        System.out.println("Ingrese " + datos.length + " numeros:");
        for (int i = 0; i < datos.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            datos[i] = scanner.nextInt();
        }
    }

    // Mostrar datos
    public void mostrarDatos() {
        System.out.print("Valores: ");
        for (int valor : datos) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    // Suma
    public int suma() {
        int s = 0;
        for (int i = 0; i < datos.length; i++) {
            s += datos[i];
        }
        return s;
    }

    // Promedio
    public double promedio() {
        if (datos.length == 0) return 0;
        return (double) suma() / datos.length;
    }

    // Máximo
    public int maximo() {
        if (datos.length == 0) return 0;
        int mayor = datos[0];
        for (int i = 1; i < datos.length; i++) {
            if (datos[i] > mayor) {
                mayor = datos[i];
            }
        }
        return mayor;
    }

    // Mínimo
    public int minimo() {
        if (datos.length == 0) return 0;
        int menor = datos[0];
        for (int i = 1; i < datos.length; i++) {
            if (datos[i] < menor) {
                menor = datos[i];
            }
        }
        return menor;
    }

    // Método principal
    public static void main(String[] args) {

        System.out.println("Bienvenido a nuestro programa de arreglos");

        GestionArreglo objeto = new GestionArreglo(8);

        objeto.ingresarDatos();
        objeto.mostrarDatos();

        System.out.println("Suma: " + objeto.suma());
        System.out.println("Promedio: " + objeto.promedio());
        System.out.println("Mayor: " + objeto.maximo());
        System.out.println("Menor: " + objeto.minimo());
    }
}