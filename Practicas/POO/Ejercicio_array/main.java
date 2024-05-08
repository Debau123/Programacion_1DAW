package Ejercicio_array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {

    public static class Mazo {
        private ArrayList<Carta> cartas;

        public Mazo(int capacidad) {
            cartas = new ArrayList<Carta>(capacidad);
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < capacidad; i++) {
                System.out.println("Introduce el palo de la carta:");
                String palo = scanner.nextLine();
                System.out.println("Introduce el número de la carta:");
                int numero = scanner.nextInt();
                scanner.nextLine(); // Consume la nueva línea pendiente después de nextInt()
                cartas.add(new Carta(palo, numero));

            }
        }
        public void imprimirMazo() {
            for (Carta carta : cartas) {
                carta.imprimircarta();
            }
        }
        public void remenar() {
            Collections.shuffle(cartas);
        }
    }

    public static void main(String[] args) {

        Mazo mazo1 = new Mazo(8);
        mazo1.imprimirMazo();
        mazo1.remenar();
        mazo1.imprimirMazo();


    }
}

