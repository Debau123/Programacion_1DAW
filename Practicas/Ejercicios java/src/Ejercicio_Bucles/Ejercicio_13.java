package Ejercicio_Bucles;

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
            Scanner entrada= new Scanner(System.in);
            int minimo=1;
            int maximo=100;
            int intentos=1;

        System.out.println("Piensa en un número del 1 al 100 y yo intentaré adivinarlo.");
        System.out.println("Cuando estés listo, ingresa 'igual' para comenzar.");

        String respuesta= entrada.next();
        if(!respuesta.equalsIgnoreCase("igual")){
            System.out.println("Debes introducir iguals para comenzar");
        }

        while (true){
            int intento = (minimo + maximo)/2;
            System.out.println("¿Es " + intento + " tu número?");
            System.out.println("Ingresa 'mayor' si es mayor, 'menor' si es menor, o 'igual' si he adivinado:");

            respuesta= entrada.next();

            if(!respuesta.equalsIgnoreCase("igual")){
                System.out.println("Lo hemos adivinado este es tu numero "+ intento+ " en "+intentos+" intentos");
                break;
            } else if (respuesta.equalsIgnoreCase("mayor")) {
                minimo = intento + 1;
            } else if (respuesta.equalsIgnoreCase("menor")) {
                maximo = intento - 1;
            } else {
                System.out.println("Por favor, ingresa 'mayor', 'menor' o 'igual'.");
            }
            intentos++;
            }

        }
    }

