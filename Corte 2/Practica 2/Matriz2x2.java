package com.mycompany.matriz2x2;

import java.util.Scanner;

public class Matriz2x2 {

    private int[][] data;
    private int filas;
    private int columnas;

    public Matriz2x2() {
        filas = 2;
        columnas = 2;
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
        System.out.println("\nMatriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(getValor(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matriz2x2 m = new Matriz2x2();
        m.cargar();
        m.imprimir();
    }
}