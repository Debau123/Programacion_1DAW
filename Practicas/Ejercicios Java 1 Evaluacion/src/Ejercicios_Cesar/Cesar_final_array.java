package Ejercicios_Cesar;

import java.util.Scanner;

public class Cesar_final_array {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int Programa;
        do {
            System.out.println("*******CIFRADO CESAR*******\n" +
                    "1. Cifrar la Frase\n" +
                    "2. Descifrar la frase\n" +
                    "3. Apaggar");
            Programa = Entrada.nextInt();
            Entrada.nextLine();

            switch (Programa) {

                case 1: {
                    Scanner entrada = new Scanner(System.in);
                    System.out.println("Dime la frase a cifrar");

                    String frase = entrada.nextLine();
                    String fraseCifrada = "";
                    char[] array_char = frase.toCharArray();
                    String min = "abcdefghijklmnopqrstuvwxyz";
                    String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

                    System.out.println("Introduce la clave de desplazamiento: ");
                    int desplazamiento = entrada.nextInt();

                    for (int i = 0; i < array_char.length; i++) {
                        char caracterActual = array_char[i];

                        if (Character.isLowerCase(caracterActual)) {
                            int indice = min.indexOf(caracterActual);
                            if (indice != -1) {
                                int nuevoIndice = (indice + desplazamiento) % min.length();
                                fraseCifrada += min.charAt(nuevoIndice);
                            } else {
                                fraseCifrada += caracterActual;
                            }
                        } else if (Character.isUpperCase(caracterActual)) {
                            int indice = may.indexOf(caracterActual);
                            if (indice != -1) {
                                int nuevoIndice = (indice + desplazamiento) % may.length();
                                fraseCifrada += may.charAt(nuevoIndice);
                            } else {
                                fraseCifrada += caracterActual;
                            }
                        } else {
                            fraseCifrada += caracterActual;
                        }
                    }

                    System.out.println("Frase original : " + frase);
                    System.out.println("Frase cifrada   : " + fraseCifrada);
                }
                break;
                case 2: {
                    Entrada = new Scanner(System.in); //Inicio Scaner
                    System.out.println("Dime la frase a descifrar");

                    String Frase = Entrada.nextLine(); //Almaceno Scaner
                    String fraseDescifrada = "";
                    char[] array_char = Frase.toCharArray(); //Mi String que es la frase la convierto en un array.
                    String min = "abcdefghijklmnopqrstuvwxyz";
                    String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

                    System.out.println("Introduce la clave de desplazamiento: ");
                    int desplazamiento = Entrada.nextInt();
                    for (int i = 0; i < array_char.length; i++) {
                        char caracterActual = array_char[i];

                        if (Character.isLowerCase(caracterActual)) {
                            int indice = min.indexOf(caracterActual);
                            if (indice != -1) {
                                int nuevoIndice = (indice - desplazamiento + min.length()) % min.length();
                                fraseDescifrada += min.charAt((nuevoIndice + min.length()) % min.length()); // Corrección aquí
                            } else {
                                fraseDescifrada += caracterActual;
                            }
                        } else if (Character.isUpperCase(caracterActual)) {
                            int indice = may.indexOf(caracterActual);
                            if (indice != -1) {
                                int nuevoIndice = (indice - desplazamiento + may.length()) % may.length();
                                fraseDescifrada += may.charAt((nuevoIndice + may.length()) % may.length()); // Corrección aquí
                            } else {
                                fraseDescifrada += caracterActual;
                            }
                        } else {
                            fraseDescifrada += caracterActual;
                        }
                    }

                    System.out.println("Frase cifrada   : " + Frase);
                    System.out.println("Frase descifrada: " + fraseDescifrada);

                }
                break;
                case 3: {
                    System.out.println("Saliendo del Programa. ¡Hasta Luego!");
                    break;
                }
                default: {
                    System.out.println("Opcion no valida. Introduce un numero valido");
                    break;
                }
            }
        } while (Programa != 3);
    }
}


