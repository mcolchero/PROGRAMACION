package U2.Entregable2021;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        boolean primo = true;
        System.out.println("Por favor, introduce un numero entero positivo ");
        int n = teclado.nextInt();
        int cont = 0;
        while (cont < 5) {
            System.out.println(n);
            primo = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(" es primo.");
            }
            else {
                System.out.println(" no es primo.");
            }
            n++;
            cont++;

            }
        }
    }