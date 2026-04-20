/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz2x2;


public class Matriz2x2 {
    private int[][] data;
    private int filas = 2;
    private int columnas = 2;

    public Matriz2x2() {
        data = new int[filas][columnas];
    }

    public void setValor(int fila, int columna, int valor) {
        data[fila][columna] = valor;
    }

    public int getValor(int fila, int columna) {
        return data[fila][columna];
    }

    public Matriz2x2 sumar(Matriz2x2 otra) {
        Matriz2x2 resultado = new Matriz2x2();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.setValor(i, j, this.getValor(i, j) + otra.getValor(i, j));
            }
        }
        return resultado;
    }

    public Matriz2x2 multiplicar(Matriz2x2 otra) {
        Matriz2x2 resultado = new Matriz2x2();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int suma = 0;
                for (int k = 0; k < filas; k++) {
                    suma += this.getValor(i, k) * otra.getValor(k, j);
                }
                resultado.setValor(i, j, suma);
            }
        }
        return resultado;
    }

    public void imprimir() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(getValor(i, j) + " ");
            }
            System.out.println();
        }
    }
}