package Ejercicios_Classe;

import java.util.Scanner;

public class Ejercico_classe1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime ticket compra?: ");
        double ticket = entrada.nextDouble();
        System.out.println("Dime el color de la bola?: ");
        String color = entrada.next();

        if (color.equals("blanca")) {
            System.out.println("Tu precio es " + ticket);
        } else if (color.equals("verde")) {
            ticket = (ticket * 0.90);
            System.out.println("Tu precio es " + ticket);
        } else if (color.equals("amarilla")) {
            ticket = (ticket * 0.75);
            System.out.println("Tu precio es " + ticket);
        } else if (color.equals("azul")) {
            ticket = (ticket * 0.50);
            System.out.println("Tu precio es " + ticket);
        } else if (color.equals("rojo")) {
            System.out.println("Que suerte tu compra gratis");
        } else {
            System.out.println("El color no esta en la lista asi pues pagas " + ticket);
        }
    }
}


