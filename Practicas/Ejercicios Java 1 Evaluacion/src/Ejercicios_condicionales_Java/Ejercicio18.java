package Ejercicios_condicionales_Java;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        int horas;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Cuantas horas has trabajado?");
        int Horas = Entrada.nextInt();
        System.out.println("Cuanto paga la hora tu empresa?");
        int Precio_hora = Entrada.nextInt();
        double salario;
        if (Horas >= 35) {
            salario = Horas * Precio_hora;
            if (salario <= 500) {
                System.out.println("Tu salario de esta semana es " + salario);
            } else if (salario <= 900) {
                salario = ((salario - 500) * 0.25) + 500;
                System.out.println("Tu salario de esta semana es " + salario);
            } else {
                salario = (salario - 900) * 0.45 + (400 * 0.25) + 500;
                System.out.println("Tu salario de esta semana es  " + salario);
            }
        } else {
            salario = (35 * Precio_hora) + ((Horas - 35) * 1.5);
            if (salario <= 500) {
                System.out.println("Tu salario de esta semana es " + salario);
            } else if (salario <= 900) {
                salario = ((salario - 500) * 0.25) + 500;
                System.out.println("Tu salario de esta semana es " + salario);
            } else {
                salario = (salario - 900) * 0.45 + (400 * 0.25) + 500;
                System.out.println("Tu salario de esta semana es  " + salario);
            }
        }

    }

}

