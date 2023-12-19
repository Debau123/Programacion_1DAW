package Ejercicios_Classe;

import java.util.Arrays;

public class ordenar_array {
    public static void main(String[] args) {
        int  []vector_1=new int[5];
        for(int i=0;i< vector_1.length;i++){
            vector_1[i]=(int) (Math.random()*21);
        }
        for(int elemento:vector_1){
            System.out.print(elemento+"  ");
        }
        Arrays.sort(vector_1);
        for (int i = 0; i < vector_1.length / 2; i++) {
            int temp = vector_1[i];
            vector_1[i] = vector_1[vector_1.length - 1 - i];
            vector_1[vector_1.length - 1 - i] = temp;
        }
        System.out.println("\nArray ordenado de forma descendente:");
        for (int elemento : vector_1) {
            System.out.print(elemento + " ");

    }}}

