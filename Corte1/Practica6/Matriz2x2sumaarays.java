/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz2x2sumaarays;


import java.util.ArrayList;
import java.util.Scanner;

public class Matriz2x2sumaarays {


    public ArrayList<ArrayList<Integer>> data;
    public int filas;
    public int columnas;

    public Matriz2x2sumaarays() {
        filas = 2;
        columnas = 2;
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
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(data.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static Matriz2x2sumaarays sumar(Matriz2x2sumaarays a, Matriz2x2sumaarays b) {

        Matriz2x2sumaarays resultado = new Matriz2x2sumaarays();

        for (int i = 0; i < a.filas; i++) {
            for (int j = 0; j < a.columnas; j++) {

                int suma = a.data.get(i).get(j) + b.data.get(i).get(j);
                resultado.data.get(i).set(j, suma);

            }
        }

        return resultado;
    }

    public static void main(String[] args) {

        Matriz2x2sumaarays m1 = new Matriz2x2sumaarays();
        Matriz2x2sumaarays m2 = new Matriz2x2sumaarays();

        System.out.println("Ingrese datos de la matriz 1");
        m1.cargar();

        System.out.println("Ingrese datos de la matriz 2");
        m2.cargar();

        Matriz2x2sumaarays suma = sumar(m1, m2);

        System.out.println("Matriz 1:");
        m1.imprimir();

        System.out.println("Matriz 2:");
        m2.imprimir();

        System.out.println("Suma de matrices:");
        suma.imprimir();
    }
}