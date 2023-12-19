package Ejercicios_String;

public class split {
    public static void main(String[] args) {
        String Frase = "hola ,mundo, hola ,gente";
        String [] array1 = Frase.split(",");
        System.out.println("Subcaneda quedaria ");
        for (String elemento : array1){
            System.out.println(elemento);
        }

    }
}
