import java.util.Scanner;

public class Ejercicio_opcional {
    public static void main(String[] args) {

    String palabra = pedir_palabra();
        int intentos = 3;

        while (intentos > 0) {
            String respuesta = Respuesta();

            if (Comparar(palabra, respuesta)) {
                System.out.println("¡La palabra es correcta!");
                break;
            } else {
                intentos--;
                System.out.println("La palabra no es correcta. Te quedan " + intentos + " intentos.");
            }
        }

        if (intentos == 0) {
            System.out.println("¡Has agotado todos tus intentos! La palabra secreta era: " + palabra);
        }
    }
    public static String pedir_palabra() {
        System.out.println("Dime la palabra secreta");
        Scanner Entrada= new Scanner(System.in);
        String secreta = Entrada.nextLine();
        return secreta;
    }
    public static String Respuesta(){
        System.out.println(" Que palabra crees que es:");
        Scanner Entrada= new Scanner(System.in);
        String palabra = Entrada.nextLine();
        return palabra;

    }
   public static boolean Comparar(String palabra,String respuesta){
       return palabra.equals(respuesta);
   }

}
