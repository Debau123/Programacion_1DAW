package Ejercicios_Classe;

import java.util.Scanner;

public class Ejercicio_classe2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Qué edad tienes?: ");
        int edad = entrada.nextInt();
        System.out.println("¿Cuál es la antigüedad en tu empleo?: ");
        int antiguedad = entrada.nextInt();

        if (edad >= 60 && antiguedad < 25) {
            System.out.println("Estás jubilado por edad");
        } else if (edad >= 60 && antiguedad >= 25) {
            System.out.println("Estás jubilado por antigüedad joven");
        } else if (edad < 60 && antiguedad >= 25) {
            System.out.println("Estás jubilado por antigüedad adulta");
        } else {
            System.out.println("Aún te toca trabajar, amigo");
        }
    }
}
