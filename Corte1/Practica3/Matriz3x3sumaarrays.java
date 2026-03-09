/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz3x3sumaarrays;


import java.util.ArrayList;
import java.util.Scanner;

public class Matriz3x3sumaarrays {

    public ArrayList<ArrayList<Integer>> data;
    public int filas;
    public int columnas;

    public Matriz3x3sumaarrays() {
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
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(data.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static Matriz3x3sumaarrays sumar(Matriz3x3sumaarrays a, Matriz3x3sumaarrays b) {

        Matriz3x3sumaarrays resultado = new Matriz3x3sumaarrays();

        for (int i = 0; i < a.filas; i++) {
            for (int j = 0; j < a.columnas; j++) {

                int suma = a.data.get(i).get(j) + b.data.get(i).get(j);
                resultado.data.get(i).set(j, suma);

            }
        }

        return resultado;
    }

    public static void main(String[] args) {

        Matriz3x3sumaarrays m1 = new Matriz3x3sumaarrays();
        Matriz3x3sumaarrays m2 = new Matriz3x3sumaarrays();

        System.out.println("Ingrese datos de la matriz 1");
        m1.cargar();

        System.out.println("Ingrese datos de la matriz 2");
        m2.cargar();

        Matriz3x3sumaarrays suma = sumar(m1, m2);

        System.out.println("Matriz 1:");
        m1.imprimir();

        System.out.println("Matriz 2:");
        m2.imprimir();

        System.out.println("Suma de matrices:");
        suma.imprimir();
    }
}