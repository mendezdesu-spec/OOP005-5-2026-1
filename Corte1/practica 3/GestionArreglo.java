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
//mostrar datos
    public void mostrarDatos() {
        System.out.print("Valores: ");
        for (int valor : datos) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
    //suma
    public int sum (){
        int s = 0;
        for (int i=0; i <datos.length; i++){ s+=datos[i];
}
return s;
}
        
//prom
    public  double mean(){
    if (datos.length==0)return 0.0;
    return (double) sum()/datos.length;

    
}
//maxi
    public int max(){
        int m= datos[0];
        for (int i =1;i<datos.length;i++){
            if (datos[i]>m){ m= datos[i];
            
            }
        }
return m;

    }
   //princi
    public static void main(String[] args) {
        System.out.println("Bienvenido a nuestro programa de arreglos c:");
        GestionArreglo obj = new 
        GestionArreglo(3); // Constructor
        obj.ingresarDatos(); // Método posterior
        obj.mostrarDatos();
        System.out.println("suma: "+ obj.sum());
        System.out.println("promedio: "+ obj.mean());
        System.out.println("mayor: "+ obj.max());
    }
}
