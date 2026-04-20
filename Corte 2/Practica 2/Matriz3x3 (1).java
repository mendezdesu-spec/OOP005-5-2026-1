package com.mycompany.matriz3x3;

import java.util.Scanner;

public class Matriz3x3 {

    private int[][] data;
    private int filas;
    private int columnas;

    public Matriz3x3() {
        filas = 3;
        columnas = 3;
        data = new int[filas][columnas];
    }

    public void cargar() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("data[" + i + "][" + j + "]: ");
                setValor(i, j, sc.nextInt());
            }
        }
    }

    public void setValor(int fila, int columna, int valor) {
        data[fila][columna] = valor;
    }

    public int getValor(int fila, int columna) {
        return data[fila][columna];
    }

    public void imprimir() {
        System.out.println("\nMatriz 3x3:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(getValor(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matriz3x3 m = new Matriz3x3();
        m.cargar();
        m.imprimir();
    }
}