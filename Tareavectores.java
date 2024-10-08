/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareavectores;
 import java.util.Scanner;

public class Tareavectores {
    static int letras = 26;
    static int opcion = 0;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("El tamaño del Vector es 26");
            char[] VectorA = new char[letras];
            
            do {
                System.out.println("""
                                   1- Generar Vector
                                   2- Ordenar por el m\u00e9todo Bubble Sort
                                   3- Mostrar el Vector A
                                   4- Salir""");
                
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1 -> llenarVector(VectorA);
                        
                    case 2 -> bubbleSort(VectorA);
                        
                    case 3 -> mostrarVector(VectorA);
                        
                    case 4 -> System.out.println("Saliendo del programa...");
                        
                    default -> System.out.println("Opción no válida. Intente nuevamente.");
                }
            } while (opcion != 4);
        }
    }

    public static void llenarVector(char[] Vector ) {
        boolean[] usadas = new boolean[26]; // Array que marca si una letra ya fue usada
        int Temporal = 0; 
    
        while (Temporal < Vector.length) {
            char letra = (char) ('A' + (int) (Math.random() * 26));
    
            // Verificar si la letra ya fue usada
            if (!usadas[letra - 'A']) {
                Vector[Temporal] = letra;           
                usadas[letra - 'A'] = true;       
                Temporal++;                      
            }
        }
        System.out.println("Vector A generado sin repeticiones.");
        }

    public static void mostrarVector(char[] Vector ) {
        if (Vector .length > 0) {
            System.out.println("Elementos del Vector A:");
            for (int i = 0; i < Vector .length; i++) {
                System.out.print(Vector[i]+ "  ");
            }
            System.out.println();
        } else {
            System.out.println("El vector A está vacío.");
        }
    }
    public static void bubbleSort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Vector A ordenado.");
    }
}
   
    

