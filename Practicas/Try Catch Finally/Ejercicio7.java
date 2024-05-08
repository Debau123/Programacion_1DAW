import java.util.Scanner;

public class Ejercicio7 {

        // Función esperaSegons para pausar el programa durante 'segundos' segundos
        public static void esperaSegons(int segundos) throws InterruptedException {
            // Convertir los segundos a milisegundos (1 segundo = 1000 milisegundos)
            long milisegundos = segundos * 1000;
            try {
                Thread.sleep(milisegundos); // Pausar el programa por el tiempo especificado en milisegundos
            } catch (InterruptedException e) {
                // Si se lanza InterruptedException, relanzar la excepción
                throw e;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Introduce el número de segundos a esperar: ");
                int segundos = scanner.nextInt();

                // Llamar a esperaSegons con el número de segundos especificado por el usuario
                esperaSegons(segundos);

                // Después de esperar, solicitar un mensaje antes de finalizar
                System.out.println("Finalitzar");

            } catch (InterruptedException e) {
                // Capturar y manejar la excepción InterruptedException (relanzada desde esperaSegons)
                System.err.println("La espera ha sido interrumpida: " + e.getMessage());

            } catch (Exception e) {
                // Capturar y manejar otras posibles excepciones
                System.err.println("Ha ocurrido un error: " + e.getMessage());

            } finally {
                // Cerrar el scanner al finalizar
                scanner.close();
            }
        }
    }





