package Ejercicios_Classe;

public class Ejercicio_String {
    public static void main(String[] args) {


        String [] palabras= {"Sevilla", "Valencia", "Madrid","Atletic","Bilbao"};
        String larga ="";
        int letras = 0;

        for(int index=0;index< palabras.length;index++){
            if (palabras[index].length() >= larga.length()){
                larga = palabras[index];
            }

        }letras = larga.length();
        System.out.println("La palabra mas larga es "+ larga+" con  "+letras +" letras");





    }


}
