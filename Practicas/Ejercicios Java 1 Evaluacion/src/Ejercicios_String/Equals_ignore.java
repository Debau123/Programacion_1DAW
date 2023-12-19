package Ejercicios_String;

public class Equals_ignore {
    public static void main(String[] args) {
        String Frase = "Estoy haciendo ejercicios programación";
        String Frase1= "ESTOY HACIENDO EJERCICIOS PROGRAMACIÓN";
        Boolean resultaso = Frase.equalsIgnoreCase(Frase1);
        System.out.println(resultaso);

    }
}
