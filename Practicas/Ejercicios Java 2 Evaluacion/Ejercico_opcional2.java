import java.util.Scanner;

public class Ejercico_opcional2 {
    public static void main(String[] args) {
        String frase1 = cadena_1();
        String frase2 = cadena_2();
        String resultado = Mayuscula(frase1, frase2);
        System.out.println("Resultado: " + resultado);
    }

    public static String cadena_1(){
        System.out.println("Dime la primera frase:");
        Scanner Entrada= new Scanner(System.in);
        String frase1  = Entrada.nextLine();
        return frase1;
    }

    public static String cadena_2(){
        System.out.println("Que palabra quieres en mayuscula:");
        Scanner Entrada= new Scanner(System.in);
        String frase1  = Entrada.nextLine();
        return frase1;
    }

    public static String Mayuscula(String frase1, String frase2){
        int indice = frase1.indexOf(frase2);

        if (indice != -1) {
            String parteMayuscula = frase1.substring(indice, indice + frase2.length()).toUpperCase();
            return frase1.substring(0, indice) + parteMayuscula + frase1.substring(indice + frase2.length());
        } else {
            System.out.println("La segunda cadena no se encuentra en la primera.");
            return frase1;
        }
    }
}











