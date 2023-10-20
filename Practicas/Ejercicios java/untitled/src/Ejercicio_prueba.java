
import java.util.Scanner;

public class Ejercicio_prueba {
    public static void main(String[] args) {
        Scanner Entrada=new Scanner(System.in);
        System.out.println("Que cara a salido al dado");
        int cara_dado = Entrada.nextInt();
        if (cara_dado == 6){
            System.out.println("El lado opuesto es uno");}
        else if (cara_dado == 5){
            System.out.println("El lado opuesto es dos");}
        else if(cara_dado == 4){
            System.out.println("El lado opuesto es tres");}
        else if  (cara_dado == 3){
            System.out.println("El lado opuesto es cuatro");}
        else if  (cara_dado == 2){
            System.out.println("El lado opuesto es cinco");}
        else if  (cara_dado == 1 ){
            System.out.println("El lado opuesto es seis");}
        else {
            System.out.println("Error: Numero incorrecto");}
}
}
