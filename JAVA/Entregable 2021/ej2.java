package U2.Entregable2021;

import java.util.Scanner;

public class ej2 {
    // Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
    // hay dentro de un número. Se recomienda usar long en lugar de int ya que el
    // primero admite números más largos.

    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);


        System.out.println("Introduzca un numero entero: ");

        long n = teclado.nextLong();
        int par = 0;
        int impar = 0;
        while (n > 0) {
            int cifra = (int) (n % 10);
            if (cifra % 2 == 0) {

                par++;
            }

            else {
                impar++;
            }

            n = n / 10;
        }
        System.out.println("Hay " + par + " pares y " + impar + " impares");


    }
}