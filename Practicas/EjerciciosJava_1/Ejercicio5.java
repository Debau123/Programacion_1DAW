
import java.lang.Math;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Introduce la longitud de un radio de la circunferencia:");
        double Radio = entrada1.nextInt();

                double Long = (Radio * 2) * Math.PI;
                double radioalcuadrado = Math.pow(Radio, 2);
                double Area = radioalcuadrado * Math.PI;
                double Volumen = (4.0/3.0) * Math.PI * Math.pow(Radio, 3);
     System.out.println("\nLa longitud de la circunferencia es  "+ Long + "\n El area es "+ Area+"\n El volumen es:" + Volumen);


    }
}