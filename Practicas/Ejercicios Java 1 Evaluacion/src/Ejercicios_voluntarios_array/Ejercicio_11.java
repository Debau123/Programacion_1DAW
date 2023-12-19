package Ejercicios_voluntarios_array;

public class Ejercicio_11 {
    public static void main(String[] args) {
        int []array=new int[100];
        int []array_2=new int [100];
        int z=1;
        for(int i =0; i < array.length;i++){
             array[i]=z;
            z++;
        }for(int i =0; i < array.length;i++){
            array_2[i]= array[array.length-1-i];
        }
        for(int elemento: array) {
            System.out.print(elemento + " , ");
        }
        System.out.println();
        for(int elemento2: array_2){
            System.out.print(elemento2+ " , ");
        }


        }
    }

