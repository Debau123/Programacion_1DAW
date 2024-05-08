package Ejercicio_9;
import java.util.ArrayList;
import java.util.Scanner;

public class Veterinario {

        public static void main(String[] args) {
            ArrayList<Gat> gats = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce los datos de 5 gatos:");

            for (int i = 0; i < 5; i++) {
                try {

                    System.out.print("Nombre del gato " + (i + 1) + ": ");
                    String nombre = scanner.nextLine();
                    validarNombre(nombre);


                    System.out.print("Edad del gato " + (i + 1) + ": ");
                    int edad = Integer.parseInt(scanner.nextLine());
                    validarEdad(edad);


                    Gat gato = new Gat();
                    gato.setNombre(nombre);
                    gato.setEdat(edad);
                    gats.add(gato);

                } catch (NumberFormatException e) {
                    System.out.println("Error: Debes ingresar un número para la edad.");
                    i--;
                } catch (Gat.nombreValido | Gat.edadValida e) {
                    System.out.println("Error: " + e.getMessage());
                    i--;
                }
            }

            // Imprimir información de los gatos
            System.out.println("\nInformación de los gatos:");
            for (Gat gato : gats) {
                gato.imprimit();
            }
        }

        private static void validarNombre(String nombre) throws Gat.nombreValido {
            if (nombre.length() <= 3) {
                throw new Gat.nombreValido("El nombre debe tener más de 3 caracteres.");
            }
        }

        // Método para validar edad
        private static void validarEdad(int edad) throws Gat.edadValida {
            if (edad <= 0) {
                throw new Gat.edadValida("La edad no puede ser negativa o cero.");
            }
        }
    }


