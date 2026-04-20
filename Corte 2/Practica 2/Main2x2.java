/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz2x2;


import java.util.Scanner;

public class Main2x2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matriz2x2 m1 = new Matriz2x2();
        Matriz2x2 m2 = new Matriz2x2();

        System.out.println("Llenar Matriz 1 (2x2):");
        llenar(m1, sc);
        System.out.println("Llenar Matriz 2 (2x2):");
        llenar(m2, sc);

        System.out.println("\nSuma:");
        m1.sumar(m2).imprimir();

        System.out.println("\nMultiplicación:");
        m1.multiplicar(m2).imprimir();
    }

    public static void llenar(Matriz2x2 m, Scanner sc) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Posición [" + i + "][" + j + "]: ");
                m.setValor(i, j, sc.nextInt());
            }
        }
    }
}