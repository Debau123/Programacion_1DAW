import java.util.Scanner;

public class Nivel_1 {
    public static void main(String[] args) {


        int S1 = (int) (Math.random() * 10) + 1; //Aqui cremamos la variante S1 entre 1 y 10 incluido los 2
        int S2 = (int) (Math.random() * 11) + 20; //Aqui cremaos la variante S2 entre los numeros 20 y 30 incluido ambos.
        int sumatorio = 0;//Aqui declaro he inicio la variable sumatorio para tener el sumatorio la respuesta guardada
        for (int i = S1; i <= S2; i++) {//  aqui ejecuto un bucle para obtener la respuesta del sumatorio de S1 Y S2 ambos incluidos
            sumatorio = i + sumatorio;
        }
        System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al\n" +
                "sistema " + S1 + " en el sector " + S2 + " ,pero el sistema de navegación está estropeado y el\n" +
                "computador tiene problemas para calcular parte de las coordenadas de salto.\n" +
                "Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.\n" +
                "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que\n" +
                "calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).\n" +
                "¿Qué debe introducir?");

        Scanner entrada = new Scanner(System.in);// declaro el scaner
        int resultado = entrada.nextInt(); // Declaro la variable resultaod que sera el numero que escriba el jugador
        if (resultado == sumatorio) {
            System.out.println("pasas al sigiente nivel");
        } else {
            System.out.println("Game Over");
        }


    }

}
