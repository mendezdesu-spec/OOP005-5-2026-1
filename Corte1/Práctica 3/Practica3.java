package practica3;
import java.util.Scanner;
// 1. Importar la librería

public class GestionArreglo {
    // Declarar atributos
    private int[] datos;
    private Scanner scanner;

    public GestionArreglo(int size) {
        // Inicializar el arreglo en el constructor
        this.datos = new int[size];
        // Inicializar el scanner (o hacerlo en el método)
        this.scanner = new Scanner(System.in);
    }

    // Método posterior al constructor
    public void ingresarDatos() {
        System.out.println("Ingrese " + datos.length + " numeros:");
        for (int i = 0; i < datos.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            // 2. Usar scanner.nextInt() para guardar en el arreglo
            datos[i] = scanner.nextInt(); 
        }
        System.out.println("Arreglo cargado exitosamente.");
    }

    public void mostrarDatos() {
        System.out.print("Valores: ");
        for (int valor : datos) {
            System.out.print(valor + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido a nuestro programa de arreglos c:");
        GestionArreglo obj = new 
        GestionArreglo(3); // Constructor
        obj.ingresarDatos(); // Método posterior
        obj.mostrarDatos();
    }
}