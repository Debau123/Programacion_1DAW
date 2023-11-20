package Ejercicios_array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Ejercicio_entregable_4arrays {
    public static void main(String[] args) {
        int []vector_1=new int[20];
        int []vector_2=new int[20];
        int []vector_3=new int[40];
        int []vector_4=new int[40];

        for(int i=0;i< vector_1.length;i++){
            vector_1[i]=(int)(Math.random()*21);
        }
        for (int i=0;i< vector_2.length;i++) {
            vector_2[i] = vector_1[vector_1.length - 1 - i];
        }
        System.arraycopy(vector_1,0, vector_3,0,vector_1.length);
        System.arraycopy(vector_2, 0, vector_3,20,vector_2.length);

        for (int i=0;i<vector_4.length;i++){
            if (i%2==0){
                vector_4[i]=vector_1[i/2];
            }else{
                vector_4[i]=vector_2[i/2];
            }
        }


        for(int elemento:vector_1) {
            System.out.print(elemento + "  ");
        }
        System.out.println();
        for(int elemento:vector_2){
            System.out.print(  elemento+ "  ");}

        System.out.println();
        for(int elemento:vector_3){
            System.out.print(  elemento+ "  ");}
        System.out.println();
        for(int elemento:vector_4){
            System.out.print(  elemento+ "  ");}

        }
    }

