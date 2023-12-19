package Ejercicios_voluntarios_array;

import javax.swing.*;

public class Ejercicio_4 {
    public static void main(String[] args) {

        int[] vector = new int[20];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número que quieres en la posición " + (i + 1)));
        }
          int sumatio_positivo = 0;
          int sumatorio_negativo = 0;
        for (int i = 0; i < vector.length; i++) {

            if(vector[i]>0){
                sumatio_positivo= sumatio_positivo + vector[i];
            }
            if (vector[i]<0){
                sumatorio_negativo = sumatorio_negativo + vector[i];
            }
        }
        System.out.println("Los numeros positivos sumados son "+ sumatio_positivo+ " Los numeros negativos sumados son "+ sumatorio_negativo);
    }}
