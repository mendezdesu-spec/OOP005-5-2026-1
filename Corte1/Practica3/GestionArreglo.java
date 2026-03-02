package practica3;
import java.util.Scanner;

public class GestionArreglo {

    private int[] datos;
    private Scanner scanner;

    public GestionArreglo(int size) {
        this.datos = new int[size];
        this.scanner = new Scanner(System.in);
    }

    public void ingresarDatos() {
        System.out.println("Ingrese " + datos.length + " numeros:");
        for (int i = 0; i < datos.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            datos[i] = scanner.nextInt();
        }
        System.out.println("Arreglo cargado exitosamente.");
    }

    public void mostrarDatos() {
        System.out.print("Valores: ");
        for (int valor : datos) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    public int sum() {
        int s = 0;
        for (int i = 0; i < datos.length; i++) {
            s += datos[i];
        }
        return s;
    }

    public double mean() {
        if (datos.length == 0) return 0.0;
        return (double) sum() / datos.length;
    }

    public int max() {
        if (datos.length == 0) return 0;
        int m = datos[0];
        for (int i = 1; i < datos.length; i++) {
            if (datos[i] > m) {
                m = datos[i];
            }
        }
        return m;
    }

    public int min() {
        if (datos.length == 0) return 0;
        int menor = datos[0];
        for (int i = 1; i < datos.length; i++) {
            if (datos[i] < menor) {
                menor = datos[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido a nuestro programa de arreglos c:");

        GestionArreglo obj = new GestionArreglo(8);

        obj.ingresarDatos();
        obj.mostrarDatos();

        System.out.println("Suma: " + obj.sum());
        System.out.println("Promedio: " + obj.mean());
        System.out.println("Mayor: " + obj.max());
        System.out.println("Menor: " + obj.min());
    }
}
