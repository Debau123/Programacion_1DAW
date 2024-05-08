import java.util.Scanner;

public class Ejercicio_opcional4 {
    public static void main(String[] args) {

        String frase= cadena_1( );
        String frase_cambiada= cadena_2(frase);
        System.out.println("Aqui tienes la frase cambiada");
        System.out.println(frase_cambiada);

    }
    public static String cadena_1(){
        System.out.println("Dime la  frase que c:");
        Scanner Entrada= new Scanner(System.in);
        String frase1  = Entrada.nextLine();
        return frase1;
    }
    public static String cadena_2(String frase) {
        String frase_2 = "";
        int primer = frase.indexOf(" ");
        int ultimo = frase.lastIndexOf(" ");


        frase_2 = frase.substring(ultimo + 1, frase.length()) + frase.substring(primer, ultimo) +"  " + frase.substring(0, primer);

        return frase_2;
    }
}






















