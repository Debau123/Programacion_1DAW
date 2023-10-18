import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner Entrada1 = new Scanner(System.in);
        int numero1;
        System.out.println("Escribe un numero");
        numero1 = Entrada1.nextInt();
        Scanner Entrada2 = new Scanner(System.in);
        int numero2;
        System.out.println("Escribe otro numero");
        numero2 = Entrada2.nextInt();
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multi = numero1 * numero2;
        int division = numero1 / numero2;
        System.out.println("La suma es "+ suma + " La resta es "+ resta +" La multiplicacion es "+ multi +" La division es "+ division );
    }
}


