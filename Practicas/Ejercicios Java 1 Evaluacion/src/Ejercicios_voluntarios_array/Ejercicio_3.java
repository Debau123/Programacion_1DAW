package Ejercicios_voluntarios_array;

import javax.swing.*;

public class Ejercicio_3 {
    public static void main(String[] args) {
        int [] vector= new int[10];
        for(int i=0; i< vector.length;i++){
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número que quieres en la posición " + (i + 1)));
        }
        int mayor =vector[0];
        int minimo =vector[0] ;
        for (int i=0; i < vector.length; i++){
            if ( minimo > vector[i]){
                minimo = vector[i];
            } else if (mayor <vector[i]) {
                mayor =vector[i];
            }
        }
        System.out.println( "El minimo es "+ minimo +" El mayor es "+ mayor);
    }
}
