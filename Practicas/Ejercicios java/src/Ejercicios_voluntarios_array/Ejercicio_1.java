package Ejercicios_voluntarios_array;

import javax.swing.*;

import java.util.Arrays;

import static javax.swing.JOptionPane.*;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int sumatorio= 0;
        int [] vector= new int[10];
        for(int i=0; i< vector.length;i++){
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número que quieres en la posición " + (i + 1)));
        }



    }
}
