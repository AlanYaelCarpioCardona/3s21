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
public class TareapilaABC {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el tamaño de las pilas: ");
        int tamaño = scanner.nextInt();

        
        Stack<Character> pilaA = new Stack<>();
        Stack<Integer> pilaB = new Stack<>();

        
        for (int i = 0; i < tamaño; i++) {
            char letraAleatoria = (char) (Math.random() * 26 + 'A');
            pilaA.push(letraAleatoria);
        }

       
        for (int i = 0; i < tamaño; i++) {
            int múltiploDeTres = (int) (Math.random() * 10) * 3;
            pilaB.push(múltiploDeTres);
        }

       
        Stack<Object> pilaC = new Stack<>();
        while (!pilaA.isEmpty() && !pilaB.isEmpty()) {
            pilaC.push(pilaA.pop());
            pilaC.push(pilaB.pop());
        }

       
        System.out.println("Pila C: " + pilaC);
    }
}

class PilaA {
    private Stack<Character> pila;

    public PilaA(int tamaño) {
        pila = new Stack<>();
        for (int i = 0; i < tamaño; i++) {
            char letraAleatoria = (char) (Math.random() * 26 + 'A');
            pila.push(letraAleatoria);
        }
    }

    public Stack<Character> getPila() {
        return pila;
    }
}

class PilaB {
    private Stack<Integer> pila;

    public PilaB(int tamaño) {
        pila = new Stack<>();
        for (int i = 0; i < tamaño; i++) {
            int múltiploDeTres = (int) (Math.random() * 10) * 3;
            pila.push(múltiploDeTres);
        }
    }

    public Stack<Integer> getPila() {
        return pila;
    }
}