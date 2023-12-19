package Ejercicios_String;

public class ValueOf {
    public static void main(String[] args) {
        int valor = 42;
        boolean verdadero=true;
        char caracter = 'A';
        String cadena = String.valueOf(valor)+" "+ String.valueOf(verdadero)+" "+String.valueOf(caracter);
        System.out.println(cadena);
    }
}
