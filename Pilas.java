/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas;

import java.util.Scanner;

/**
 *
 * @author Tesoem
 */
public class Pilas {
    static int tope = 0;
    static int t = 0;
    static int opt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tamaño de pila");
        t = sc.nextInt();
        int[] pila = new int[t];

        do {
            System.out.println("""
                               a- add
                               2-show
                               3-eliminar
                               4-salir
                               """);
            opt = sc.nextInt();

            switch (opt) {
                case 1 -> {
                    if (tope < t) { // Check if the stack is not full
                        System.out.println("agrega el valor");
                        pila[tope] = sc.nextInt();
                        tope++;
                    } else {
                        System.out.println("La pila está llena. No se puede agregar más elementos.");
                    }
                }
                case 2 -> {
                    for (int i = tope - 1; i >= 0; i--) {
                        System.out.println(pila[i]);
                    }
                }
                case 3 -> {
                    if (tope > 0) { // Check if the stack is not empty
                        tope--;
                    } else {
                        System.out.println("La pila está vacía. No se puede eliminar elementos.");
                    }
                }
            }
        } while (opt != 4);
    }
}