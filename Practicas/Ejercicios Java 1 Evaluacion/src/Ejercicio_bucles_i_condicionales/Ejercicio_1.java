package Ejercicio_bucles_i_condicionales;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        System.out.println("*******************************");
        System.out.println("******* MENU d'OPCIONS ********");
        System.out.println("*******************************");
        System.out.println("      1. Permutar dos valors.  ");
        System.out.println("      2. Sumatori.             ");
        System.out.println("      3. Màxim i mínim.        ");
        System.out.println("      4. Números primers.      ");
        System.out.println("      5. Eixir.                ");
        System.out.println("*******************************");
        Scanner entrada = new Scanner(System.in);
        int elegir = entrada.nextInt();

        switch (elegir) {

            case 1:

                System.out.println("Dame dos numeros y los intercambiaremos:");
                System.out.println("Dame el primer numero: ");
                int num1 = entrada.nextInt();
                System.out.println("Dame el segundo numero:  ");
                int num2 = entrada.nextInt();
                System.out.println("El valor del numero 1 es " + num1);
                System.out.println("El valor del numero 2 es " + num2);
                int permutar = num1;
                num1 = num2;
                num2 = permutar;
                System.out.println("Ahora el valor del numero 1 es " + num1);
                System.out.println("Ahora el valor del numero 2 es " + num2);
                break;

            case 2:

                System.out.println("Sumador. El programa pedirá 2 valores enteros y sumará todos los valores desde el primero hasta el segundo.");
                System.out.println("Dame el primer numero");
                num1 = entrada.nextInt();
                System.out.println("Dame el segundo numero");
                num2 = entrada.nextInt();
                int sumatorio = 0;
                for (int i = num1; i <= num2; i++) {
                    sumatorio += i;
                }
                System.out.println("La suma de los valores desde " + num1 + " hasta " + num2 + " es: " + sumatorio);
                break;

            case 3:
                System.out.println(" Máximo y Mínimo. El programa solicitará valores por pantalla hasta que se cumpla" +
                        " una condición de finalización (por ejemplo, salida = -999) y mostrará en pantalla cuáles son los valores máximo y mínimo introducidos.");

                System.out.println("Introduce el numero");
                int numero = entrada.nextInt();
                int maximo = numero;
                int minimo = numero;
                while (numero != -999) {

                    if (numero > maximo) {
                        maximo = numero;
                    }
                    if (numero < minimo) {
                        minimo = numero;
                    }
                    System.out.println("Sigiente numero");
                    numero = entrada.nextInt();
                }
                System.out.println("El numero maximo " + maximo + " el numero minimo es " + minimo);
                break;
            case 4:

                System.out.println("Números Primos. El programa solicitará un valor entero positivo por pantalla y mostrará todos los números primos hasta ese valor");
                System.out.println("Dime el numero :");
                int limite_inferior = 1;
                int limite_superior = entrada.nextInt();
                System.out.println(" Los numeros primos hasta " + limite_superior + " son:");

                for (int i = limite_inferior; i <= limite_superior; i++) {
                    int divisidores = 0;
                    for (int j = 1; j <= i / 2; j++) {
                        if (i % j == 0) {
                            divisidores += 2;
                        }
                        if (divisidores > 2) {
                            break;
                        }
                    }
                    if (divisidores == 2) {
                        System.out.print(" " + i + " ");
                    }
                }

            case 5:
                System.out.println("Hasta luego5");
                break;

            default:
                System.out.println("No has introducido un numero valido vuelvo a la intentar con 1, 2, 3, 4, 5.");



        }


    }
}

