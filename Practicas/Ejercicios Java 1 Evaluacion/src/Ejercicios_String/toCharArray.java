package Ejercicios_String;

public class toCharArray {
    public static void main(String[] args) {
        String Frase = "Hola Mundo Hola Gente";
        char [] array1 = Frase.toCharArray();
        System.out.print("Array de caracteres: [");
        for (char elemento  : array1){
            System.out.print( elemento+" ,");
        }
        System.out.println("]");

    }
}
