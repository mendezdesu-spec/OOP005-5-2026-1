
package matriz3x3arrays;


import java.util.ArrayList;
import java.util.Scanner;

public class Matriz3x3arrays {

    public ArrayList<ArrayList<Integer>> data;
    public int filas;
    public int columnas;

    public Matriz3x3arrays() {
        filas = 3;
        columnas = 3;
        data = new ArrayList<>();

        for (int i = 0; i < filas; i++) {
            data.add(new ArrayList<Integer>());
            for (int j = 0; j < columnas; j++) {
                data.get(i).add(0);
            }
        }
    }

    public void cargar() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("data[" + i + "][" + j + "]: ");
                data.get(i).set(j, sc.nextInt());
            }
        }
    }

    public void imprimir() {
        System.out.println("\nMatriz 3x3:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(data.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matriz3x3arrays m = new Matriz3x3arrays();
        m.cargar();
        m.imprimir();
    }
}