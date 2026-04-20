/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz3x3;

import java.util.Scanner;

public class Main3x3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matriz3x3 m1 = new Matriz3x3();
        Matriz3x3 m2 = new Matriz3x3();

        System.out.println("Llenar Matriz 1 (3x3):");
        llenar(m1, sc);
        System.out.println("Llenar Matriz 2 (3x3):");
        llenar(m2, sc);

        System.out.println("\nSuma:");
        m1.sumar(m2).imprimir();

        System.out.println("\nMultiplicación:");
        m1.multiplicar(m2).imprimir();
    }

    public static void llenar(Matriz3x3 m, Scanner sc) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posición [" + i + "][" + j + "]: ");
                m.setValor(i, j, sc.nextInt());
            }
        }
    }
}