package Ejercicios_Classe;

import java.util.Scanner;
public class Ejemplo_bucle_classe {
        public static void main(String[] args) {
            Scanner teclat = new Scanner(System.in);
            int numeroIntroduït = 0; // Per a que entre en el bucle
            int comptaNumeros = 0;
            int suma = 0;
            System.out.println("Per favor, introdueix números i ves polzant INTRO.");
            System.out.println("Per finalitzar, introdueix un número negatiu.");
            while (numeroIntroduït >= 0) {
                numeroIntroduït = teclat.nextInt();
                comptaNumeros++; // Incrementa en un la variable
                suma += numeroIntroduït; // Equival a suma = suma + numeroIntroduït
            }
            System.out.println("Has introduït " + (comptaNumeros - 1) + " números positivos.");
            System.out.println("La suma total de ellos es " + (suma - numeroIntroduït));
        } //Del main()
    } // de la classe

