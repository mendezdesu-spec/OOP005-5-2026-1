/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz.pkg2x2arrays;



import java.util.ArrayList;
import java.util.Scanner;

public class Matriz2x2arrays {

    public ArrayList<ArrayList<Integer>> data;
    public int filas;
    public int columnas;

    public Matriz2x2arrays() {
        filas = 2;
        columnas = 2;
        data = new ArrayList<>();

        for (int i = 0; i < filas; i++) {
            data.add(new ArrayList<>());
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
        System.out.println("\nMatriz 2x2:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(data.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matriz2x2arrays m = new Matriz2x2arrays();
        m.cargar();
        m.imprimir();
    }
}