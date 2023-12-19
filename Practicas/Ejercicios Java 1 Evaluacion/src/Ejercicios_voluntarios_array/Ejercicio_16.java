package Ejercicios_voluntarios_array;
import java.util.Arrays;

public class Ejercicio_16 {
    public static void main(String[] args) {
        int cuantos=0;
        for (int i=1;i<=10;i++){
            cuantos += i;
        }
        System.out.println(cuantos);

        int []array= new int[cuantos];
        int posicion =0;

        for (int i =1; i<=10;i++){
        Arrays.fill(array,posicion,posicion+i,i);
        posicion += i;
        }
      for(int elemento: array){
          System.out.print(elemento+" , ");

        }



    }







}
