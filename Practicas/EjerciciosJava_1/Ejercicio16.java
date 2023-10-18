import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        double nota;
        Scanner Entrada1 = new Scanner(System.in);
        System.out.println("Introduce la nota: ");
        nota = Entrada1.nextDouble();
        if (nota < 3) {
            System.out.println("Has sacado un muy deficiente");
        } else if (nota < 5) {
            System.out.println("Has sacado un insuficiente");
        } else if (nota <=6){
            System.out.println("Has sacado un bien");
        } else if (nota < 9) {
            System.out.println("Has sacado un notable");
        } else if (nota <= 10){
            System.out.println("Has sacado un Excelente");
        }
        else
            System.out.println("Nota no valida");
    }
}
