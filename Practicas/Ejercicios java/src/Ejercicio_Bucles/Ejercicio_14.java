package Ejercicio_Bucles;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el dinero que te quieres gastar te dire los billetes que necesitas:");
        System.out.println("Tiene que ser multiplo de 5 ");
        int billetes = entrada.nextInt();
        int billete= billetes;
        int billete_500 = 0;
        int billete_200 = 0;
        int billete_100 = 0;
        int billete_50 = 0;
        int billete_20 = 0;
        int billete_10 = 0;
        int billete_5 = 0;
        if (billetes % 5 > 0) {
            System.out.println("Introduce un numero multiple de 5");
        }while (true){
            if(billete >=500){
                billete -= 500;
                billete_500++;
            } else if (billete >=200){
                billete -= 200;
                billete_200++;
            } else if(billete >=100){
                billete -= 100;
                billete_100++;
            } else if (billete >=50){
                billete -= 50;
                billete_50++;
            } else if (billete >=20){
                billete -= 20;
                billete_20++;
            } else if(billete >=10){
                billete -= 10;
                billete_10++;
            } else if (billete >=5) {
                billete -= 5;
                billete_5++;
            }else
                break;

        }
        System.out.println("Para pagar "+billetes+" necesitaras "+billete_500+" billetes de 500,  "+billete_200+" billetes de 200,  "
                +billete_100+" billetes de 100,  "+billete_50+" billetes de 50,  "+billete_20+" billetes de 20,  "+billete_10+" billetes de 10,  " +
               +billete_5+ " billetes de 5.");
    }
}
