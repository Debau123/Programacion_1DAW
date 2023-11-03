package Ejercicios_Classe;

import java.util.Scanner;

public class Ejercicio_String_Que_Hacemos_Nosotros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = entrada.nextLine();
        int cuenta = 0;
        System.out.println(frase.length()+" letras");
        for( int i =0; i<frase.length(); i++){
            System.out.println(frase.substring(i,i+1));
        }

    }


}

