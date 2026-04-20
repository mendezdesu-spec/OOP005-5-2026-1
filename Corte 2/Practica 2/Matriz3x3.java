/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz3x3;



    public class Matriz3x3 {
    private int[][] data;
    private int filas = 3;
    private int columnas = 3;

    public Matriz3x3() {
        data = new int[filas][columnas];
    }

    public void setValor(int fila, int columna, int valor) {
        data[fila][columna] = valor;
    }

    public int getValor(int fila, int columna) {
        return data[fila][columna];
    }

    public Matriz3x3 sumar(Matriz3x3 otra) {
        Matriz3x3 resultado = new Matriz3x3();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.setValor(i, j, this.getValor(i, j) + otra.getValor(i, j));
            }
        }
        return resultado;
    }

    public Matriz3x3 multiplicar(Matriz3x3 otra) {
        Matriz3x3 resultado = new Matriz3x3();
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