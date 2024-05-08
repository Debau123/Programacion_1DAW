package Ejercicio_2;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Creador_de_persona {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        Persona Persona1 = new Persona();
        Persona Persona2 = new Persona();


        System.out.println("Que nombre tiene Persona1?");
       Persona1.nom = Entrada.next();
        System.out.println(Persona1.nom+" que dni tiene? ");
        Persona1.dni =Entrada.next();
        System.out.println(Persona1.nom+ " que edad tiene?");
        Persona1.edat = Entrada.nextInt();
        System.out.println(Persona1.nom+ " que cognoms tiene?");
        Persona1.cognomss = Entrada.next();

        System.out.println("Que nombre tiene Persona2?");
        Persona2.nom = Entrada.next();
        System.out.println(Persona2.nom+" que dni tiene? ");
        Persona2.dni =Entrada.next();
        System.out.println(Persona2.nom+ " que edad tiene?");
        Persona2.edat = Entrada.nextInt();
        System.out.println(Persona2.nom+ " que cognoms tiene?");
        Persona2.cognomss = Entrada.next();


        System.out.println(Persona1.nom+ " "+ Persona1.cognomss+" tiene "+ Persona1.edat+" con DNI " +Persona1.dni);
        System.out.println(Persona2.nom+ " "+ Persona2.cognomss+" tiene "+ Persona2.edat+" con DNI " +Persona2.dni);









    }






}
