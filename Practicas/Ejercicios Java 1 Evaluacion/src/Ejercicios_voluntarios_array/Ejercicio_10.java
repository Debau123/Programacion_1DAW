package Ejercicios_voluntarios_array;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;;
public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantas personas quieres que midamos ?");
        int personas = entrada.nextInt();
        double[] medidas = new double[personas];

        for (int i = 0; i < personas; i++) {
            System.out.println("Cuanto mide la " + (i + 1) + " persona?");
            medidas[i] = entrada.nextDouble();
        }
        double sumatorio = 0;
        double alto = medidas[0];
        double bajo = medidas[0];
        double media;
        for (int i = 0; i < personas; i++) {
            sumatorio += medidas[i];
            if (medidas[i] < medidas[0]) {
                bajo = medidas[i];
            }if (medidas[i] > medidas[0]) {
                alto = medidas[i];
            }
        }media = sumatorio / personas;
        int contador_bajo =0;
        int contador_alto=0;
        for(int i=0; i< medidas.length;i++){
            if(medidas[i]>media){
                contador_alto++;
            }if(medidas[i]<media){
                contador_bajo++;
            }
        }
        System.out.println("La media es "+media);
        System.out.println("La mas baja es "+bajo);
        System.out.println("La mas alta es "+alto);
        System.out.println("Hay "+contador_alto+" personas mas altas que la media");
        System.out.println("Hay "+contador_bajo+" personas mas bajas que la media");
    }
}
