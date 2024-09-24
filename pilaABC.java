/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareapilaabc;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Alan
 */
public class pilaABC {
     
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Stack<Character> pilaA = new Stack<>();
    Stack<Integer> pilaB = new Stack<>();
    Stack<String> pilaC = new Stack<>();

    while (true) {
        System.out.println("Menú de interacciones:");
        System.out.println("1. Llenar pilas A y B");
        System.out.println("2. Unir A+B");
        System.out.println("3. Mostrar pila C");
        System.out.println("4. Salir");

        System.out.print("Ingrese su opción: ");
        int opción = scanner.nextInt();

        switch (opción) {
            case 1:
                System.out.print("Ingrese el tamaño de las pilas A y B: ");
                int tamaño = scanner.nextInt();
                pilaA = new Stack<>();
                pilaB = new Stack<>();
                for (int i = 0; i < tamaño; i++) {
                    char letraAleatoria = (char) (Math.random() * 26 + 'A');
                    pilaA.push(letraAleatoria);
                    int múltiploDeTres = (int) (Math.random() * 10) * 3;
                    pilaB.push(múltiploDeTres);
                }
                System.out.println("Pilas A y B llenadas con éxito:D");
                break;
            case 2:
                if (pilaA.isEmpty() || pilaB.isEmpty()) {
                    System.out.println("No se puede unir A+B porque alguna de las pilas está vacía.");
                } else {
                    pilaC = new Stack<>();
                    while (!pilaA.isEmpty() && !pilaB.isEmpty()) {
                        char letra = pilaA.pop();
                        int número = pilaB.pop();
                        pilaC.push(letra + "" + número);
                    }
                    System.out.println("Pilas A+B unidas con éxito:D");
                }
                break;
            case 3:
                if (pilaC.isEmpty()) {
                    System.out.println("No se puede mostrar pila C porque está vacía.");
                } else {
                    System.out.println("Pila C:");
                    int tope = 0;
                    while (!pilaC.isEmpty()) {
                        System.out.println( pilaC.pop());
                        tope++;
                    }
                }
                break;
            case 4:
                System.out.println("Saliendo del programa.");
                return;
            default:
                System.out.println("Error, Por favor ingrese una opción válida.");
        }
    }
}}