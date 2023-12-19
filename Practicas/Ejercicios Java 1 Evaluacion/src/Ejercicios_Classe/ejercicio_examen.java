package Ejercicios_Classe;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicio_examen {
    public static void main(String[] args) {
        System.out.println("++++++opciones+++++\n" +
                " 1. Indicar medidas del array\n" +
                "2. Calcular la media del array\n" +
                "3. Calcularcuantos numeros mas altos que n\n" +
                "4. Mostrar el array\n" +
                "5. Apagar");
        Scanner entrada = new Scanner(System.in);
        int Num = entrada.nextInt();
        int []array=new int[0];

        if(Num ==1){
            System.out.println("Dime cuanto quieres que sea la longitud del array?");
             int N = entrada.nextInt();
             array=new int[N];
             for(int i=0; i <array.length;i++){
                 array[i]=(int) (-50+ Math.random()*(50 -(-50)+1));
             }
            System.out.println("Que programa quieres utilizar ahora ");
             Num= entrada.nextInt();
        }if (Num== 2) {
            int sumatorio=0;
            int media;
            for(int i=0; i < array.length;i++){
                sumatorio += array[i];
            }
            media = sumatorio/ array.length;
            System.out.println(" La media es "+media );
            System.out.println("Que programa quieres utilizar ahora ");
            Num= entrada.nextInt();
        } if (Num==3) {
            System.out.println("Dime un Numero y te dire cuantos arrays con un numero mas alto hay?");
            int X = entrada.nextInt();
            int cuenta=0;
            for(int i=0; i < array.length;i++){
                if(array[i]> X){
                    cuenta++;
                }
            }
            System.out.println("HAY "+cuenta+"Numerlos mas altos que "+X+"en el array");
            System.out.println("Que programa quieres utilizar ahora ");
            Num= entrada.nextInt();
        }if( Num==4){
            for (int elemento:array ){
                System.out.print(elemento + " , ");
            }
            System.out.println("Que programa quieres utilizar ahora ");
            Num= entrada.nextInt();
            } if (Num == 5) {
            System.out.println("Good bye");
        }else{
            System.out.println("Numero no valido ");
            System.out.println("Que programa quieres utilizar ahora ");
            Num= entrada.nextInt();

        }
    }

    }
