package Ejercicios_voluntarios_array;

import javax.swing.*;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int [] vector= new int[10];
        for(int i=0; i< vector.length;i++){
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número que quieres en la posición " + (i + 1)));
        }
        int sumatorio =0;
        for (int i=0; i < vector.length; i++){
            sumatorio = sumatorio + vector[i];
        }
        System.out.println(sumatorio);
    }

}
