package Ejercicios_Classe;

import java.util.Scanner;

public class Ejercicio_contraseña {
    public static void main(String[] args) {
        /* Nº mayusculas
           Nº minusculas
           Nº total de caracteres
           Nº digitos
           Nº caracteres especiales
         */
        Scanner teclado = new Scanner(System.in);
        //constantes para determinar valoes minimos
        final int totalCaracteres = 8;
        final int mayus =1;
        final int minus =2;
        final int numeros = 3;
        final int especiales =1;
        // Variable spara contar valores de cada topo
        int mayusCont = 0;
        int minusCont=0;
        int numCount =0;
        int especialCount =0;
        int caractersCount =0;
        String pass="";
        do {
            System.out.println("Escribe la pass:");
            pass = teclado.nextLine();
        }while (pass.length()<= totalCaracteres);
        for (int i =0; i < pass.length();i ++ ){
             char caracter = pass.charAt(i);
             if(Character.isLowerCase(caracter)){
                 minusCont++;
             } else if (Character.isUpperCase(caracter)){
                 mayusCont++;
             } else if (Character.isDigit(caracter)) {
                 numCount++;
             }else if ( caracter=='_' || caracter =='-' || caracter=='.' ){
                 especialCount++;
             }
        }
        if (mayusCont<mayus){
            System.out.println("Tu contraseña no cumple el numero minimo de mayusculas");
        }
        if (minusCont<minus) {
            System.out.println(" Tu contrseña no cumple el numero minimo de minusculas");
        }
        if (numCount<numeros){
            System.out.println("Tu pass no tiene el numero minimo de numeros");
        }if (especialCount<especiales){
            System.out.println("Tu pass no tiene caracteres especiales");
        }
        }



    }



