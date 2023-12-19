package Ejercicios_numeros_aleatorios;

import java.sql.SQLOutput;
import java.util.Scanner;


    public class Ejercicio_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Escribe 'dame una carta' para obtener una carta: ");
            String PALABRA = scanner.nextLine();

            if ("dame una carta".equals(PALABRA)) {
                int clase = (int) (Math.floor(Math.random() * (1 - 4 + 1) + 4));
                int carta;

                switch (clase) {
                    case 1:
                        carta = (int) (Math.floor(Math.random() * (1 - 13 + 1) + 13));
                        if (carta == 11) {
                            System.out.println("La carta que te a tocado es J DE CORAZONES");
                        } else if (carta == 12) {
                            System.out.println("La carta que te a tocado es la Q DE CORAZONES");
                        } else if (carta == 13) {
                            System.out.println("La carta que te a tocado es la K DE CORAZONES");
                        } else if (carta == 1) {
                            System.out.println("La carta que te a tocado es el AS DE CORAZONES");
                        } else {
                            System.out.println("Te tocado el " + carta + "  De CORAZONES");
                        }
                        break;

                    case 2:
                        carta = (int) (Math.floor(Math.random() * (1 - 13 + 1) + 13));
                        if (carta == 11) {
                            System.out.println("La carta que te a tocado es J DE PICAS");
                        } else if (carta == 12) {
                            System.out.println("La carta que te a tocado es la Q DE PICAS");
                        } else if (carta == 13) {
                            System.out.println("La carta que te a tocado es la K DE PICAS");
                        } else if (carta == 1) {
                            System.out.println("La carta que te a tocado es el AS DE PICAS");
                        } else {
                            System.out.println("Te tocado el " + carta + "  De PICAS");
                        }
                        break;
                    case 3:
                        carta = (int) (Math.floor(Math.random() * (1 - 13 + 1) + 13));
                        if (carta == 11) {
                            System.out.println("La carta que te a tocado es J DE DIAMANTES");
                        } else if (carta == 12) {
                            System.out.println("La carta que te a tocado es la Q DE DIAMANTES");
                        } else if (carta == 13) {
                            System.out.println("La carta que te a tocado es la K DE DIAMANTES");
                        } else if (carta == 1) {
                            System.out.println("La carta que te a tocado es el AS DE DIAMANTES");
                        } else {
                            System.out.println("Te tocado el " + carta + "  De  DIAMANTES");
                        }
                        break;

                    case 4:
                        carta = (int) (Math.floor(Math.random() * (1 - 13 + 1) + 13));
                        if (carta == 11) {
                            System.out.println("La carta que te a tocado es J DE TREVOLES");
                        } else if (carta == 12) {
                            System.out.println("La carta que te a tocado es la Q DE TREVOLES");
                        } else if (carta == 13) {
                            System.out.println("La carta que te a tocado es la K DE TREVOLES");
                        } else if (carta == 1) {
                            System.out.println("La carta que te a tocado es el AS DE TREVOLES");
                        } else {
                            System.out.println("Te tocado el " + carta + "  De TREVOLES");

                        }
                        break;
                }


            } else {
                System.out.println("No has escrito 'dame una carta'. El programa se ha detenido.");
            }
        }
    }













