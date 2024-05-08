import java.util.Scanner;

public class Ejercicio_opcional3 {
    public static void main(String[] args) {

   String Palabra= cadena_1( );
   String Palabra2= InvertirCadena(Palabra);
        System.out.println(Palabra2);


    }
    public static String cadena_1(){
        System.out.println("Introduce la plabra espejo:");
        Scanner Entrada= new Scanner(System.in);
        String frase1  = Entrada.nextLine();
        return frase1;
    }
    public static String InvertirCadena(String cadena_1) {
        String cadenaInvertida = cadena_1;

        for (int x = cadena_1.length() - 2; x >= 0; x--)

            cadenaInvertida = cadenaInvertida + cadena_1.charAt(x);


        return cadenaInvertida;
    }


}
