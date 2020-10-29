package U2.Entregable2021;

import java.util.Scanner;

public class ej1 {
    // Realiza un programa que pinte por pantalla un rombo hueco hecho con
    // asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
    // sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
    // mensaje de error y volverlo a pedir hasta que sea correcto.


    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.println("Introduce una altura: ");
        int altura = teclado.nextInt();
        int altura1 = (altura/2)+1;
        int altura2 = altura/2;


        for (int fila = 0; fila < altura1; ++fila) {
            for (int columna = 0; columna < altura1-fila-1; ++columna) {
                System.out.print(" ");
            }
            for (int columna = 0; columna < 2*fila+1; ++columna) {
                if ((columna == 0) || (columna == 2*fila)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        int columna = 0;
        for (int fila = 1; fila <= altura2; ++fila) {
            columna = 1;
            while (columna <= fila){
                System.out.print(" ");
                columna++;
            }
            int rombo = (altura - fila*2);
            for (int i = 1; i <= rombo; i++){
                if ((i == 1) || (i == rombo)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}